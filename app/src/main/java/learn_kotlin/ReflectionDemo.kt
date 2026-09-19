package learn_kotlin

import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.*

// A sample class for reflection
class ReflectionSubject(val name: String) {
    fun greet(greeting: String) = "$greeting, $name!"
    var score: Int = 0
}

fun isOdd(x: Int) = x % 2 != 0

fun demonstrateReflection() {
    println("--- Reflection Mechanics ---")

    // 1. Class References
    val c: KClass<ReflectionSubject> = ReflectionSubject::class
    println("Class simple name: ${c.simpleName}")
    println("Class properties: ${c.memberProperties.map { it.name }}")

    // 2. Function References
    val numbers = listOf(1, 2, 3)
    // Referring to a named function
    println("Odd numbers: ${numbers.filter(::isOdd)}")

    // 3. Property References
    val prop = ReflectionSubject::score
    val subject = ReflectionSubject("Kotlin")
    // Use checked cast or specialized type if known
    @Suppress("UNCHECKED_CAST")
    val mutableProp = prop as KMutableProperty1<ReflectionSubject, Int>
    mutableProp.set(subject, 42)
    println("Subject score via reflection: ${prop.get(subject)}")

    // 4. Function references for members
    val greetFunc = ReflectionSubject::greet
    println("Greeting via reflection: ${greetFunc.call(subject, "Hello")}")

    // 5. Bound References
    val boundGreet = subject::greet
    println("Bound greeting: ${boundGreet("Hi")}")

    // 6. Constructor References
    val constructor = ::ReflectionSubject
    val newInstance = constructor("Reflected Instance")
    println("New instance name: ${newInstance.name}")
}
