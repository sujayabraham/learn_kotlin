package learn_kotlin

// 1. File-level declarations
// A Kotlin file can contain multiple classes, functions, and properties at the top level.
val FILE_CONSTANT = "v1.0"

fun topLevelFunction() = println("Top-level function executed")

class GrammarSubject {
    // 2. Declaration vs. Assignment
    // Properties must be initialized or abstract
    var state: String = "Initial"
        set(value) {
            println("Grammar check: Setting state to $value")
            field = value
        }

    // 3. Local Functions
    // Functions can be nested inside other functions
    fun outerFunction() {
        val outerVar = "Outer"
        
        fun localFunction(suffix: String) {
            println("Local function accessing '$outerVar' with suffix '$suffix'")
        }

        localFunction("Test")
    }
}

// 4. Expressions vs. Statements
// In Kotlin, many constructs are expressions (return a value)
fun demonstrateExpressions(x: Int) {
    // 'if' is an expression
    val result = if (x > 0) "Positive" else "Negative"

    // 'try' is an expression
    val number = try {
        "123".toInt()
    } catch (e: Exception) {
        -1
    }

    println("Expression results: if=$result, try=$number")
}

fun demonstrateGrammar() {
    println("--- Kotlin Grammar & Syntax Nuances ---")

    // Test 1: File-level usage
    println("File constant: $FILE_CONSTANT")
    topLevelFunction()

    // Test 2: Local functions
    val subject = GrammarSubject()
    subject.outerFunction()

    // Test 3: Expressions
    demonstrateExpressions(10)

    // 5. Labels and jumps (Grammar structural elements)
    println("\nLabel jump simulation:")
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2) break@loop // Jumps to the end of the labeled loop
            print("($i,$j) ")
        }
    }
    println("\nJump complete")
}
