package learn_kotlin


class SmartHomeHub(val hubName: String) {
    private val kernelSecretKey = "AES_KEY_8842"

    // 1. Static Nested Class: Isolated, no link to hub instance
    class DeviceConfig(val model: String, val ipAddress: String) {
        fun displayConfig() {
            println("Device Config -> Model: $model, IP: $ipAddress")
            // println(kernelSecretKey) // ERROR: Cannot access outer private instance members!
        }
    }

    // 2. Inner Class: Bound tightly to a specific hub instance
    inner class HardwareController(val controllerId: Int) {
        fun linkToKernel() {
            // Can read outer private fields and access outer instance name via labeled this
            println("Controller #$controllerId linked using key: $kernelSecretKey")
            println("Operating inside hub instance: ${this@SmartHomeHub.hubName}")
        }
    }
}

fun runLesson54Example() {
    // Instantiate static nested class directly
    val staticConfig = SmartHomeHub.DeviceConfig("SmartPlug-v2", "192.168.1.50")
    staticConfig.displayConfig()

    // Instantiate inner class via an active outer hub instance
    val hubInstance = SmartHomeHub("Central Living Room Hub")
    val controller = hubInstance.HardwareController(707)
    controller.linkToKernel()
}