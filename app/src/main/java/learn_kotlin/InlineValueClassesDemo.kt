package learn_kotlin


// 1. Define Inline Value Classes using @JvmInline and value class
// Each value class wraps EXACTLY ONE primitive parameter.
@JvmInline
value class UserId(val rawId: String) {
    init {
        // Validation logic runs at construction time
        require(rawId.startsWith("USR_")) { "Invalid user ID format!" }
    }
}

@JvmInline
value class AccountId(val rawId: String) {
    init {
        require(rawId.startsWith("ACC_")) { "Invalid account ID format!" }
    }
}

@JvmInline
value class UsdAmount(val value: Double) {
    init {
        require(value >= 0.0) { "Transaction amount cannot be negative!" }
    }

    // Computed properties are fully supported
    val formatted: String
        get() = "$${String.format("%.2f", value)}"

    // Member functions are fully supported
    fun isLargeTransaction(): Boolean = value > 10_000.0
}

// 2. High-Level Secure Function Contract
// The compiler guarantees you CANNOT accidentally pass a regular String into UserId or AccountId.
class BillingService {
    fun executeTransfer(sender: UserId, targetAccount: AccountId, amount: UsdAmount) {
        println("--- Processing Secure Transaction ---")
        println("Sender context parsed: ${sender.rawId}")
        println("Target account context parsed: ${targetAccount.rawId}")
        println("Authorized Amount: ${amount.formatted} (Large Transfer? ${amount.isLargeTransaction()})")
    }
}

fun demonstrateValueClassExample() {
    val service = BillingService()

    // Correct instantiation passing validated domain parameters
    val user = UserId("USR_SUJAY_99")
    val account = AccountId("ACC_CHECKING_4004")
    val amount = UsdAmount(12500.75)

    // Executes cleanly with complete compile-time type-safety
    service.executeTransfer(user, account, amount)

    // ========================================================================
    // UNDER THE HOOD (WHAT THE JVM SEES):
    // ========================================================================
    // During compilation, the Kotlin compiler completely deletes the wrapper
    // objects (UserId, AccountId, UsdAmount) and flattens the parameters.
    //
    // The actual compiled bytecode looks identical to this flat Java execution:
    // String userPrimitive = "USR_SUJAY_99";
    // String accountPrimitive = "ACC_CHECKING_4004";
    // double amountPrimitive = 12500.75;
    //
    // billingService.executeTransfer(userPrimitive, accountPrimitive, amountPrimitive);
    //
    // Result: 100% Type-Safe domain boundaries with 0% memory allocation penalty!
}