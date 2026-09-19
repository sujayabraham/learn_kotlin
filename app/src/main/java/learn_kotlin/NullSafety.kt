package learn_kotlin

fun demonstrateNullableTypes() {
    println("--- Nullable Types ---")
    var neverNull: String = "This can't be null"
    // neverNull = null // Compiler error
    
    var nullable: String? = "You can keep a null here"
    nullable = null // This is OK
    
    println("neverNull: $neverNull")
    println("nullable: $nullable")
}

fun describeString(maybeString: String?): String {
    return if (maybeString != null && maybeString.length > 0) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}

fun demonstrateSafeCalls(maybeString: String?) {
    println("\n--- Safe Calls ---")
    // Safe call operator ?. returns the value or null
    val length: Int? = maybeString?.length
    println("Length of '$maybeString' is $length")
    
    // Safe call with function
    println("Uppercase of '$maybeString' is ${maybeString?.uppercase()}")
}

fun demonstrateElvisOperator(maybeString: String?) {
    println("\n--- Elvis Operator ---")
    // Elvis operator ?: provides a default value
    val length: Int = maybeString?.length ?: 0
    println("Length of '$maybeString' (or 0 if null) is $length")
}

fun employeeById(id: Int): Employee? = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int): Int = employeeById(id)?.salary ?: 0

fun runNullSafetyExercise() {
    println("\n--- Null Safety Exercise ---")
    val ids = 1..5
    val totalSalary = ids.sumOf { id -> salaryById(id) }
    println("Total salary for IDs 1..5: $totalSalary")
}
