# Step-by-Step Explanation: Kotlin Functions

Kotlin functions are designed to be concise and flexible. Here is a breakdown of the concepts covered in this lesson.

## 1. Function Declarations
Basic functions use the `fun` keyword. Types are written after the parameter name, and return types follow the parameter list.

```kotlin
fun sum(x: Int, y: Int): Int {
    return x + y
}
```

## 2. Default Values and Named Arguments
You can provide default values for parameters. This reduces the need for overloaded functions.
- **Kotlin**: `printMessage("Hello")` uses the default prefix.
- **Java Interop**: Use `@JvmOverloads` so the Kotlin compiler generates actual overloads that Java can see.

## 3. Single-Expression Functions
If a function returns a single expression, you can omit the braces and `return` keyword. The return type can also be inferred.

```kotlin
fun sum(x: Int, y: Int) = x + y
```

## 4. Lambda Expressions
Lambdas are function literals—functions that aren't declared but passed immediately as an expression.
- **Syntax**: `{ parameter -> body }`.
- **Trailing Lambdas**: If the last parameter of a function is a function (lambda), you can place the lambda *outside* the parentheses. This makes higher-order functions feel like built-in language features.

## 5. Higher-Order Functions
These are functions that take other functions as parameters or return them.
- **Example**: `repeatN(n, action)` takes a function `action: () -> Unit` and runs it `n` times.

## 6. Verification
Verified by building the project. The Java code in `App.java` successfully called `FunctionsKt.printMessageWithPrefix("Hello")` because of the `@JvmOverloads` annotation in Kotlin.
