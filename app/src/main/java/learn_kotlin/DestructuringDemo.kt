package learn_kotlin

// 1. Data Class with Destructuring
// Data classes automatically provide componentN() functions
data class UserData(val name: String, val age: Int, val role: String)

// 2. Custom Class with manual component functions
class Point(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

// 3. Function returning multiple values via Data Class
fun getResult() = UserData("Alice", 28, "Engineer")

fun demonstrateDestructuring() {
    println("--- Destructuring Declarations Mechanics ---")

    // Test 1: Destructuring a Data Class
    val user = UserData("Bob", 30, "Admin")
    val (name, age, role) = user
    println("Unpacked Data Class: name=$name, age=$age, role=$role")

    // Test 2: Using the underscore for unused variables
    val (_, onlyAge, _) = user
    println("Unpacked only age: $onlyAge")

    // Test 3: Destructuring from function return
    val (resName, resAge) = getResult()
    println("Function result: name=$resName, age=$resAge")

    // Test 4: Destructuring in Maps
    val map = mapOf("ID1" to "First", "ID2" to "Second")
    println("\nIterating Map with destructuring:")
    for ((key, value) in map) {
        println("  $key -> $value")
    }

    // Test 5: Destructuring in Lambdas
    val users = listOf(user, UserData("Charlie", 22, "Guest"))
    println("\nProcessing list with destructuring in lambda:")
    users.map { (n, a) -> println("  User $n is $a years old") }

    // Test 6: Custom class with operator component functions
    val point = Point(10, 20)
    val (px, py) = point
    println("\nCustom class (Point): x=$px, y=$py")
}
