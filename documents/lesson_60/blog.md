# Blog: The Power of Generics - Type Safety without Limits

Day 60! Today I delved into the world of **Generics** in Kotlin. If you want to write flexible, reusable code that doesn't sacrifice type safety, generics are your best friend. From simple boxes to complex variance rules, Kotlin makes generics both powerful and understandable.

## Why Generics?
Imagine writing a separate list class for every data type—one for Ints, one for Strings, one for Users. It would be a maintenance nightmare! Generics let you define a single class that works with any type:
```kotlin
class Box<T>(val value: T)
```
The `T` is a placeholder that gets filled in when you use the class.

## Setting Boundaries with Constraints
Sometimes you want flexibility, but with limits. If you're writing a math utility, you don't want someone passing a `String` into it. You can set an **Upper Bound**:
```kotlin
fun <T : Number> sum(a: T, b: T): Double
```
Now, `T` *must* be some kind of `Number`.

## The Variance Puzzle: `out` and `in`
This is where it gets really interesting. In many languages, a `List<String>` is not considered a `List<Object>`, which can be frustrating. Kotlin solves this with **Variance**:
- **Covariance (`out`)**: If a class only *produces* a type (like a read-only source), you can mark it as `out`. This tells the compiler it's safe to use a more specific type than requested.
- **Contravariance (`in`)**: If a class only *consumes* a type (like a comparer), you mark it as `in`. This lets you use a more general type than requested.

## Use-site Flexibility
What if you can't change the class definition? You can use **Type Projections** at the site where you use the type:
```kotlin
fun copy(from: Array<out Any>, to: Array<Any>)
```
The `out Any` ensures we only read from the `from` array, making it safe to pass an `Array<Int>` into it.

## Summary
Generics in Kotlin provide a robust framework for building reusable components. By understanding constraints and variance, you can write code that is both highly flexible and strictly type-safe.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Generics #TypeSafety #CleanCode #AndroidDev #JVM #ProgrammingJourney
