package learn_kotlin

// 1. Class Declaration with Primary and Secondary Constructors
class CustomerProfile(val id: Int, var name: String) {
    var email: String = ""
    var category: String = "Standard"

    // Primary Constructor Initializer Blocks (init blocks)
    init {
        println("Primary initializer block: CustomerProfile initialized with ID: $id and Name: $name")
        name = name.trim()
    }

    // Secondary Constructor
    constructor(id: Int, name: String, email: String) : this(id, name) {
        println("Secondary constructor block executed.")
        this.email = email
    }

    // Another Secondary Constructor chaining onto the previous one
    constructor(id: Int, name: String, email: String, category: String) : this(id, name, email) {
        this.category = category
    }
}

// 2. Class Inheritance Laws: open vs final (Using unique names to avoid conflict with existing exercises)
open class TransportVehicle(val brand: String) {
    open fun accelerate() {
        println("The $brand transport vehicle is accelerating smoothly.")
    }

    fun stop() {
        // This function is final and cannot be overridden by any subclasses
        println("Vehicle stopped completely.")
    }
}

class ElectricTransportCar(brand: String, val batteryCapacity: Int) : TransportVehicle(brand) {
    override fun accelerate() {
        println("The $brand electric car accelerates instantly using its $batteryCapacity kWh battery power!")
    }
}

// 3. Abstract Classes
abstract class AbstractWorker(val employeeId: Int) {
    abstract fun doWork() // Must be implemented by concrete subclasses
    
    fun clockIn() {
        println("Employee $employeeId clocked in.")
    }
}

class SoftwareEngineer(employeeId: Int, val specialization: String) : AbstractWorker(employeeId) {
    override fun doWork() {
        println("Software Engineer $employeeId is writing highly optimized code specializing in $specialization.")
    }
}

fun demonstrateClassesAdvanced() {
    println("--- Advanced Classes and Inheritance Mechanics ---")

    // Test 1: Instantiating class constructors and initialization triggers
    println("Instantiating via secondary constructor:")
    val profile = CustomerProfile(101, "   John Doe   ", "john@example.com", "Premium")
    println("Resulting Profile: ID=${profile.id}, Name='${profile.name}', Email=${profile.email}, Category=${profile.category}")

    // Test 2: Inheritance tracking
    println("\nEvaluating open inheritance mappings:")
    val baseVehicle = TransportVehicle("Toyota")
    baseVehicle.accelerate()
    
    val myEv = ElectricTransportCar("Tesla", 85)
    myEv.accelerate()
    myEv.stop()

    // Test 3: Abstract implementation execution
    println("\nEvaluating abstract structures:")
    val engineer = SoftwareEngineer(4004, "Kotlin Multiplatform")
    engineer.clockIn()
    engineer.doWork()
}
