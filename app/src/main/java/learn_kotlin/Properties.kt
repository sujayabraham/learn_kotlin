package learn_kotlin

import kotlin.properties.Delegates.observable

// 1. Backing Fields and Custom Accessors
class PersonWithName {
    var name: String = ""
        set(value) {
            field = value.replaceFirstChar { it.uppercase() }
        }
}

// 2. Extension Properties
data class PersonData(val firstName: String, val lastName: String)

val PersonData.fullName: String
    get() = "$firstName $lastName"

// 3. Delegated Properties
class CachedStringDelegate {
    private var cachedValue: String? = null
    operator fun getValue(thisRef: PropUser, property: Any?): String {
        if (cachedValue == null) {
            cachedValue = "${thisRef.firstName} ${thisRef.lastName}"
            println("Computed and cached: $cachedValue")
        } else {
            println("Accessed from cache: $cachedValue")
        }
        return cachedValue ?: "Unknown"
    }
}

class PropUser(val firstName: String, val lastName: String) {
    val displayName: String by CachedStringDelegate()
}

// 4. Lazy Properties
class Database {
    fun connect() = println("Connected to Database")
    fun query(q: String) = "Result for '$q'"
}

val databaseConnection: Database by lazy {
    val db = Database()
    db.connect()
    db
}

// 5. Observable Properties
class Thermostat {
    var temperature: Double by observable(20.0) { _, old, new ->
        if (new > 25) {
            println("Warning: Temperature is too high! ($old°C -> $new°C)")
        } else {
            println("Temperature updated: $old°C -> $new°C")
        }
    }
}

// Exercises
// Exercise 1: Indices
fun findOutOfStockBooks(inventory: List<Int>): List<Int> = buildList {
    for (index in inventory.indices) {
        if (inventory[index] == 0) {
            add(index)
        }
    }
}

// Exercise 2: Extension Property
val Double.asMiles: Double
    get() = this * 0.621371

// Exercise 3: Lazy Health Checks
fun checkAppServer(): Boolean {
    println("Checking App Server...")
    return true
}
fun checkDatabaseHealth(): Boolean {
    println("Checking Database Health...")
    return false
}

// Exercise 4: Observable Budget
class Budget(val totalBudget: Int) {
    var remainingBudget: Int by observable(totalBudget) { _, oldValue, newValue ->
        if (newValue < totalBudget * 0.2) {
            println("Warning: Your remaining budget ($newValue) is below 20% of your total budget.")
        } else if (newValue > oldValue) {
            println("Good news: Your remaining budget increased to $newValue.")
        }
    }
}

fun demonstrateProperties() {
    println("--- Backing Fields ---")
    val p = PersonWithName()
    p.name = "kodee"
    println("Name: ${p.name}")

    println("\n--- Extension Properties ---")
    val pd = PersonData("John", "Doe")
    println("Full Name: ${pd.fullName}")

    println("\n--- Delegated Properties ---")
    val user = PropUser("Alice", "Smith")
    println("First access: ${user.displayName}")
    println("Second access: ${user.displayName}")

    println("\n--- Lazy Properties ---")
    println("First query: ${databaseConnection.query("SELECT 1")}")
    println("Second query: ${databaseConnection.query("SELECT 2")}")

    println("\n--- Observable Properties ---")
    val thermo = Thermostat()
    thermo.temperature = 22.0
    thermo.temperature = 28.0

    println("\n--- Exercises ---")
    val inventory = listOf(1, 0, 5, 0, 3)
    println("Out of stock indices: ${findOutOfStockBooks(inventory)}")

    val km = 10.0
    println("$km km in miles: ${km.asMiles}")

    val isAppHealthy by lazy { checkAppServer() }
    val isDbHealthy by lazy { checkDatabaseHealth() }
    println("Checking health (lazy)...")
    if (isAppHealthy) println("App is healthy")
    
    val budget = Budget(1000)
    budget.remainingBudget = 150
    budget.remainingBudget = 500
}
