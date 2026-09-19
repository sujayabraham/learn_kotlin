package learn_kotlin

import kotlin.random.Random

// Standard class with properties in header and body
class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
    
    fun printInfo() {
        println("Contact(id=$id, email=$email, category=$category)")
    }
}

// Data class
data class User(val name: String, val id: Int)

// Exercise: Mutable data class
data class Employee(val name: String, var salary: Int)

// Exercise: Class with logic
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    private val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    fun generateEmployee() = Employee(
        names.random(),
        Random.nextInt(from = minSalary, until = maxSalary)
    )
}

fun demonstrateClasses() {
    println("--- Classes and Objects ---")
    val contact = Contact(1, "mary@gmail.com")
    contact.printInfo()
    contact.email = "jane@gmail.com"
    println("Updated email: ${contact.email}")
    
    println("\n--- Data Classes ---")
    val user = User("Alex", 1)
    println("User toString: $user")
    
    val secondUser = user.copy(id = 3)
    println("Copied user: $secondUser")
    println("Are they equal? ${user == secondUser}")
    
    println("\n--- Exercise: Employee Generator ---")
    val empGen = RandomEmployeeGenerator(10, 30)
    val emp1 = empGen.generateEmployee()
    println("Generated 1: $emp1")
    
    empGen.minSalary = 50
    empGen.maxSalary = 100
    val emp2 = empGen.generateEmployee()
    println("Generated 2: $emp2")
}
