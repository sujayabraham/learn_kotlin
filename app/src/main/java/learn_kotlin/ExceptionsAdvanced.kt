package learn_kotlin

// 1. Basic Try-Catch-Finally Structure
fun demonstrateTryCatchFinally() {
    println("--- Basic Try-Catch-Finally ---")
    try {
        val data = 10 / 0
        println("Result: $data")
    } catch (e: ArithmeticException) {
        println("Caught arithmetic error: ${e.message}")
    } finally {
        println("Finally block executed: cleaning resources.")
    }
}

// 2. Try as an Expression
fun demonstrateTryExpression() {
    println("\n--- Try as an Expression ---")
    val input = "not_a_number"
    
    // In Kotlin, 'try' is an expression that yields a value
    val result: Int? = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        null
    }
    
    println("Result of try expression for '$input': $result")
}

// 3. The Nothing Type and Throwing Expressions
fun demonstrateNothingType(inputName: String?) {
    println("\n--- The Nothing Type and Throwing Expressions ---")
    
    // 'throw' is an expression in Kotlin, and its type is the special type Nothing
    val s = inputName ?: throw IllegalArgumentException("Name required")
    println("Successfully processed valid name: $s")
}

// 4. Custom Exceptions
class CustomBusinessException(message: String) : Exception(message)

fun demonstrateCustomException() {
    println("\n--- Custom Exceptions ---")
    try {
        throw CustomBusinessException("Insufficient funds in account balance.")
    } catch (e: CustomBusinessException) {
        println("Caught app-specific exception: ${e.message}")
    }
}

fun demonstrateExceptionsAdvanced() {
    demonstrateTryCatchFinally()
    demonstrateTryExpression()
    
    // Test Nothing type / throwing expression safely with a try block
    try {
        demonstrateNothingType(null)
    } catch (e: IllegalArgumentException) {
        println("Caught expected Nothing-type throw: ${e.message}")
    }
    
    demonstrateCustomException()
}
