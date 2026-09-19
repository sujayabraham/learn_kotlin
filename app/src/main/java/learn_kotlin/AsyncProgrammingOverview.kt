package learn_kotlin

import java.util.concurrent.CompletableFuture
import kotlin.concurrent.thread

// 1. Threading approach
// Traditional way: Spawning OS threads.
// Problem: Threads are expensive and limited in number.
fun demonstrateThreading() {
    println("--- Async: Threading ---")
    thread {
        Thread.sleep(100) // Simulating network delay
        println("Executed on thread: ${Thread.currentThread().name}")
    }
}

// 2. Callbacks approach
// Common in JavaScript and early Android.
// Problem: Leads to "Callback Hell" (nested indentations) and difficult error handling.
fun fetchAsyncData(callback: (String) -> Unit) {
    thread {
        Thread.sleep(100)
        callback("Data from Server")
    }
}

fun demonstrateCallbacks() {
    println("\n--- Async: Callbacks ---")
    fetchAsyncData { data ->
        println("Received via callback: $data")
        // Nested callback would go here...
    }
}

// 3. Futures / Promises approach
// Introduced in Java 8 (CompletableFuture).
// Problem: Better but still involves complex combinators and chaining.
fun demonstrateFutures() {
    println("\n--- Async: Futures (CompletableFuture) ---")
    val future = CompletableFuture.supplyAsync {
        Thread.sleep(100)
        "Future Result"
    }
    future.thenAccept { println("Received via Future: $it") }
}

// 4. Coroutines Concept (Overview)
// Recommended Kotlin approach. 
// Note: This is a high-level conceptual look. Real coroutines use 'suspend' functions.
// Benefit: Asynchronous code that looks and behaves like synchronous code.
fun demonstrateAsyncOverview() {
    println("--- Kotlin Asynchronous Programming Overview ---")
    
    demonstrateThreading()
    demonstrateCallbacks()
    demonstrateFutures()
    
    // Wait slightly for async threads to finish in this demo
    Thread.sleep(500)
}
