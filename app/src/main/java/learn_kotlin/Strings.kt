package learn_kotlin

// 1. Immutability and Basic Access
fun demonstrateStringBasics() {
    println("--- String Basics ---")
    val str = "Kotlin"
    println("First char: ${str[0]}")
    println("Last char: ${str[str.length - 1]}")
    
    print("Iteration: ")
    for (c in str) {
        print("$c ")
    }
    println()
}

// 2. Concatenation and buildString
fun demonstrateConcatenation() {
    println("\n--- Concatenation ---")
    val s1 = "abc" + 1
    println("Concatenated with +: $s1")
    
    val s2 = buildString {
        append("Part A")
        append(", ")
        append("Part B")
    }
    println("buildString result: $s2")
}

// 3. String Literals: Escaped vs Raw
fun demonstrateStringLiterals() {
    println("\n--- String Literals ---")
    val escaped = "Line 1\nLine 2\tTabbed"
    println("Escaped:\n$escaped")
    
    val raw = """
        for (c in "foo")
            print(c)
    """
    println("Raw (untrimmed):$raw")
    
    val trimmed = """
        |First line
        |Second line
    """.trimMargin()
    println("Raw (trimMargin):\n$trimmed")
}

// 4. String Templates
fun demonstrateTemplates() {
    println("\n--- String Templates ---")
    val name = "Kotlin"
    println("Simple variable: $name")
    
    val text = "abc"
    println("Expression: length is ${text.length}")
    
    val price = 9.99
    println("Escaped dollar sign: ${'$'}$price")
}

// 5. Common Operations and Formatting
fun demonstrateOperations() {
    println("\n--- Common Operations & Formatting ---")
    val text = "  Kotlin Language  "
    println("Original: '$text'")
    println("Trimmed: '${text.trim()}'")
    println("Uppercase: ${text.uppercase()}")
    println("Lowercase: ${text.lowercase()}")
    println("Replaced: ${text.replace("Language", "Code")}")
    
    // Formatting (JVM only)
    val pi = 3.14159265
    val formatted = String.format("Formatted PI: %.2f", pi)
    println(formatted)
}

// 6. String Equality
fun demonstrateEquality() {
    println("\n--- String Equality ---")
    val s1 = "hello"
    val s2 = "hello"
    val s3 = String("hello".toCharArray()) // Create a new object on JVM
    
    println("s1 == s2 (Structural): ${s1 == s2}")
    println("s1 == s3 (Structural): ${s1 == s3}")
    println("s1 === s2 (Referential - likely true due to pooling): ${s1 === s2}")
    println("s1 === s3 (Referential - likely false): ${s1 === s3}")
}

fun demonstrateStrings() {
    demonstrateStringBasics()
    demonstrateConcatenation()
    demonstrateStringLiterals()
    demonstrateTemplates()
    demonstrateOperations()
    demonstrateEquality()
}
