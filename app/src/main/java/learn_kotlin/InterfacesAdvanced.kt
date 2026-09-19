package learn_kotlin

// 1. Core Interface with Abstract and Default Methods
interface NamedEntity {
    val name: String // Abstract property, must be implemented by subclasses
}

interface PaymentProcessor : NamedEntity {
    // Interfaces can declare properties with custom getters as long as they don't use backing fields
    val processingFeeRate: Double
        get() = 0.02 // Default fee rate configuration

    fun processPayment(amount: Double) // Abstract method

    // Default Method Implementation
    fun printReceipt(amount: Double) {
        println("Receipt for $name: Processed amount $$amount (Fee Rate: $processingFeeRate)")
    }
}

// 2. Secondary Interface to demonstrate multiple interface conflict resolution
interface AnalyticsTracker {
    fun printReceipt(amount: Double) {
        println("[ANALYTICS] Tracking receipt event for amount: $$amount")
    }
}

// 3. Concrete Implementation resolving multiple interface contracts
class StripeProcessor(override val name: String, override val processingFeeRate: Double) : PaymentProcessor, AnalyticsTracker {
    
    override fun processPayment(amount: Double) {
        val totalFee = amount * processingFeeRate
        println("Stripe processing payment of $$amount with fee $$totalFee")
    }

    // Resolving Diamond Problem signature conflict
    // Both PaymentProcessor and AnalyticsTracker define printReceipt(). 
    // We must override it and explicitly state which parent implementation to trigger via super<Type>.
    override fun printReceipt(amount: Double) {
        super<PaymentProcessor>.printReceipt(amount)
        super<AnalyticsTracker>.printReceipt(amount)
    }
}

fun demonstrateInterfacesAdvanced() {
    println("--- Advanced Interfaces Mechanics ---")

    // Instantiation and polymorphic assignment
    val processor = StripeProcessor("Stripe Corporate Gateway", 0.015)
    
    // Testing abstraction executions
    processor.processPayment(500.00)
    
    // Testing signature conflict resolution method
    println("\nExecuting overridden printReceipt event:")
    processor.printReceipt(500.00)
}
