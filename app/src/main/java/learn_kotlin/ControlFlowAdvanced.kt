package learn_kotlin

// 1. If Expression (as an expression returning a value)
fun demonstrateIfExpression() {
    println("--- If Expression ---")
    val a = 10
    val b = 20
    
    // In Kotlin, 'if' is an expression that returns a value
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("Max value is: $max")
}

// 2. When Expression & Arguments
fun demonstrateWhenExpression() {
    println("\n--- When Expression ---")
    val x = 2
    
    // Simple branch logic
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    
    // Combining multiple values into a single branch
    when (x) {
        0, 1 -> println("x is 0 or 1")
        else -> println("x is something else")
    }
    
    // Using expressions or dynamic values as branch conditions
    val s = "2"
    when (x) {
        s.toInt() -> println("s encodes x")
        else -> println("s does not encode x")
    }
}

// 3. Advanced When Checks (Ranges, Collections, Types)
fun demonstrateAdvancedWhen() {
    println("\n--- Advanced When Checks ---")
    val validNumbers = listOf(10, 20, 30)
    val x = 25
    
    // Check if within range or collection
    when (x) {
        in 1..10 -> println("x is in the range 1..10")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range 10..20")
        else -> println("None of the above")
    }
    
    // Using when as a replacement for an if-else chain (no argument provided)
    val number = 42
    when {
        number % 2 != 0 -> println("$number is odd")
        number == 42 -> println("The answer to life, the universe, and everything!")
        else -> println("$number is even")
    }
}

// 4. For Loops and Custom Range Stepping
fun demonstrateForLoops() {
    println("\n--- For Loops and Ranges ---")
    val collection = listOf("apple", "banana", "cherry")
    
    print("Iterating collection items: ")
    for (item in collection) {
        print("$item ")
    }
    println()
    
    print("Closed range (1..3): ")
    for (i in 1..3) print("$i ")
    println()
    
    print("Open-ended range (1 until 3): ")
    for (i in 1 until 3) print("$i ")
    println()
    
    print("Stepped range (6 downTo 0 step 2): ")
    for (i in 6 downTo 0 step 2) print("$i ")
    println()
    
    print("Iterating via indices: ")
    for (i in collection.indices) {
        print("item at $i is ${collection[i]}; ")
    }
    println()
}

// 5. While and Do-While Loops
fun demonstrateWhileLoops() {
    println("\n--- While and Do-While Loops ---")
    var x = 3
    print("While loop counting down: ")
    while (x > 0) {
        print("$x ")
        x--
    }
    println()
    
    var y = 0
    print("Do-while loop executing at least once: ")
    do {
        print("$y ")
        y++
    } while (y < 1)
    println()
}

fun demonstrateControlFlowAdvanced() {
    demonstrateIfExpression()
    demonstrateWhenExpression()
    demonstrateAdvancedWhen()
    demonstrateForLoops()
    demonstrateWhileLoops()
}
