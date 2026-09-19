package learn_kotlin

// 1. Basic Char Type and Literals
fun demonstrateCharBasics() {
    println("--- Character Basics ---")
    val letter: Char = 'K'
    val digit = '2'
    val symbol = '@'
    
    println("Letter: $letter, Digit: $digit, Symbol: $symbol")
}

// 2. Escape Sequences
fun demonstrateEscapeSequences() {
    println("\n--- Escape Sequences ---")
    val tab = '\t'
    val newline = '\n'
    val dollar = '\$'
    val backslash = '\\'
    
    println("Row1${tab}Tabbed")
    println("Row2${newline}New line")
    println("Price: ${dollar}100")
    println("Backslash: $backslash")
}

// 3. Unicode Escape Sequences
fun demonstrateUnicode() {
    println("\n--- Unicode Escapes ---")
    val unicodeChar = '\u0041' // 'A'
    println("Unicode \\u0041: $unicodeChar")
    
    // Supplementary characters (surrogate pairs)
    val emoji = "🚀"
    println("Emoji: $emoji, Length in Chars: ${emoji.length}")
    println("Surrogate 1 code: ${emoji[0].code}")
    println("Surrogate 2 code: ${emoji[1].code}")
}

// 4. Conversions
fun demonstrateCharConversions() {
    println("\n--- Character Conversions ---")
    val char = 'A'
    println("Char '$char' code: ${char.code}")
    
    val digitChar = '9'
    val numericValue = digitChar.digitToInt()
    println("Digit char '$digitChar' to Int: $numericValue")
    
    val fromCode = 66.toChar()
    println("Int 66 to Char: $fromCode")
    
    // Arithmetic
    val nextChar = char + 1
    println("'$char' + 1 = '$nextChar'")
}

// 5. JVM Representation (Boxing)
fun demonstrateCharBoxing() {
    println("\n--- JVM Boxing ---")
    val c: Char = 'X'
    val boxedC1: Char? = c
    val boxedC2: Char? = c
    
    // Referential equality for boxed Chars
    println("Boxed Char referential equality (===): ${boxedC1 === boxedC2}")
    println("Boxed Char value equality (==): ${boxedC1 == boxedC2}")
}

fun demonstrateCharacters() {
    demonstrateCharBasics()
    demonstrateEscapeSequences()
    demonstrateUnicode()
    demonstrateCharConversions()
    demonstrateCharBoxing()
}
