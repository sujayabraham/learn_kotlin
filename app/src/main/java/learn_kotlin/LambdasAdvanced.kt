package learn_kotlin

// 1. Higher-Order Functions: Passing functions as arguments and returning them
fun errorCatcher(operation: () -> Int): Int {
    return try {
        operation()
    } catch (e: Exception) {
        println("Higher-order function caught error: ${e.message}")
        -1
    }
}

fun demonstrateHigherOrderFunctions() {
    println("--- Higher-Order Functions ---")
    val standardCalculation = errorCatcher { 50 / 2 }
    val errorCalculation = errorCatcher { 10 / 0 }
    
    println("Standard result: $standardCalculation")
    println("Error fallback result: $errorCalculation")
}

// 2. Function Types and Invoking Type Instances
fun demonstrateFunctionTypes() {
    println("\n--- Function Types & Custom Instantiation ---")
    
    // Explicit function type assignment (Int, Int) -> Int
    val addition: (Int, Int) -> Int = { a, b -> a + b }
    
    // Nullable function type invoked via safe call (.invoke)
    val optionalLogger: ((String) -> Unit)? = null
    optionalLogger?.invoke("This won't be printed")
    
    println("Invoking addition functional type variable: ${addition(15, 30)}")
}

// 3. Lambda Expression Syntax & Implicit 'it' Parameter
fun demonstrateLambdaSyntax() {
    println("\n--- Lambda Syntax and Implicit 'it' ---")
    val numbers = listOf(1, 2, 3, 4, 5)
    
    // Using explicit parameters
    val explicitSquared = numbers.map { n -> n * n }
    
    // Using implicit single parameter 'it'
    val implicitSquared = numbers.map { it * it }
    
    println("Explicit lambda squares: $explicitSquared")
    println("Implicit 'it' lambda squares: $implicitSquared")
}

// 4. Anonymous Functions (Explicit return types vs Lambda implicit expressions)
fun demonstrateAnonymousFunctions() {
    println("\n--- Anonymous Functions ---")
    val fruits = listOf("Apple", "Banana", "Kiwi", "Orange")
    
    // Anonymous function allows an explicit return statement and explicit return type declaration
    val filtered = fruits.filter(fun(item: String): Boolean {
        return item.length > 4
    })
    
    println("Filtered fruits via anonymous function: $filtered")
}

// 5. Closures: Modifying outer variables within lambdas
fun demonstrateClosures() {
    println("\n--- Closures ---")
    var totalSum = 0
    val values = listOf(10, 20, 30)
    
    // Unlike Java, Kotlin lambdas can modify variables captured from their outer scope
    values.forEach { totalSum += it }
    
    println("Total accumulated sum inside closure context: $totalSum")
}

// 6. Function Literals with Receiver (DSL Building Foundations)
class HTMLContext {
    private val content = StringBuilder()
    
    fun body(text: String) {
        content.append("<body>$text</body>")
    }
    
    fun render(): String = content.toString()
}

// Function taking a literal with receiver: HTMLContext.() -> Unit
fun buildHTML(init: HTMLContext.() -> Unit): String {
    val context = HTMLContext()
    context.init() // Invoking the lambda on the receiver instance object
    return context.render()
}

fun demonstrateFunctionLiteralsWithReceiver() {
    println("\n--- Function Literals with Receiver ---")
    val htmlOutput = buildHTML {
        // 'this' inside this block refers to HTMLContext implicitly
        body("Hello from a custom Kotlin DSL structure!")
    }
    println("DSL rendering result:\n$htmlOutput")
}

fun demonstrateLambdasAdvanced() {
    demonstrateHigherOrderFunctions()
    demonstrateFunctionTypes()
    demonstrateLambdaSyntax()
    demonstrateAnonymousFunctions()
    demonstrateClosures()
    demonstrateFunctionLiteralsWithReceiver()
}
