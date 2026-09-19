package learn_kotlin

// 1. Everything is an object
fun demonstrateObjectNature() {
    println("--- Everything is an Object ---")
    val x = 10
    println("10.plus(5) = ${x.plus(5)}") // Calling a method on an Int
    println("10.toString() = ${x.toString()}")
}

// 2. Basic Categories
fun demonstrateBasicTypes() {
    println("\n--- Basic Type Categories ---")
    
    // Numbers
    val i: Int = 100
    val d: Double = 3.14
    val f: Float = 2.71f
    val l: Long = 1000L
    
    // Booleans
    val isKotlinFun: Boolean = true
    
    // Characters
    val char: Char = 'K'
    
    // Strings
    val str: String = "Kotlin"
    
    // Arrays
    val arr: Array<Int> = arrayOf(1, 2, 3)
    
    println("Numbers: $i, $d, $f, $l")
    println("Boolean: $isKotlinFun")
    println("Char: $char")
    println("String: $str")
    println("Array: ${arr.contentToString()}")
}

// 3. Special Types
fun demonstrateSpecialTypes() {
    println("\n--- Special Types ---")
    
    // Any: The root of the Kotlin class hierarchy
    val something: Any = "I can be anything"
    println("Any: $something")
    
    // Unit: Returns no meaningful value (similar to void in Java)
    val unitResult: Unit = println("This returns Unit")
    println("Unit result: $unitResult")
}

// Nothing type (cannot be instantiated, represents a value that never exists)
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun demonstrateTypesOverview() {
    demonstrateObjectNature()
    demonstrateBasicTypes()
    demonstrateSpecialTypes()
    
    println("\n--- Nothing Type ---")
    println("The 'Nothing' type is used for functions that always throw exceptions or loop forever.")
    // fail("Testing Nothing") // This would stop execution
}
