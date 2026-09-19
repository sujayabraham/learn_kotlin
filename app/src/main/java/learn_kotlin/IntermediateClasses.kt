package learn_kotlin

// 1. Inheritance with 'open' keyword
open class Shape(val name: String) {
    open fun draw() {
        println("Drawing a $name")
    }
}

class Circle(radius: Double) : Shape("Circle") {
    override fun draw() {
        println("Drawing a Circle with specific logic")
    }
}

// 2. Abstract Classes
abstract class Product(val name: String, var price: Double) {
    abstract val category: String
    
    fun productInfo(): String {
        return "Product: $name, Category: $category, Price: $price"
    }
}

class Electronic(name: String, price: Double) : Product(name, price) {
    override val category = "Electronic"
}

// 3. Interfaces
interface PaymentMethod {
    fun initiatePayment(amount: Double): String
}

interface PaymentType {
    val paymentType: String
}

class CreditCardPayment(val cardNumber: String) : PaymentMethod, PaymentType {
    override fun initiatePayment(amount: Double): String {
        return "Payment of $$amount using card ending in ${cardNumber.takeLast(4)}."
    }
    override val paymentType: String = "Credit Card"
}

// 4. Delegation
interface DrawingTool {
    fun draw(shape: String)
}

class PenTool : DrawingTool {
    override fun draw(shape: String) = println("Drawing $shape with Pen")
}

class CanvasSession(val tool: DrawingTool) : DrawingTool by tool

// 5. Smart Home Exercise
abstract class SmartDevice(val name: String) {
    abstract fun turnOn()
    abstract fun turnOff()
}

class SmartLight(name: String) : SmartDevice(name) {
    override fun turnOn() = println("$name is now ON.")
    override fun turnOff() = println("$name is now OFF.")
}

fun demonstrateIntermediateClasses() {
    println("--- Inheritance and Abstract Classes ---")
    val circle = Circle(5.0)
    circle.draw()
    
    val laptop = Electronic("Laptop", 1200.0)
    println(laptop.productInfo())
    
    println("\n--- Interfaces ---")
    val payment = CreditCardPayment("1234567890123456")
    println(payment.initiatePayment(99.99))
    println("Type: ${payment.paymentType}")
    
    println("\n--- Delegation ---")
    val session = CanvasSession(PenTool())
    session.draw("Triangle")
    
    println("\n--- Exercises ---")
    val light = SmartLight("Living Room Light")
    light.turnOn()
    light.turnOff()
}
