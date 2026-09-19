package learn_kotlin

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// ============================================================================
// LESSON 55: SAM INTERFACES (FUN INTERFACES)
// ============================================================================
fun interface DataTransformer {
    fun transform(input: String): String
}

class TransformerSuite {
    fun executeTransformation(input: String, transformer: DataTransformer) {
        println("SAM Output: ${transformer.transform(input)}")
    }
}

// ============================================================================
// LESSON 56: PROPERTIES AND CUSTOM ACCESSORS
// ============================================================================
class SmartWalletAccount {
    // Backing Field usage via 'field' keyword
    var accountHolderName: String = "Unknown"
        set(value) {
            field = value.trim().uppercase()
        }

    var balanceAmount: Double = 0.0
        private set // Read-only externally, writable internally

    // Computed property with no backing field
    val isOverdrawn: Boolean
        get() = this.balanceAmount < 0.0

    fun creditFunds(amount: Double) {
        if (amount > 0) this.balanceAmount += amount
    }
}

// ============================================================================
// LESSON 57: DELEGATED PROPERTIES
// ============================================================================
class CustomStringTrimmerDelegate {
    private var internalValue: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return internalValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        internalValue = value.trim()
    }
}

class SystemConfigurationSuite {
    // 1. Lazy delegation
    val heavySubsystemToken: String by lazy {
        println("[LAZY] Initializing monolithic token context...")
        "SYS_TOKEN_AX_9942"
    }

    // 2. Observable delegation
    var databaseStatus: String by Delegates.observable("OFFLINE") { prop, old, new ->
        println("[OBSERVER] Property ${prop.name} changed from $old to $new")
    }

    // 3. Custom Delegate usage
    var environmentEndpoint: String by CustomStringTrimmerDelegate()
}

// ============================================================================
// LESSON 58: NULL SAFETY OPERATIONS
// ============================================================================
fun executeNullSafetySuite(nullableInput: String?) {
    println("--- Null Safety Processing ---")

    // 1. Safe Call Operator (?.)
    val upperCaseLength = nullableInput?.uppercase()?.length
    println("Safe call chain evaluation length: $upperCaseLength")

    // 2. Elvis Operator (?:)
    val validatedContent = nullableInput ?: "DEFAULT_FALLBACK_VAL"
    println("Elvis operator evaluation result: $validatedContent")

    // 3. Safe Cast Operator (as?)
    val rawObj: Any = 42
    val stringAttempt = rawObj as? String
    println("Safe cast (Int as? String) result: $stringAttempt")

    // 4. let function binding
    nullableInput?.let {
        println("Let block executed securely for non-null text value: $it")
    }
}

fun demonstrateLessons52To58() {
    println("\n=== Lesson 55: SAM Interfaces ===")
    val suite = TransformerSuite()
    // Using clean lambda syntax instead of anonymous object boilerplate because it is a fun interface
    suite.executeTransformation("kotlin language code") { it.replace(" ", "_").uppercase() }

    println("\n=== Lesson 56: Properties and Custom Accessors ===")
    val wallet = SmartWalletAccount()
    wallet.accountHolderName = "   sujay enterprise   "
    wallet.creditFunds(2500.50)
    println("Wallet Holder Name: '${wallet.accountHolderName}'")
    println("Wallet Balance: $${wallet.balanceAmount} (Is Overdrawn? ${wallet.isOverdrawn})")

    println("\n=== Lesson 57: Delegated Properties ===")
    val config = SystemConfigurationSuite()
    println("Reading lazy property (First access):")
    println("  Token: ${config.heavySubsystemToken}")
    println("Reading lazy property (Second access - no initialization block runs):")
    println("  Token: ${config.heavySubsystemToken}")

    config.databaseStatus = "CONNECTING"
    config.databaseStatus = "ONLINE"

    config.environmentEndpoint = "   https://api.kotlinlang.org/v2/   "
    println("Custom delegated trimmer string result: '${config.environmentEndpoint}'")

    println("\n=== Lesson 58: Null Safety Operations ===")
    executeNullSafetySuite("Valid Content Present")
    executeNullSafetySuite(null)
}
