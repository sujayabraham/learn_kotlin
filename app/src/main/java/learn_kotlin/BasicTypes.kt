package learn_kotlin

fun demonstrateTypeInference() {
    var customers = 10 // Kotlin infers type Int
    println("Initial customers (inferred Int): $customers")
    
    customers = 8
    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3
    println("Final customers after arithmetic: $customers")
}

fun demonstrateExplicitTypes() {
    val year: Int = 2020
    val amount: Long = 350_000_000L // Using L suffix for Long
    val currentTemp: Float = 24.5f
    val price: Double = 19.99
    val isEnabled: Boolean = true
    val separator: Char = ','
    
    println("Explicit Types:")
    println("Int year: $year")
    println("Long amount: $amount")
    println("Float temp: $currentTemp")
    println("Double price: $price")
    println("Boolean enabled: $isEnabled")
    println("Char separator: $separator")
}

fun demonstrateDeferredInitialization() {
    val d: Int
    d = 3
    val e: String = "hello"
    
    println("Deferred Initialization:")
    println("d: $d")
    println("e: $e")
}

fun runBasicTypesExercise() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000L
    val e: Boolean = false
    val f: Char = '\n'
    
    println("Exercise Results:")
    println("a (Int): $a")
    println("b (String): $b")
    println("c (Double): $c")
    println("d (Long): $d")
    println("e (Boolean): $e")
    println("f (Char code): ${f.code}") // Printing character code for \n
}
