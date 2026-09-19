package learn_kotlin

// ============================================================================
// LESSON 52: ENUM CLASSES MECHANICS
// ============================================================================

enum class AccessLevel(val rawPriority: Int) {
    ADMIN(100) {
        override fun getAccessClassification(): String = "Full System Read/Write Authority"
    },
    OPERATOR(50) {
        override fun getAccessClassification(): String = "Operational Control Scopes Only"
    },
    GUEST(10) {
        override fun getAccessClassification(): String = "Restricted Read-Only Public Viewer"
    };

    abstract fun getAccessClassification(): String
}

// ============================================================================
// LESSON 53: INLINE (VALUE) CLASSES MECHANICS
// ============================================================================

@JvmInline
value class SecureIdToken(val idString: String) {
    init {
        require(idString.startsWith("SEC_")) { "Invalid ID Token prefix format classification." }
    }

    val maskedToken: String
        get() = "SEC_***_" + idString.takeLast(4)

    fun printInternalToken() {
        println("Token value contents: $idString")
    }
}

fun demonstrateEnumAndInlineClasses() {
    println("--- Lesson 52: Enum Classes Mechanics ---")

    // Using modern .entries collection mapping introduced in Kotlin 1.9+
    for (level in AccessLevel.entries) {
        println("Enum instance: ${level.name} (Priority=${level.rawPriority}) -> ${level.getAccessClassification()}")
    }

    val matchedEnum = AccessLevel.valueOf("ADMIN")
    println("Matched via valueOf: $matchedEnum (Ordinal position: ${matchedEnum.ordinal})")


    println("\n--- Lesson 53: Inline Value Classes Mechanics ---")

    val userToken = SecureIdToken("SEC_AUTH_TOKEN_9942")
    println("Masked parameter: ${userToken.maskedToken}")
    userToken.printInternalToken()
}
