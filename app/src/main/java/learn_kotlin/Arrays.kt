package learn_kotlin

// 1. Creating Arrays
fun demonstrateArrayCreation() {
    println("--- Array Creation ---")
    val simpleArray = arrayOf(1, 2, 3)
    println("arrayOf(1, 2, 3): ${simpleArray.contentToString()}")
    
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println("arrayOfNulls(3): ${nullArray.contentToString()}")
    
    val zeroes = Array(3) { 0 }
    println("Array(3) { 0 }: ${zeroes.contentToString()}")
    
    val squares = Array(5) { i -> i * i }
    println("Array(5) { i -> i * i }: ${squares.contentToString()}")
}

// 2. Accessing and Modifying
fun demonstrateArrayAccess() {
    println("\n--- Accessing and Modifying ---")
    val arr = arrayOf(10, 20, 30)
    arr[0] = 100
    println("First element modified: ${arr[0]}")
    
    val fillArr = IntArray(5)
    fillArr.fill(1)
    println("Filled with 1s: ${fillArr.contentToString()}")
    fillArr.fill(0, 1, 4) // Indices 1, 2, 3
    println("Partial fill with 0s: ${fillArr.contentToString()}")
}

// 3. Properties and Functions
fun demonstrateArrayProperties() {
    println("\n--- Array Properties ---")
    val arr = arrayOf("A", "B", "C")
    println("Size: ${arr.size}")
    println("Last Index: ${arr.lastIndex}")
    println("Indices: ${arr.indices}")
    println("Contains 'B': ${arr.contains("B")}")
}

// 4. Primitive-Type Arrays
fun demonstratePrimitiveArrays() {
    println("\n--- Primitive-Type Arrays ---")
    // Avoids boxing overhead
    val intArray = intArrayOf(1, 2, 3)
    println("intArrayOf: ${intArray.contentToString()}")
    
    val doubleArray = DoubleArray(3) { 1.1 * (it + 1) }
    println("DoubleArray(3): ${doubleArray.contentToString()}")
}

// 5. Comparing Arrays
fun demonstrateArrayComparison() {
    println("\n--- Array Comparison ---")
    val a1 = arrayOf(1, 2, 3)
    val a2 = arrayOf(1, 2, 3)
    
    println("a1 == a2 (Referential): ${a1 == a2}") // false
    println("a1.contentEquals(a2) (Structural): ${a1.contentEquals(a2)}") // true
    
    val nested1 = arrayOf(arrayOf(1, 2), arrayOf(3, 4))
    val nested2 = arrayOf(arrayOf(1, 2), arrayOf(3, 4))
    println("nested1.contentDeepEquals(nested2): ${nested1.contentDeepEquals(nested2)}") // true
}

// 6. Varargs and Spread Operator
fun printStrings(vararg strings: String) {
    println("Printing varargs: ${strings.joinToString()}")
}

fun demonstrateSpreadOperator() {
    println("\n--- Spread Operator ---")
    val arr = arrayOf("Kotlin", "Java")
    printStrings("C++", *arr, "Python") // *arr spreads the array into individual arguments
}

// 7. Nested Arrays
fun demonstrateNestedArrays() {
    println("\n--- Nested Arrays ---")
    val matrix = Array(2) { row ->
        IntArray(3) { col -> row + col }
    }
    println("Multidimensional Matrix: ${matrix.contentDeepToString()}")
}

fun demonstrateArrays() {
    demonstrateArrayCreation()
    demonstrateArrayAccess()
    demonstrateArrayProperties()
    demonstratePrimitiveArrays()
    demonstrateArrayComparison()
    demonstrateSpreadOperator()
    demonstrateNestedArrays()
}
