package learn_kotlin

// 1. Basic Boolean Types
fun demonstrateBooleanBasics() {
    println("--- Boolean Basics ---")
    val isTrue: Boolean = true
    val isFalse = false
    
    val number = 10
    val isPositive = number > 0
    
    println("isTrue: $isTrue, isFalse: $isFalse, isPositive: $isPositive")
}

// 2. Logical Operations
fun demonstrateLogicalOperations() {
    println("\n--- Logical Operations ---")
    val a = true
    val b = false
    
    println("!a (Negation): ${!a}")
    println("a && b (Conjunction): ${a && b}")
    println("a || b (Disjunction): ${a || b}")
    println("a xor b (Exclusive OR): ${a xor b}")
}

// 3. Short-circuiting Behavior
fun demonstrateShortCircuiting() {
    println("\n--- Short-circuiting ---")
    
    fun sideEffect(msg: String): Boolean {
        println("Side effect: $msg")
        return true
    }
    
    println("Checking 'false && sideEffect':")
    val resultAnd = false && sideEffect("AND") // sideEffect not called
    println("Result: $resultAnd")
    
    println("Checking 'true || sideEffect':")
    val resultOr = true || sideEffect("OR") // sideEffect not called
    println("Result: $resultOr")
}

// 4. Nullable Booleans
fun demonstrateNullableBooleans() {
    println("\n--- Nullable Booleans ---")
    val isEnabled: Boolean? = null
    
    // Cannot be used directly in 'if'
    // if (isEnabled) { ... } // Error
    
    if (isEnabled == true) {
        println("Enabled")
    } else if (isEnabled == false) {
        println("Disabled")
    } else {
        println("Is null")
    }
}

// 5. Operator Precedence
fun demonstratePrecedence() {
    println("\n--- Operator Precedence ---")
    // && has higher precedence than ||
    val result = true || false && false
    println("true || false && false = $result (Expected true)")
}

fun demonstrateBooleans() {
    demonstrateBooleanBasics()
    demonstrateLogicalOperations()
    demonstrateShortCircuiting()
    demonstrateNullableBooleans()
    demonstratePrecedence()
}
