package learn_kotlin

class OuterScopeContainer {
    val containerLabel = "Outer Scope Container [Level 0]"

    inner class NestedScopeComponent {
        val componentLabel = "Nested Scope Component [Level 1]"

        fun String.executeMultiReceiverExtension() {
            // This function demonstrates multiple concurrent implicit receivers:
            // 1. Extension Receiver: The String itself (Current local context)
            // 2. Dispatch Receiver: NestedScopeComponent class containing this method
            // 3. Outer Dispatch Receiver: OuterScopeContainer class enclosing the inner class
            
            println("--- Evaluating 'this' Expressions ---")

            // Unqualified 'this' always points to the innermost enclosing scope (the extension receiver String)
            println("Unqualified 'this': $this")

            // Labeled 'this' explicitly targets specific outer receiver layers
            println("Labeled 'this@NestedScopeComponent': ${this@NestedScopeComponent.componentLabel}")
            println("Labeled 'this@OuterScopeContainer': ${this@OuterScopeContainer.containerLabel}")
        }

        fun runSimulation() {
            // Triggering the member extension function on a plain String instance
            "Target Extension Text".executeMultiReceiverExtension()
        }
    }
}

fun demonstrateThisExpressions() {
    val outer = OuterScopeContainer()
    val inner = outer.NestedScopeComponent()
    inner.runSimulation()
}
