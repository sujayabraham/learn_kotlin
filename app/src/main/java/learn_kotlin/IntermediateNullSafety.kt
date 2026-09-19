package learn_kotlin

// 1. Safe Cast Operator (as?)
fun demonstrateSafeCast() {
    println("--- Safe Cast (as?) ---")
    val obj: Any = "Hello"
    val s = obj as? String
    val i = obj as? Int
    println("Cast to String: $s")
    println("Cast to Int: $i")
}

fun calculateTotalStringLength(items: List<Any>): Int {
    return items.sumOf { (it as? String)?.length ?: 0 }
}

// 2. Not-Null Assertion Operator (!!)
// Note: This is discouraged, but sometimes necessary when you are 100% sure a value is not null.
fun demonstrateNotNullAssertion(name: String?) {
    println("\n--- Not-Null Assertion (!!) ---")
    try {
        val length = name!!.length
        println("Length using !!: $length")
    } catch (e: NullPointerException) {
        println("Caught NPE from !! operator")
    }
}

// 3. Filtering Nullable Collections
fun demonstrateCollectionFiltering() {
    println("\n--- Collection Null Safety ---")
    val emails: List<String?> = listOf("alice@example.com", null, "bob@example.com", null)
    val validEmails = emails.filterNotNull()
    println("filterNotNull(): $validEmails")
    
    val serverConfig = mapOf("appConfig.json" to "App Configuration")
    val configFiles = listOfNotNull(serverConfig["appConfig.json"], serverConfig["missing.json"])
    println("listOfNotNull(): $configFiles")
}

// 4. Exercises
data class SafeUser(val name: String?)

fun getNotificationPreferences(user: Any, emailEnabled: Boolean, smsEnabled: Boolean): List<String> {
    val validUser = user as? SafeUser ?: return emptyList()
    val userName = validUser.name ?: "Guest"
    
    return listOfNotNull(
        "Email Notifications enabled for $userName".takeIf { emailEnabled },
        "SMS Notifications enabled for $userName".takeIf { smsEnabled }
    )
}

data class Subscription(val name: String, val isActive: Boolean)
fun getActiveSubscription(subscriptions: List<Subscription>): Subscription? {
    return subscriptions.singleOrNull { it.isActive }
}

fun validateStock(requested: Int?, available: Int?): Int {
    val validRequested = requested ?: return -1
    val validAvailable = available ?: return -1
    
    if (validRequested < 0 || validRequested > validAvailable) return -1
    
    return validRequested
}

fun demonstrateIntermediateNullSafety() {
    demonstrateSafeCast()
    println("Total length of strings: ${calculateTotalStringLength(listOf("abc", 1, "de", null as Any? ?: "none"))}")
    
    demonstrateNotNullAssertion("Kotlin")
    demonstrateNotNullAssertion(null)
    
    demonstrateCollectionFiltering()
    
    println("\n--- Exercises ---")
    println("Notifications: ${getNotificationPreferences(SafeUser("Alice"), true, true)}")
    
    val subs = listOf(Subscription("Free", false), Subscription("Premium", true))
    println("Active Subscription: ${getActiveSubscription(subs)}")
    
    println("Stock (5, 10): ${validateStock(5, 10)}")
    println("Stock (null, 10): ${validateStock(null, 10)}")
}
