package learn_kotlin

import kotlinx.coroutines.*

// 1. Basic Coroutine (Launch)
// GlobalScope is used here for simplicity in a main-thread demo, 
// though generally not recommended for production code.
fun demonstrateBasicCoroutine() {
    println("--- Coroutines: Basic Launch ---")
    
    // Launch a new coroutine in the background and continue
    GlobalScope.launch {
        delay(500L) // non-blocking delay for 500ms (default time unit is ms)
        println("World! (from coroutine on thread: ${Thread.currentThread().name})")
    }
    
    print("Hello, ") // main thread continues while coroutine is delayed
}

// 2. Suspending Functions
// The 'suspend' keyword allows a function to pause execution without blocking the underlying thread.
suspend fun doNetworkRequest(): String {
    delay(1000L) // simulate network delay
    return "Data from Coroutine Network Request"
}

fun demonstrateSuspendingFunctions() = runBlocking {
    println("\n--- Coroutines: Suspending Functions ---")
    
    val result = doNetworkRequest()
    println("Received: $result")
}

// 3. Structured Concurrency (CoroutineScope)
// runBlocking bridges regular blocking code and coroutines.
fun demonstrateStructuredConcurrency() = runBlocking {
    println("\n--- Coroutines: Structured Concurrency ---")
    
    // this: CoroutineScope
    launch { 
        delay(200L)
        println("Task 1 finished")
    }
    
    launch {
        delay(100L)
        println("Task 2 finished")
    }
    
    println("Tasks launched, waiting...")
}

// 4. Lightweight Nature
// Spawning 100,000 coroutines vs 100,000 threads.
fun demonstrateLightweight() = runBlocking {
    println("\n--- Coroutines: Lightweight Nature ---")
    
    val n = 10_000
    val start = System.currentTimeMillis()
    
    val jobs = List(n) {
        launch {
            delay(100L)
        }
    }
    
    jobs.forEach { it.join() }
    val end = System.currentTimeMillis()
    println("Finished $n coroutines in ${end - start} ms")
}

fun demonstrateCoroutinesOverview() {
    println("--- Kotlin Coroutines Overview ---")
    
    demonstrateBasicCoroutine()
    
    // Wait for the first GlobalScope.launch to finish since it's not joined
    Thread.sleep(1000L)
    
    demonstrateSuspendingFunctions()
    demonstrateStructuredConcurrency()
    demonstrateLightweight()
}
