package learn_kotlin

// 1. Type Checks with 'is' and '!is'
fun demonstrateTypeChecks() {
    println("--- Type Checks ('is' and '!is') ---")
    val obj: Any = "Hello, Kotlin"
    
    if (obj is String) {
        println("obj is a String of length ${obj.length}")
    }
    
    if (obj !is Int) {
        println("obj is not an Int")
    }
}

// 2. Smart Casts
fun demonstrateSmartCasts() {
    println("\n--- Smart Casts ---")
    val x: Any = "Smart Cast Example"
    
    // Smart cast in if expression
    if (x is String) {
        // x is automatically cast to String on the right-hand side of 'is'
        println("Smart cast in 'if': ${x.uppercase()}")
    }
    
    // Smart cast in right-hand side of &&
    // x is automatically cast to String on the right of &&
    if (x is String && x.length > 5) {
        println("Smart cast in '&&': length is ${x.length}")
    }
    
    // Smart cast in when expression
    when (x) {
        is Int -> println("It's an Int: ${x + 1}")
        is String -> println("It's a String: ${x.lowercase()}")
        else -> println("Unknown type")
    }
}

// 3. Unsafe Cast Operator 'as'
fun demonstrateUnsafeCasts() {
    println("\n--- Unsafe Cast Operator ('as') ---")
    val y: Any = "123"
    
    // Successful cast
    val str: String = y as String
    println("Unsafe cast successful: $str")
    
    // Unsafe cast with null handling
    val nullableObj: Any? = null
    // val nonNullStr: String = nullableObj as String // This would throw NullPointerException
    val nullableStr: String? = nullableObj as String? // Must be cast to nullable type if value can be null
    println("Unsafe cast with null: $nullableStr")
    
    // Demonstration of failure (wrapped in try-catch to prevent crash)
    try {
        val intVal: Int = y as Int
        println("This won't be printed: $intVal")
    } catch (e: ClassCastException) {
        println("Unsafe cast failed as expected: ${e.message}")
    }
}

// 4. Safe Cast Operator 'as?'
fun demonstrateSafeCasts() {
    println("\n--- Safe Cast Operator ('as?') ---")
    val z: Any = "Not an Int"
    
    // Safe cast returns null if the cast is not possible
    val intVal: Int? = z as? Int
    println("Safe cast result (String as? Int): $intVal")
    
    val strVal: String? = z as? String
    println("Safe cast result (String as? String): $strVal")
}

// 5. Generics Type Erasure and Casts
fun demonstrateGenericCasts() {
    println("\n--- Generics Type Erasure and Casts ---")
    val list: Any = listOf("a", "b", "c")
    
    // Can check if it's a List of any elements using star projection
    if (list is List<*>) {
        println("Successfully checked that obj is a List using star projection")
    }
    
    // Unchecked cast due to type erasure at runtime
    @Suppress("UNCHECKED_CAST")
    val stringList = list as List<String>
    println("Unchecked cast to List<String>: First element is '${stringList[0]}'")
}

fun demonstrateTypeCasts() {
    demonstrateTypeChecks()
    demonstrateSmartCasts()
    demonstrateUnsafeCasts()
    demonstrateSafeCasts()
    demonstrateGenericCasts()
}
