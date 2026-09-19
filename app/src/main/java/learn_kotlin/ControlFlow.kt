package learn_kotlin

import kotlin.random.Random

fun demonstrateIf() {
    println("--- If Expression ---")
    val a = 1
    val b = 2
    val max = if (a > b) a else b
    println("Max of $a and $b is $max")
}

fun demonstrateWhen() {
    println("\n--- When Expression ---")
    val obj = "Hello"
    
    // As a statement
    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
    
    // As an expression
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println("Result from when: $result")
    
    // Without subject
    val trafficLightState = "Green"
    val action = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println("Traffic action: $action")
}

fun demonstrateRanges() {
    println("\n--- Ranges and Progressions ---")
    print("1..4: ")
    for (i in 1..4) print("$i ")
    
    print("\n1..<4: ")
    for (i in 1..<4) print("$i ")
    
    print("\n4 downTo 1: ")
    for (i in 4 downTo 1) print("$i ")
    
    print("\n1..5 step 2: ")
    for (i in 1..5 step 2) print("$i ")
    println()
}

fun demonstrateLoops() {
    println("\n--- Loops ---")
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    
    var cakesEaten = 0
    while (cakesEaten < 2) {
        println("Eating cake...")
        cakesEaten++
    }
    
    var cakesBaked = 0
    do {
        println("Baking cake...")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun runControlFlowExercises() {
    println("\n--- Control Flow Exercises ---")
    
    // Dice match
    val firstResult = Random.nextInt(6) + 1
    val secondResult = Random.nextInt(6) + 1
    print("Dice: $firstResult, $secondResult -> ")
    if (firstResult == secondResult) println("You win :)") 
    else println("You lose :(")
    
    // Button mapping
    val button = "A"
    val buttonAction = when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    println("Button $button action: $buttonAction")
    
    // Fizz Buzz (subset)
    println("FizzBuzz (1..15):")
    for (number in 1..15) {
        print(when {
            number % 15 == 0 -> "fizzbuzz "
            number % 3 == 0 -> "fizz "
            number % 5 == 0 -> "buzz "
            else -> "$number "
        })
    }
    println()
    
    // List filtering
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    print("Words starting with 'l': ")
    for (w in words) {
        if (w.startsWith("l")) print("$w ")
    }
    println()
}
