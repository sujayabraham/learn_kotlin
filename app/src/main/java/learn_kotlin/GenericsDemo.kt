package learn_kotlin

// 1. Basic Generic Class
class Box<T>(t: T) {
    var value = t
}

// 2. Generic Function with Constraints (Upper Bound)
// T must be a subtype of Number
fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

// 3. Declaration-site Variance: 'out' (Covariance)
// Source<String> can be assigned to Source<Any>
interface Source<out T> {
    fun nextItem(): T
}

class StringSource : Source<String> {
    override fun nextItem(): String = "Next String"
}

// 4. Declaration-site Variance: 'in' (Contravariance)
// Comparable<Number> can be assigned to Comparable<Double>
interface ComparableIn<in T> {
    fun compareTo(other: T): Int
}

class NumberComparer : ComparableIn<Number> {
    override fun compareTo(other: Number): Int = 0
}

// 5. Use-site Variance (Type Projections)
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}

// 6. Star-projections
fun printList(list: List<*>) {
    println("List elements: ${list.joinToString()}")
}

fun demonstrateGenerics() {
    println("--- Generics Mechanics ---")

    // Test 1: Basic Generic Class
    val boxInt = Box<Int>(10)
    val boxString = Box("Kotlin") // Type inference works here
    println("Box Int: ${boxInt.value}, Box String: ${boxString.value}")

    // Test 2: Generic Function with Constraints
    println("Sum of 5 and 4.5: ${sum(5, 4.5)}")

    // Test 3: Covariance (out)
    val strSource: Source<String> = StringSource()
    val anySource: Source<Any> = strSource // Possible because of 'out'
    println("AnySource next: ${anySource.nextItem()}")

    // Test 4: Contravariance (in)
    val numComparer: ComparableIn<Number> = NumberComparer()
    val doubleComparer: ComparableIn<Double> = numComparer // Possible because of 'in'
    println("DoubleComparer hash: ${doubleComparer.hashCode()}")

    // Test 5: Type Projections
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any: Array<Any> = Array<Any>(3) { "" }
    copy(ints, any)
    println("Copied array: ${any.joinToString()}")

    // Test 6: Star-projections
    printList(listOf(1, "Two", 3.0))
}
