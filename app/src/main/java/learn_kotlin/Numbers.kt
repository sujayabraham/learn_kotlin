package learn_kotlin

// 1. Integer Types
fun demonstrateIntegers() {
    println("--- Integer Types ---")
    val one = 1 // Int
    val threeBillion = 3_000_000_000 // Long (inferred because it exceeds Int range)
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    
    println("Int: $one, Long (inferred): $threeBillion, Long (explicit): $oneLong, Byte: $oneByte")
}

// 2. Floating-Point Types
fun demonstrateFloatingPoint() {
    println("\n--- Floating-Point Types ---")
    val pi = 3.14 // Double
    val eFloat = 2.7182817f // Float
    val avogadro = 6.02214076e23 // Double exponent
    
    println("Double: $pi, Float: $eFloat, Exponent: $avogadro")
}

// 3. Literals and Underscores
fun demonstrateLiterals() {
    println("\n--- Literals and Underscores ---")
    val decimal = 123
    val hex = 0x0F
    val binary = 0b00001011
    val oneBillion = 1_000_000_000 // Underscore for readability
    
    println("Decimal: $decimal, Hex: $hex, Binary: $binary, Large number: $oneBillion")
}

// 4. Explicit Conversions
fun demonstrateConversions() {
    println("\n--- Explicit Conversions ---")
    val i: Int = 1
    // val l: Long = i // Error: Type mismatch
    val l: Long = i.toLong()
    println("Int $i converted to Long: $l")
    
    val d = 1.9
    println("Double $d converted to Int (truncates): ${d.toInt()}")
}

// 5. Bitwise Operations
fun demonstrateBitwise() {
    println("\n--- Bitwise Operations ---")
    val x = (1 shl 2) // Shift left: 0100 (4)
    val y = 0b0101 // 5
    println("1 shl 2 = $x")
    println("$x and $y = ${x and y}") // 4 (0100) and 5 (0101) = 4 (0100)
    println("$x or $y = ${x or y}")   // 4 (0100) or 5 (0101) = 5 (0101)
}

// 6. JVM Representation (Boxing)
fun demonstrateBoxing() {
    println("\n--- JVM Boxing and Caching ---")
    val a: Int = 1000
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("Boxed Int (1000) referential equality (===): ${boxedA === anotherBoxedA}") // false
    println("Boxed Int (1000) value equality (==): ${boxedA == anotherBoxedA}") // true
    
    val small: Int = 100
    val boxedSmall: Int? = small
    val anotherBoxedSmall: Int? = small
    println("Boxed Int (100) referential equality (cached ===): ${boxedSmall === anotherBoxedSmall}") // true
}

// 7. Floating-Point Comparisons
fun demonstrateFloatComparison() {
    println("\n--- Floating-Point Comparisons ---")
    val nan1 = Double.NaN
    val nan2 = Double.NaN
    println("Static NaN == NaN: ${nan1 == nan2}") // false
    
    val boxedNan1: Double? = nan1
    val boxedNan2: Double? = nan2
    println("Boxed NaN == NaN: ${boxedNan1 == boxedNan2}") // true
    
    println("0.0 == -0.0: ${0.0 == -0.0}") // true
    println("Boxed 0.0 == -0.0: ${(-0.0 as Double?) == (0.0 as Double?)}") // false (because -0.0 < 0.0 in boxed rules)
}

fun demonstrateNumbers() {
    demonstrateIntegers()
    demonstrateFloatingPoint()
    demonstrateLiterals()
    demonstrateConversions()
    demonstrateBitwise()
    demonstrateBoxing()
    demonstrateFloatComparison()
}
