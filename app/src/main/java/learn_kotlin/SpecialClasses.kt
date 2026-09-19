package learn_kotlin

// 1. Open Classes (Inheritance)
open class Transport(val make: String, val model: String) {
    open fun displayInfo() {
        println("Transport Info: Make - $make, Model - $model")
    }
}

class Auto(make: String, model: String, val numberOfDoors: Int) : Transport(make, model) {
    override fun displayInfo() {
        println("Auto Info: Make - $make, Model - $model, Number of Doors - $numberOfDoors")
    }
}

// 2. Enum Classes
enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

// 3. Sealed Classes
sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

// 4. Inline Value Classes
@JvmInline
value class Email(val address: String)

// Exercise 1: Sealed Class (Delivery Tracking)
sealed class DeliveryStatus {
    data class Pending(val sender: String) : DeliveryStatus()
    data class InTransit(val estimatedDeliveryDate: String) : DeliveryStatus()
    data class Delivered(val deliveryDate: String, val recipient: String) : DeliveryStatus()
    data class Canceled(val reason: String) : DeliveryStatus()
}

fun printDeliveryStatus(status: DeliveryStatus) {
    when (status) {
        is DeliveryStatus.Pending -> println("The package is pending pickup from ${status.sender}.")
        is DeliveryStatus.InTransit -> println("The package is in transit and expected to arrive by ${status.estimatedDeliveryDate}.")
        is DeliveryStatus.Delivered -> println("The package was delivered to ${status.recipient} on ${status.deliveryDate}.")
        is DeliveryStatus.Canceled -> println("The delivery was canceled due to: ${status.reason}.")
    }
}

// Exercise 2: Enum Class inside a Sealed Class
sealed class Status {
    data object Loading : Status()
    data class Error(val problem: Problem) : Status() {
        enum class Problem {
            NETWORK, TIMEOUT, UNKNOWN
        }
    }
    data class OK(val data: List<String>) : Status()
}

fun handleStatus(status: Status) {
    when (status) {
        is Status.Loading -> println("Loading...")
        is Status.OK -> println("Data received: ${status.data}")
        is Status.Error -> when (status.problem) {
            Status.Error.Problem.NETWORK -> println("Network issue")
            Status.Error.Problem.TIMEOUT -> println("Request timed out")
            Status.Error.Problem.UNKNOWN -> println("Unknown error occurred")
        }
    }
}

fun demonstrateSpecialClasses() {
    println("--- Open Classes and Inheritance ---")
    val auto = Auto("Tesla", "Model 3", 4)
    auto.displayInfo()
    
    println("\n--- Enum Classes ---")
    val red = Color.RED
    println("Color: $red, RGB: ${red.rgb}, Contains Red: ${red.containsRed()}")
    
    println("\n--- Sealed Classes ---")
    val human = Human("Alice", "Engineer")
    println(greetMammal(human))
    
    println("\n--- Inline Value Classes ---")
    val email = Email("user@example.com")
    println("Email address: ${email.address}")
    
    println("\n--- Exercises ---")
    printDeliveryStatus(DeliveryStatus.InTransit("2023-12-25"))
    handleStatus(Status.Error(Status.Error.Problem.NETWORK))
}
