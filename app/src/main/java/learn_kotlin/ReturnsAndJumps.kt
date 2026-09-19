package learn_kotlin

// 1. Break and Continue with Labels
fun demonstrateLabelsBreakContinue() {
    println("--- Break and Continue with Labels ---")
    
    println("Using label with break:")
    outerLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                println("Breaking outer loop at i=$i, j=$j")
                break@outerLoop // Terminates the loop marked with outerLoop@
            }
            println("i = $i, j = $j")
        }
    }

    println("\nUsing label with continue:")
    outerLoop2@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                println("Continuing outer loop at i=$i, j=$j")
                continue@outerLoop2 // Proceeds to the next iteration of outerLoop2
            }
            println("i = $i, j = $j")
        }
    }
}

// 2. Return at Labels in Lambdas
fun demonstrateReturnAtLabels() {
    println("\n--- Return at Labels in Lambdas ---")
    val numbers = listOf(1, 2, 3, 4, 5)
    
    println("Using explicit label:")
    numbers.forEach lit@{
        if (it == 3) {
            println("Skipping 3 via explicit label return")
            return@lit // Local return to the caller of the lambda (acts like a continue)
        }
        println("Number: $it")
    }

    println("\nUsing implicit label (matching function name):")
    numbers.forEach {
        if (it == 3) {
            println("Skipping 3 via implicit label return")
            return@forEach // Local return matching the name of the function
        }
        println("Number: $it")
    }
}

// 3. Return from Anonymous Functions (Alternative to Lambda local returns)
fun demonstrateAnonymousFunctionReturn() {
    println("\n--- Return from Anonymous Functions ---")
    val numbers = listOf(1, 2, 3, 4, 5)

    println("Using anonymous function instead of lambda:")
    numbers.forEach(fun(value: Int) {
        if (value == 3) {
            println("Skipping 3 via normal return in anonymous function")
            return // Local return from the anonymous function itself
        }
        println("Value: $value")
    })
}

// 4. Returning a value with Labels
fun demonstrateReturnWithValueAtLabel() {
    println("\n--- Return with Value at Label ---")
    
    val result = run lit@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@lit "Found three!" // Returns this value from the run block
        }
        "Not found"
    }
    println("Result from labeled run block: $result")
}

fun demonstrateReturnsAndJumps() {
    demonstrateLabelsBreakContinue()
    demonstrateReturnAtLabels()
    demonstrateAnonymousFunctionReturn()
    demonstrateReturnWithValueAtLabel()
}
