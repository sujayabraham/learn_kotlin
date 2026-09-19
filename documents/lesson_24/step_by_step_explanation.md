# Step-by-Step Explanation: Kotlin Types Overview

Kotlin's type system is designed to be unified and efficient. Here is a breakdown of the core concepts.

## 1. Everything is an Object
In Kotlin, you don't have "primitives" like `int` in Java. Instead, you use `Int`, which is a class. This means you can call methods on it:
```kotlin
val x = 10.plus(5) // Equivalent to 10 + 5
```
At runtime, the Kotlin compiler optimizes these into primitives for performance whenever possible, but as a developer, you always work with objects.

## 2. Basic Type Categories
- **Numbers**: `Byte`, `Short`, `Int`, `Long`, `Float`, `Double`.
- **Booleans**: `true` and `false`.
- **Characters**: `Char` (enclosed in single quotes `'K'`).
- **Strings**: `String` (enclosed in double quotes `"..."`).
- **Arrays**: `Array<T>` (created with `arrayOf(...)`).

## 3. The Root of Everything: `Any`
`Any` is the counterpart to `Object` in Java. Every class in Kotlin has `Any` as its ultimate superclass. It provides three methods: `equals()`, `hashCode()`, and `toString()`.

## 4. The Result of "Nothing": `Unit`
`Unit` is used as the return type of functions that don't return a meaningful value. It is similar to `void` in Java, but `Unit` is a real object (a singleton instance).

## 5. The Value That Never Is: `Nothing`
`Nothing` is a special type that has no instances. It is used to represent values that never exist. For example, a function that always throws an exception:
```kotlin
fun fail(msg: String): Nothing {
    throw Exception(msg)
}
```
If a function returns `Nothing`, the compiler knows that the code following the call will never be reached.

## 6. Verification
Verified by building the project. The implementation demonstrates the unified type system and the existence of special types like `Unit` and `Any`.
