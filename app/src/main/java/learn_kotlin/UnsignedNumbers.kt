package learn_kotlin

// 1. Unsigned Integer Types
fun demonstrateUnsignedTypes() {
    println("--- Unsigned Integer Types ---")
    val b: UByte = 1u          // 0 to 255
    val s: UShort = 1u         // 0 to 65,535
    val i: UInt = 1u           // 0 to 2^32 - 1
    val l: ULong = 1u          // 0 to 2^64 - 1
    
    println("UByte: $b, UShort: $s, UInt: $i, ULong: $l")
}

// 2. Literals and Suffixes
fun demonstrateUnsignedLiterals() {
    println("\n--- Unsigned Literals ---")
    val a1 = 42u               // UInt: fits in UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong: too big for UInt
    val a3 = 1uL               // Explicit ULong
    
    println("UInt literal: $a1, ULong (inferred): $a2, ULong (explicit): $a3")
}

// 3. Conversion
fun demonstrateUnsignedConversion() {
    println("\n--- Unsigned Conversion ---")
    val signedInt = -1
    val unsignedInt = signedInt.toUInt()
    println("Signed -1 to UInt: $unsignedInt (Binary representation preserved)")
    
    val backToSigned = unsignedInt.toInt()
    println("UInt $unsignedInt back to Int: $backToSigned")
}

// 4. Unsigned Arrays (Experimental)
@OptIn(ExperimentalUnsignedTypes::class)
fun demonstrateUnsignedArrays() {
    println("\n--- Unsigned Arrays ---")
    val byteOrderMark = ubyteArrayOf(0xEFu, 0xBBu, 0xBFu)
    println("UByteArray: ${byteOrderMark.joinToString { it.toString(16).uppercase() }}")
    
    val uints = uintArrayOf(1u, 2u, 3u)
    println("UIntArray sum: ${uints.sum()}")
}

// 5. Arithmetic and Ranges
fun demonstrateUnsignedArithmetic() {
    println("\n--- Unsigned Arithmetic and Ranges ---")
    val x = 10u
    val y = 3u
    println("$x / $y = ${x / y}")
    println("$x % $y = ${x % y}")
    
    print("UInt range (1u..5u): ")
    for (i in 1u..5u) print("$i ")
    println()
}

fun demonstrateUnsignedNumbers() {
    demonstrateUnsignedTypes()
    demonstrateUnsignedLiterals()
    demonstrateUnsignedConversion()
    demonstrateUnsignedArrays()
    demonstrateUnsignedArithmetic()
}
