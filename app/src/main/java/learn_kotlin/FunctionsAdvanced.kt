package learn_kotlin

// 1. Default Arguments and Overrides
open class A {
    open fun foo(i: Int = 10) { 
        println("A.foo default argument: $i") 
    }
}

class B : A() {
    // Overriding methods always use the base function's default arguments.
    // They cannot define default values themselves.
    override fun foo(i: Int) { 
        println("B.foo overridden execution: $i") 
    }
}

fun demonstrateDefaultArguments() {
    println("--- Default Arguments & Overrides ---")
    val instanceA = A()
    instanceA.foo()     // Uses default 10
    instanceA.foo(25)   // Uses explicit 25
    
    val instanceB = B()
    instanceB.foo()     // Uses default 10 inherited from A
}

// 2. Named Arguments
fun formatString(str: String, normalize: Boolean = true, upperCase: Boolean = false, divideBy: Char = '-') {
    var result = if (normalize) str.trim() else str
    if (upperCase) result = result.uppercase()
    println("Formatted output: ${result.replace(' ', divideBy)}")
}

fun demonstrateNamedArguments() {
    println("\n--- Named Arguments ---")
    // Named arguments allow changing parameter order or ignoring specific defaults cleanly
    formatString("  Hello Kotlin Functions  ", upperCase = true, divideBy = '_')
}

// 3. Unit-Returning and Single-Expression Functions
fun printGreeting(name: String): Unit {
    println("Hello, $name!")
    // 'return Unit' or 'return' is optional
}

// Single-expression function with inferred return type
fun doubleValue(x: Int) = x * 2

fun demonstrateExpressionsAndUnit() {
    println("\n--- Unit & Single-Expression Functions ---")
    printGreeting("Developer")
    println("Double of 21 is: ${doubleValue(21)}")
}

// 4. Variable Number of Arguments (vararg) and Spread Operator
fun <T> printAllElements(vararg items: T) {
    print("Vararg list elements: ")
    for (item in items) {
        print("$item ")
    }
    println()
}

fun demonstrateVarargAndSpread() {
    println("\n--- Vararg and Spread Operator ---")
    printAllElements("A", "B", "C")
    
    // Using the spread operator (*) to unpack an existing array into a vararg parameter
    val array = arrayOf("D", "E", "F")
    printAllElements(*array)
}

// 5. Infix Notation
class InfixNumber(val value: Int) {
    // Requirements for infix: Member or extension function, single parameter, no vararg, no default values
    infix fun multiply(other: Int): Int {
        return this.value * other
    }
}

fun demonstrateInfixNotation() {
    println("\n--- Infix Notation ---")
    val num = InfixNumber(5)
    // Allows calling the function without parentheses or dots
    val result = num multiply 4
    println("Infix multiplication result (5 multiply 4): $result")
}

// 6. Tail Recursive Functions (tailrec)
// Calculates the greatest common divisor (GCD) using tail recursion optimization
tailrec fun findGCD(a: Int, b: Int): Int {
    return if (b == 0) a else findGCD(b, a % b)
}

fun demonstrateTailrec() {
    println("\n--- Tail Recursive Functions (tailrec) ---")
    val gcd = findGCD(36, 60)
    println("GCD of 36 and 60 is: $gcd")
}

fun demonstrateFunctionsAdvanced() {
    demonstrateDefaultArguments()
    demonstrateNamedArguments()
    demonstrateExpressionsAndUnit()
    demonstrateVarargAndSpread()
    demonstrateInfixNotation()
    demonstrateTailrec()
}
