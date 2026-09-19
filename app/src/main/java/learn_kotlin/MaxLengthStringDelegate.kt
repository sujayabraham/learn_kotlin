package learn_kotlin

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// Custom Delegate enforcing max text lengths on any mutable string property
class MaxLengthStringDelegate(private val maxLimit: Int) {
    private var storedText: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = storedText
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        storedText = if (value.length > maxLimit) value.take(maxLimit) else value
    }
}

class AppSettings {
    // 1. Lazy delegation: Block executes ONLY on the very first access call
    val heavyDatabaseToken: String by lazy {
        println("[LAZY ACTIVATION] Loading large system file matrix from disk...")
        "SECURE_HASH_TOKEN_XYZ_8842"
    }

    // 2. Observable delegation: Intercepts updates automatically
    var networkStatus: String by Delegates.observable("DISCONNECTED") { prop, old, new ->
        println("[MONITOR] ${prop.name} changed state from '$old' -> '$new'")
    }

    // 3. Custom delegate mapping usage
    var profileBioSummary: String by MaxLengthStringDelegate(15)
}

fun runLesson57Example() {
    val settings = AppSettings()
    println("Accessing lazy property:")
    println("  Token: ${settings.heavyDatabaseToken}")

    // Updating observable property triggers logging statement
    settings.networkStatus = "CONNECTING"
    settings.networkStatus = "CONNECTED"

    // Custom delegate limits inputs automatically
    settings.profileBioSummary = "This is a very long bio description text string value."
    println("Limited text results: '${settings.profileBioSummary}'")
}

