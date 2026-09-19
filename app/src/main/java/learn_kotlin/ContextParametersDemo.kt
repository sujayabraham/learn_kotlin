package learn_kotlin

// 1. Define context dependency classes
class Logger {
    fun log(message: String) = println("[LOG] $message")
}

class TransactionContext {
    fun commit() = println("[TX] Transaction committed successfully.")
}

// 2. Demonstration of Context Parameters (Kotlin 2.0.20+ feature)
// Context parameters specify dependencies that must be available in the calling context.
// Syntax: context(parameterName: Type)
context(logger: Logger)
fun performBusinessLogic(data: String) {
    logger.log("Performing business logic on: $data")
}

context(logger: Logger, tx: TransactionContext)
fun executeTransaction(amount: Double) {
    logger.log("Initiating transaction of amount: $$amount")
    tx.commit()
    logger.log("Transaction sequence complete.")
}

fun demonstrateContextParameters() {
    println("--- Context Parameters (Kotlin 2.0.20+) ---")
    
    val myLogger = Logger()
    val myTx = TransactionContext()
    
    // Providing context parameters implicitly via a contextual block scope
    with(myLogger) {
        performBusinessLogic("Important Application Data")
        
        with(myTx) {
            executeTransaction(250.75)
        }
    }
}
