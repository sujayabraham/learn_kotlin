package learn_kotlin

// 1. Object Declaration (The Singleton Pattern)
// Objects are initialized lazily upon their first access. They are completely thread-safe.
object GlobalAppConfiguration {
    val applicationName = "Kotlin Enterprise Suite"
    var isDebugModeActive = true

    fun printCurrentConfig() {
        println("Config: Name=$applicationName, Debug=$isDebugModeActive")
    }
}

// 2. Companion Objects
// A companion object is a nested object tied to the lifecycle of its enclosing class.
// It can access the private members of its outer host class container.
class UserSession private constructor(val token: String) {
    
    fun printSessionDetails() {
        println("Active session token hash: ${token.hashCode()}")
    }

    // Companion Object declaration acting as a Factory
    companion object Factory {
        private var globalSessionCounter = 0

        fun createNewSession(): UserSession {
            globalSessionCounter++
            println("[FACTORY] Spawning Session #$globalSessionCounter")
            return UserSession("TOKEN_ID_$globalSessionCounter")
        }
    }
}

// 3. Object Expressions (Anonymous Objects)
// Object expressions create instances of anonymous classes on the fly.
// Unlike object declarations, object expressions are executed and initialized immediately when they are encountered.
interface ClickListener {
    fun onClick(elementName: String)
}

class InterfaceButtonWidget(val name: String) {
    private var listener: ClickListener? = null

    fun setOnClickListener(newListener: ClickListener) {
        this.listener = newListener
    }

    fun triggerClickSimulation() {
        println("Simulating user click on button: $name")
        listener?.onClick(name)
    }
}

fun demonstrateObjectDeclarationsAdvanced() {
    println("--- Advanced Object Declarations & Expressions ---")

    // Test 1: Object Declaration Singleton behavior
    GlobalAppConfiguration.printCurrentConfig()
    GlobalAppConfiguration.isDebugModeActive = false
    GlobalAppConfiguration.printCurrentConfig()

    // Test 2: Companion Object Factory method invocation
    println("\nEvaluating Companion Object Factory:")
    val session1 = UserSession.createNewSession() // Factory name can be omitted
    val session2 = UserSession.createNewSession() // Or called explicitly via its name
    session1.printSessionDetails()
    session2.printSessionDetails()

    // Test 3: Object Expressions (Anonymous Objects) matching interface contracts
    println("\nEvaluating Object Expressions:")
    val submitBtn = InterfaceButtonWidget("SubmitFormButton")
    
    // Creating an instance of an anonymous class implementing ClickListener on the fly
    submitBtn.setOnClickListener(object : ClickListener {
        override fun onClick(elementName: String) {
            println("Anonymous Object received click event for element: $elementName")
        }
    })
    submitBtn.triggerClickSimulation()
}
