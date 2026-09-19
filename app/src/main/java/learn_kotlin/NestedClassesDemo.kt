package learn_kotlin

class SmartDeviceWorkspace(val workspaceName: String) {
    private val securityKernelKey = "SYS_KERNEL_AX_40"

    // 1. Standard Nested Class
    // Nested classes are static by default. They do NOT hold a reference to an instance of the outer class,
    // meaning they cannot access any instance fields or private properties of their enclosing parent directly.
    class DeviceSpecification(val modelName: String, val firmwareVersion: String) {
        fun printSpecification() {
            println("Device Specs: Model=$modelName, Firmware=$firmwareVersion")
            // println(securityKernelKey) // Compilation Error: Nested class cannot access outer class members!
        }
    }

    // 2. Inner Class
    // By applying the 'inner' modifier keyword, the inner class keeps a direct active memory reference 
    // to an instance of its enclosing outer class, granting full access to its private variables and functions.
    inner class EmbeddedController(val controllerId: Int) {
        fun executeKernelDiagnostics() {
            println("--- Executing Inner Class kernel Diagnostics ---")
            // Accessing outer class private field directly
            println("Controller #$controllerId successfully verified context encryption via: $securityKernelKey")
            // Accessing outer class instance reference explicitly via labeled this
            println("Operating within workspace: ${this@SmartDeviceWorkspace.workspaceName}")
        }
    }
}

fun demonstrateNestedClasses() {
    println("--- Nested and Inner Classes Mechanics ---")

    // Test 1: Instantiating a standard Nested Class (Static)
    // Instantiated directly using class name token scoping, without requiring an outer instance.
    val staticSpec = SmartDeviceWorkspace.DeviceSpecification("IoT-Gateway-X", "v4.2.1-stable")
    staticSpec.printSpecification()

    // Test 2: Instantiating an Inner Class
    // Requires an active enclosing outer class instance to be constructed first.
    val workspace = SmartDeviceWorkspace("Secure Core Facility Lab A")
    val controller = workspace.EmbeddedController(7007)
    controller.executeKernelDiagnostics()
}
