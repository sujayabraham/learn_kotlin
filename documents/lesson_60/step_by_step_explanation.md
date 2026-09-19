# Step-by-Step Explanation: Generics in Kotlin

Generics allow classes and functions to work with different types while maintaining type safety. Kotlin's approach to generics includes powerful features like declaration-site variance and type projections.

## 1. Generic Classes and Functions
Classes and functions can have type parameters, typically denoted by `T`.
```kotlin
class Box<T>(t: T) {
    var value = t
}

fun <T> singletonList(item: T): List<T> { ... }
```

## 2. Generic Constraints (Upper Bounds)
You can restrict the types that can be used as type arguments. The most common constraint is an upper bound.
```kotlin
fun <T : Number> sum(a: T, b: T): Double { ... }
```
Here, `T` must be a subtype of `Number`.

## 3. Variance: `out` and `in`
Variance describes how subtyping of complex types relates to subtyping of their components.
- **Covariance (`out`)**: Allows you to use a more specific type than requested. A class with `out T` can only *produce* `T` and not *consume* it.
  ```kotlin
  interface Source<out T> {
      fun nextItem(): T
  }
  ```
- **Contravariance (`in`)**: Allows you to use a more general type than requested. A class with `in T` can only *consume* `T` and not *produce* it.
  ```kotlin
  interface Comparable<in T> {
      fun compareTo(other: T): Int
  }
  ```

## 4. Type Projections (Use-site Variance)
Sometimes you can't use declaration-site variance. Type projections allow you to specify variance at the usage site.
```kotlin
fun copy(from: Array<out Any>, to: Array<Any>) { ... }
```
`Array<out Any>` means `from` is a producer of `Any`, allowing you to pass `Array<String>` to it.

## 5. Star-projections
When you don't know or don't care about the type argument, use a star-projection `*`.
- `List<*>` represents a list of some unknown type. It's safe to read `Any?` from it, but not safe to write to it.
