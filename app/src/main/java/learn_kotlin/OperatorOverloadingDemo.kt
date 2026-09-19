package learn_kotlin

// 1. Defining a custom 2D Point class with operator overloading capabilities
data class Point2D(val x: Int, val y: Int) {

    // Overloading Binary Arithmetic Operators: '+' maps to 'plus'
    operator fun plus(other: Point2D): Point2D {
        return Point2D(this.x + other.x, this.y + other.y)
    }

    // Overloading Unary Operators: '-' maps to 'unaryMinus'
    operator fun unaryMinus(): Point2D {
        return Point2D(-this.x, -this.y)
    }
}

// 2. Class representing a collection container to demonstrate indexed access operators
class PointBox {
    private val points = mutableListOf<Point2D>()

    fun addPoint(p: Point2D) {
        points.add(p)
    }

    // Overloading Indexed Access Operators: 'box[index]' maps to 'get'
    operator fun get(index: Int): Point2D {
        return points[index]
    }

    // Overloading Indexed Access Operators: 'box[index] = value' maps to 'set'
    operator fun set(index: Int, value: Point2D) {
        if (index in points.indices) {
            points[index] = value
        } else {
            points.add(value)
        }
    }

    // Overloading the 'contains' operator: 'p in box' maps to 'contains'
    operator fun contains(p: Point2D): Boolean {
        return points.contains(p)
    }
}

// 3. Class demonstrating Invoke operator
class GreeterService(val greetingPrefix: String) {
    // Overloading the Invoke operator: 'service()' maps to 'invoke'
    operator fun invoke(targetName: String) {
        println("$greetingPrefix, $targetName!")
    }
}

fun demonstrateOperatorOverloading() {
    println("--- Operator Overloading ---")

    // Test 1: Binary Arithmetic and Unary Overloading
    val p1 = Point2D(10, 20)
    val p2 = Point2D(5, 5)
    
    val sum = p1 + p2 // Translates to p1.plus(p2)
    val inverted = -p1 // Translates to p1.unaryMinus()
    
    println("Point arithmetic (p1 + p2): $sum")
    println("Point inversion (-p1): $inverted")

    // Test 2: Indexed Access and Contains Overloading
    val box = PointBox()
    box.addPoint(p1)
    box.addPoint(p2)

    // Using get operator
    println("Indexed access box[0]: ${box[0]}")

    // Using set operator
    box[1] = Point2D(100, 100)
    println("Indexed access box[1] after update: ${box[1]}")

    // Using contains operator ('in')
    val checkPoint = Point2D(10, 20)
    println("Is $checkPoint inside our box? ${checkPoint in box}")

    // Test 3: Invoke Operator
    val helloGreeter = GreeterService("Welcome to Kotlin Operator World")
    helloGreeter("Developer") // Translates directly to helloGreeter.invoke("Developer")
}
