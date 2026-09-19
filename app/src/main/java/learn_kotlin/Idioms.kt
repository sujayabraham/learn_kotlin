package learn_kotlin

fun demonstrateExecuteIfNull() {
    println("--- Idiom: Execute an expression if null ---")

    // 1. Basic usage with throw
    val values = mapOf("name" to "Kotlin")
    try {
        val email = values["email"] ?: throw IllegalStateException("Email is missing!")
        println("Email: $email")
    } catch (e: IllegalStateException) {
        println("Caught expected error: ${e.message}")
    }

    // 2. Usage with run for complex fallback logic
    val files: List<String>? = null
    val filesSize = files?.size ?: run {
        println("Files list is null, calculating fallback size...")
        val fallbackSize = 10
        fallbackSize * 2
    }
    println("Calculated filesSize: $filesSize")
}
