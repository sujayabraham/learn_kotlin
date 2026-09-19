package learn_kotlin

// 1. Define the interface contract
interface Engine {
    fun startEngine()
    fun getFuelType(): String
}

// 2. Concrete implementations of the contract
class ElectricEngine : Engine {
    override fun startEngine() {
        println("Electric motor spins silently up to maximum torque.")
    }
    override fun getFuelType(): String = "Battery Power"
}

class CombustionEngine : Engine {
    override fun startEngine() {
        println("Pistons ignite and the internal combustion engine roars to life.")
    }
    override fun getFuelType(): String = "Gasoline"
}

// 3. Class Delegation using the 'by' keyword
// The compiler automatically generates all forwarding boilerplate methods for the Engine interface,
// delegating them directly to the provided 'underlyingEngine' object instance.
class SmartVehicle(underlyingEngine: Engine) : Engine by underlyingEngine {
    
    // We can cleanly override specific methods if we want to add custom behavior
    override fun startEngine() {
        println("Initiating smartphone safety validation check before ignition...")
        // We can call the delegated object's original implementation implicitly or explicitly
        // However, note that since we didn't store underlyingEngine as a val field, 
        // calling super.startEngine() triggers the delegated implementation naturally.
    }
    
    fun displayVehicleInfo() {
        println("Vehicle configuration utilizes: ${getFuelType()}") // Delegated call
    }
}

fun demonstrateDelegation() {
    println("--- Class Delegation Mechanics ---")

    val electric = ElectricEngine()
    val tesla = SmartVehicle(electric)
    
    println("Testing Electric Delegation:")
    tesla.startEngine() // Runs overridden vehicle safety check
    tesla.displayVehicleInfo() // Delegates getFuelType() to electric engine instance

    println("\nTesting Combustion Delegation:")
    val gasEngine = CombustionEngine()
    val truck = SmartVehicle(gasEngine)
    truck.displayVehicleInfo() // Delegates getFuelType() to gas engine instance
}
