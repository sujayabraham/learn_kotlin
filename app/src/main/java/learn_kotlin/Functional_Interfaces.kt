package learn_kotlin

// fun interface enforces exactly ONE abstract method
fun interface ActionEventListener {
    fun onActionTriggered(actionName: String)
}

class AnalyticsEngine {
    fun registerEvent(name: String, listener: ActionEventListener) {
        println("Processing event details...")
        listener.onActionTriggered(name)
    }
}

fun runLesson55Example() {
    val engine = AnalyticsEngine()

    // Instead of verbose anonymous objects, pass a highly readable lambda parameter expression instantly!
    engine.registerEvent("USER_CHECKOUT_CLICK") { event ->
        println("SAM Callback: Event '$event' recorded securely in analytical tracking cloud.")
    }
}
