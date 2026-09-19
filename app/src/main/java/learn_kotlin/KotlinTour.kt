package learn_kotlin

fun showHelloWorld() {
    println("Hello, world!")
}

fun demonstrateVariables() {
    val popcorn = 5    // Read-only
    val hotdog = 7     // Read-only
    var customers = 10 // Mutable
    
    println("Initial customers: $customers")
    customers = 8
    println("Updated customers: $customers")
    println("Popcorn: $popcorn, Hotdogs: $hotdog")
}

fun demonstrateStringTemplates() {
    val customers = 10
    println("There are $customers customers")
    println("There are ${customers + 1} customers (after adding one)")
}

fun introducePerson(name: String, age: Int) {
    println("$name is $age years old")
}
