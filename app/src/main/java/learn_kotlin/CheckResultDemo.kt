package learn_kotlin

// 1. Defining functions utilizing @CheckResult annotation indicators
// In modern Kotlin, the compiler provides built-in linter and static inspection analysis warnings
// when a function's return value is ignored by the caller, signaling potential logic errors.
@CheckResult
fun calculateSecureHash(input: String): String {
    return "HASH_${input.hashCode()}"
}

@CheckResult
fun createUpdatedUserRecord(baseName: String): String {
    return "User: $baseName (Status: Active)"
}

// Custom annotation definition to mock the standard androidx or compiler static warning annotation
annotation class CheckResult

fun demonstrateUnusedReturnValueChecker() {
    println("--- Unused Return Value Checker ---")

    // Correct Usage: Capturing and using the function's return value expression
    val secureToken = calculateSecureHash("AdminPassword123")
    println("Successfully captured token: $secureToken")

    val userRecord = createUpdatedUserRecord("Alice")
    println("Successfully captured record: $userRecord")

    // Discussion scenario: In real lint-enabled Android/Kotlin workflows, 
    // calling these functions as standalone statements without assigning the result:
    //
    // calculateSecureHash("TestIgnore") 
    //
    // will immediately trigger a static compiler toolchain warning:
    // "The return value of this function must be used."
    println("Static checker ensures functions with pure return results are never ignored.")
}
