# Step-by-Step Explanation: Kotlin Extension Functions

Extension functions allow you to "extend" a class with new functionality without having to inherit from it or use design patterns like Decorator.

## 1. Syntax and Receiver
To declare an extension function, you prefix the function name with the **receiver type** (the class you want to extend).

```kotlin
fun String.bold(): String = "<b>$this</b>"
```
- `String`: The receiver type.
- `this`: Refers to the instance of the class the function is called on.

## 2. Extension-Oriented Design
This design pattern involves keeping a class's core logic inside the class (member functions) and moving utility or convenience methods to extension functions. This keeps the API surface of the core class focused and clean.

## 3. Java Interoperability
Since extension functions don't actually modify the class, they are compiled into static methods in a Java class named after the file (e.g., `ExtensionFunctionsKt`).

- **Kotlin call**: `"hello".bold()`
- **Java call**: `ExtensionFunctionsKt.bold("hello")`

The first parameter of the static method is always the receiver instance.

## 4. Exercises Implemented
- **Int.isPositive()**: Demonstrates extending primitive-like types.
- **String.toLowercaseString()**: Shows that you can easily wrap existing logic into your own domain-specific names.

## 5. Verification
Verified by building the project. The Java code in `App.java` successfully used the `ExtensionFunctionsKt` static methods to bold a string and check if an integer is positive.
