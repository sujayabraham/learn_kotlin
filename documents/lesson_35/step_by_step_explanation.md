# Step-by-Step Explanation: Exceptions in Kotlin

Kotlin unifies error handling mechanisms, removing structural checked exceptions completely while introducing robust expression assignment constructs and safety types.

## 1. Unchecked Exceptions Model
In contrast to Java, Kotlin does not possess **checked exceptions**. 
- You do not need to explicitly declare exception lists in your function signatures via a `throws` clause.
- You are not forced by the compiler to wrap potential errors inside `try-catch` blocks, allowing you to choose contextually correct locations to handle runtime failures.

## 2. Try as an Expression
In Kotlin, `try` is an **expression**, meaning it returns an explicit value that can be assigned directly to variables.
- The value of the expression is either the trailing evaluated line of the `try` block or the trailing evaluated line of the caught `catch` block.
- The `finally` block executes unconditionally for resource cleanup, but its evaluation contents do not affect the outer `try` expression outcome value.
```kotlin
val result: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
```

## 3. The `Nothing` Type
When a statement throws an exception or enters an infinite loop, it never normalizes or returns to its original caller framework. Kotlin maps these paths to a distinct built-in type called **`Nothing`**.
- Because `throw` is an expression returning `Nothing`, it can be mixed fluidly into Elvis operator sequences or assignment validations:
```kotlin
val s = inputName ?: throw IllegalArgumentException("Invalid Name")
```

## 4. Custom Subclasses
Creating tailored exception representations is lightweight. You simply declare a class that extends the standard `Exception` base class (or any subclass thereof), passing contextual diagnostic descriptions down to the master constructor.
```kotlin
class CustomBusinessException(message: String) : Exception(message)
```
