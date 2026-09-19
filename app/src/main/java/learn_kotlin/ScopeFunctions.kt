package learn_kotlin

// Mock classes for demonstration
class Configuration {
    var host: String = ""
    var port: Int = 0
    fun connect() = println("Connecting to $host:$port")
}

fun demonstrateLet() {
    println("--- let ---")
    val name: String? = "Kotlin"
    val length = name?.let {
        println("The string is $it")
        it.length // returns lambda result
    }
    println("Result of let: $length")
}

fun demonstrateApply() {
    println("\n--- apply ---")
    // Returns the context object
    val config = Configuration().apply {
        host = "localhost"
        port = 8080
        connect()
    }
    println("Configured host: ${config.host}")
}

fun demonstrateRun() {
    println("\n--- run ---")
    // Returns the lambda result
    val status = Configuration().run {
        host = "127.0.0.1"
        port = 9000
        connect()
        "Connected Successfully"
    }
    println("Run result: $status")
}

fun demonstrateAlso() {
    println("\n--- also ---")
    // Returns the context object, used for side effects like logging
    val list = mutableListOf(1, 2, 3)
        .also { println("Original list: $it") }
        .map { it * 2 }
        .also { println("After mapping: $it") }
    println("Final list: $list")
}

fun demonstrateWith() {
    println("\n--- with ---")
    val config = Configuration()
    config.host = "server.com"
    config.port = 443
    
    // Calls multiple functions on an object
    with(config) {
        println("Working with $host")
        connect()
    }
}

// Exercise 2 implementation
data class ScopeUser(val id: Int, var email: String)

fun updateEmail(user: ScopeUser, newEmail: String): ScopeUser = user.apply {
    this.email = newEmail
}.also {
    println("Updating email for user with ID: ${it.id}")
}

fun demonstrateExercises() {
    println("\n--- Scope Functions Exercises ---")
    val user = ScopeUser(1, "old_email@example.com")
    println("Current User: $user")
    
    val updatedUser = updateEmail(user, "new_email@example.com")
    println("Updated User: $updatedUser")
}

fun runScopeFunctions() {
    demonstrateLet()
    demonstrateApply()
    demonstrateRun()
    demonstrateAlso()
    demonstrateWith()
    demonstrateExercises()
}
