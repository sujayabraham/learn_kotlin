package learn_kotlin

// 1. Standard Inline Function
// The compiler copies the actual bytecode of this function directly to the call site, 
// eliminating the runtime overhead of creating an object instance for the lambda parameter.
inline fun <T> measureAndExecute(label: String, block: () -> T): T {
    val startTime = System.nanoTime()
    val result = block()
    val endTime = System.nanoTime()
    println("[$label] Executed in ${(endTime - startTime) / 1_000} μs")
    return result
}

// 2. Using noinline
// By default, all lambda parameters in an inline function are inlined. 
// Use 'noinline' if you want a specific lambda to remain a real object (e.g., to store it or pass it around).
inline fun executeMixedLambdas(
    inlinedBlock: () -> Unit,
    noinline persistentBlock: () -> Unit
) {
    inlinedBlock()
    // Since persistentBlock is marked 'noinline', it can be passed to another function or stored
    invokeLater(persistentBlock)
}

fun invokeLater(block: () -> Unit) {
    // Simulating keeping a reference to the lambda object
    print("Postponed lambda execution: ")
    block()
}

// 3. Using crossinline
// Use 'crossinline' to allow a lambda to be inlined even when it's invoked inside an execution 
// context that forbids non-local returns (like a nested anonymous object or local function).
inline fun runOnThreadFake(crossinline action: () -> Unit) {
    val runnable = object : Runnable {
        override fun run() {
            // A non-local return here would break the outer function's execution flow,
            // so 'crossinline' forces the caller lambda to only use local returns.
            action()
        }
    }
    runnable.run()
}

// 4. Reified Type Parameters
// Normally, types are erased at runtime on the JVM. 
// Combining 'inline' with 'reified' allows you to query the actual type parameter T directly at runtime.
inline fun <reified T> checkTypeAndPrint(item: Any) {
    if (item is T) {
        println("Item '$item' matches type: ${T::class.simpleName}")
    } else {
        println("Item '$item' does NOT match type: ${T::class.simpleName}")
    }
}

fun demonstrateInlineFunctions() {
    println("--- Inline Functions & Advanced Modifiers ---")

    // Test 1: Standard inline performance check
    val calculation = measureAndExecute("Math Performance") {
        var total = 0
        for (i in 1..100) {
            total += i
        }
        total
    }
    println("Calculation result: $calculation")

    // Test 2: noinline modifier check
    executeMixedLambdas(
        inlinedBlock = { println("Immediate inlined lambda code executed.") },
        persistentBlock = { println("Saved noinline lambda code executed.") }
    )

    // Test 3: crossinline compliance check
    runOnThreadFake {
        println("Crossinline execution wrapper operating cleanly.")
        // return // This would be a compilation error because of crossinline! Only local returns or none are allowed.
    }

    // Test 4: Reified type verification
    val testString: Any = "Kotlin Inline Power"
    checkTypeAndPrint<String>(testString)
    checkTypeAndPrint<Int>(testString)
}
