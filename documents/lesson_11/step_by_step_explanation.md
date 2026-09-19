# Step-by-Step Explanation: Kotlin Lambdas with Receivers

Lambdas with receivers are essentially "function literals with a receiver type." They allow you to write code that behaves like it's inside a member function of a class.

## 1. Syntax for the Type
The type of a lambda with a receiver is written as `ReceiverType.() -> ReturnType`.

```kotlin
fun render(block: Canvas.() -> Unit) { ... }
```
In this example:
- `Canvas` is the **receiver**.
- Inside the `block`, you can call `drawCircle()` instead of `canvas.drawCircle()`.

## 2. Invoking the Lambda
Inside the function defining the lambda, you call it using the receiver instance.

```kotlin
val canvas = Canvas()
canvas.block() // The magic happens here
```

## 3. Powering DSLs (Domain-Specific Languages)
This feature is what makes Kotlin DSLs so readable. Instead of:
```kotlin
val menu = Menu("Lunch")
menu.item("Pizza")
menu.item("Soda")
```
You can write:
```kotlin
menu("Lunch") {
    item("Pizza")
    item("Soda")
}
```

## 4. Exercises Implemented
- **fetchData**: Used `StringBuilder.() -> Unit` to allow `append()` to be called directly inside the callback.
- **incremented**: Used the standard library's `buildList`, which provides a `MutableList` receiver to build a result list fluently.

## 5. Verification
Verified by building the project. The Java code calls the top-level demonstration function, which executes various DSL-style blocks and prints the results to the console.
