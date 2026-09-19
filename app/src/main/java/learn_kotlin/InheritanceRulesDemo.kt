package learn_kotlin

// 1. Defining a clear Base Class with explicit open modifiers
// In Kotlin, the common superclass of all classes is Any (not java.lang.Object).
// Any provides equals(), hashCode(), and toString(), but no other methods.
open class CoreBaseAccount(val accountHolder: String) {
    
    open val interestRate: Double = 0.01

    open fun calculateYearlyBonus() {
        println("Calculating default baseline account bonus for $accountHolder.")
    }

    fun secureAuditLog() {
        // Final by default, subclasses cannot override this method
        println("Writing internal secure transaction audit trail logs.")
    }
}

// 2. Subclass inheritance mapping rules
// We subclass PremiumSavingsAccount as 'open' so that the 'final override' modifier on the method is meaningful.
open class PremiumSavingsAccount(holder: String) : CoreBaseAccount(holder) {
    
    // Overriding an open property. Overridden properties are open by default unless marked final.
    override val interestRate: Double = 0.05

    // Overriding an open method and enforcing finality on downstream child subclasses
    final override fun calculateYearlyBonus() {
        // Using 'super' to trigger the parent class method execution path cleanly
        super.calculateYearlyBonus()
        println("Adding premium account tier bonus configurations (Interest Rate: $interestRate).")
    }
}

// 3. Discussion on the multiple override conflict rule (Diamond Inheritance Problem)
open class RectangleShape {
    open fun draw() { println("Drawing a rectangle shape structure.") }
}

interface TextOverlay {
    fun draw() { println("Rendering a text description overlay.") } // Interface default implementation
}

// If a class inherits an identical method signature from both a class and an interface,
// it is forced to override the method and explicitly handle the ambiguity via super.
class ButtonWidget : RectangleShape(), TextOverlay {
    override fun draw() {
        super<RectangleShape>.draw() // Directs compiler to Rectangle class logic
        super<TextOverlay>.draw()    // Directs compiler to TextOverlay interface default logic
    }
}

fun demonstrateInheritanceRules() {
    println("--- Advanced Inheritance Rules ---")

    // Test 1: Property and Method overriding checks
    val account = PremiumSavingsAccount("Sujay")
    account.calculateYearlyBonus()
    account.secureAuditLog()

    // Test 2: Double inheritance conflict resolution
    println("\nEvaluating multi-inheritance drawing triggers:")
    val btn = ButtonWidget()
    btn.draw()
}
