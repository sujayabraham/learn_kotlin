package learn_kotlin

// 1. Object Declaration (Singleton)
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("Auth parameters: $username:$password")
    }
}

// 2. Data Object
data object AppConfig {
    var appName: String = "Kotlin Tour App"
    var version: String = "1.0.0"
}

// 3. Companion Object
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) {
                print("BONG ")
            }
            println()
        }
    }
}

// Exercise 1: Data Objects with Interface
interface Order {
    val orderId: String
    val customerName: String
    val orderTotal: Double
}

data object OrderOne : Order {
    override val orderId = "001"
    override val customerName = "Alice"
    override val orderTotal = 15.50
}

data object OrderTwo : Order {
    override val orderId = "002"
    override val customerName = "Bob"
    override val orderTotal = 12.75
}

// Exercise 2: Object Declaration with Inheritance
interface Vehicle {
    val name: String
    fun move(): String
}

object FlyingSkateboard : Vehicle {
    override val name = "Flying Skateboard"
    override fun move() = "Glides through the air with a hover engine"
    fun fly(): String = "Woooooooo"
}

// Exercise 3: Companion Object for Validation
data class TourUser(val name: String, val email: String) {
    companion object {
        fun isValidEmail(email: String): Boolean = email.contains('@') && email.contains('.')
    }
}

fun demonstrateObjects() {
    println("--- Object Declarations (Singletons) ---")
    DoAuth.takeParams("coding_ninja", "N1njaC0ding!")
    
    println("\n--- Data Objects ---")
    println(AppConfig)
    println("App Name: ${AppConfig.appName}")
    
    println("\n--- Companion Objects ---")
    print("BigBen bongs: ")
    BigBen.getBongs(3)
    
    println("\n--- Exercises ---")
    // Order exercise
    val orders = listOf(OrderOne, OrderTwo)
    orders.forEach { println("Order ${it.orderId} for ${it.customerName}: $${it.orderTotal}") }
    
    // Vehicle exercise
    println("${FlyingSkateboard.name}: ${FlyingSkateboard.move()} - ${FlyingSkateboard.fly()}")
    
    // Validation exercise
    val email = "alice@example.com"
    if (TourUser.isValidEmail(email)) {
        val user = TourUser("Alice", email)
        println("User ${user.name} created with valid email.")
    }
}
