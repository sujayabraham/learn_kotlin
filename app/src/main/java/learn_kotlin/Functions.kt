package learn_kotlin

import kotlin.math.PI

fun sumNumbers(x: Int, y: Int): Int {
    return x + y
}

@JvmOverloads
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// Single-expression function
fun sumSingle(x: Int, y: Int) = x + y

// Exercise: Circle Area
fun circleArea(radius: Int): Double = PI * radius * radius

// Exercise: Default values and named arguments
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

fun demonstrateLambdas() {
    println("--- Lambdas ---")
    val upperCaseString = { text: String -> text.uppercase() }
    println("Uppercase 'hello': ${upperCaseString("hello")}")
    
    val numbers = listOf(1, -2, 3)
    val positives = numbers.filter { x -> x > 0 }
    println("Positives in $numbers: $positives")
    
    val total = listOf(1, 2, 3).fold(0) { x, item -> x + item }
    println("Fold result (sum of 1,2,3): $total")
}

fun runFunctionsExercises() {
    println("\n--- Functions Exercises ---")
    
    // Interval exercise
    println("1 min 25 sec in seconds: ${intervalInSeconds(minutes = 1, seconds = 25)}")
    println("2 hours in seconds: ${intervalInSeconds(hours = 2)}")
    
    // Lambda URLs exercise
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println("Generated URLs: $urls")
    
    // Higher-order function
    println("Repeating action 3 times:")
    repeatN(3) {
        println("  Repeat!")
    }
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}
