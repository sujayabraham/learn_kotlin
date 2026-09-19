package learn_kotlin

// 1. Package and Imports are at the top

/**
 * 2. Standard and Single-expression functions
 */
fun sumTwo(a: Int, b: Int): Int {
    return a + b
}

fun sumTwoSingle(a: Int, b: Int) = a + b

/**
 * 3. Variables
 */
fun demonstrateSyntaxVariables() {
    println("--- Variables ---")
    val pi = 3.14 // Read-only
    var x = 0     // Mutable
    x += 1
    
    val c: Int
    c = 3 // Deferred initialization
    
    println("pi: $pi, x: $x, c: $c")
}

/**
 * 4. String Templates
 */
fun demonstrateSyntaxStringTemplates() {
    println("\n--- String Templates ---")
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

/**
 * 5. Conditional Expressions
 */
fun maxOfTwo(a: Int, b: Int) = if (a > b) a else b

fun describeAnything(obj: Any): String = when (obj) {
    1          -> "One"
    "Hello"    -> "Greeting"
    is Long    -> "Long"
    !is String -> "Not a string"
    else       -> "Unknown"
}

/**
 * 6. Loops and Ranges
 */
fun demonstrateLoopsAndRanges() {
    println("\n--- Loops and Ranges ---")
    val items = listOf("apple", "banana", "kiwifruit")
    
    // For loop
    print("Items: ")
    for (item in items) print("$item ")
    println()
    
    // Range with step
    print("Progression (1..10 step 2): ")
    for (x in 1..10 step 2) print("$x ")
    println()
    
    // Membership check
    val x = 5
    if (x in 1..10) println("$x is in range 1..10")
}

/**
 * 7. Type Checks and Smart Casts
 */
fun getStringLengthSafe(obj: Any): Int? {
    // Smart cast: obj is automatically cast to String after the 'is' check
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

/**
 * 8. Collections and Lambdas
 */
fun demonstrateCollectionFilters() {
    println("\n--- Collection Filters ---")
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
      .filter { it.startsWith("a") }
      .sortedBy { it }
      .map { it.uppercase() }
      .forEach { println("Filter result: $it") }
}

/* 
 * 9. Nested comments 
 * /* This is a nested comment */
 * This works in Kotlin!
 */

fun demonstrateBasicSyntax() {
    demonstrateSyntaxVariables()
    demonstrateSyntaxStringTemplates()
    
    println("\n--- Conditionals ---")
    println("Max of 10, 20: ${maxOfTwo(10, 20)}")
    println("Describe 'Hello': ${describeAnything("Hello")}")
    println("Describe 1L: ${describeAnything(1L)}")
    
    demonstrateLoopsAndRanges()
    
    println("\n--- Smart Casts ---")
    println("Length of 'Kotlin': ${getStringLengthSafe("Kotlin")}")
    println("Length of 123: ${getStringLengthSafe(123)}")
    
    demonstrateCollectionFilters()
}
