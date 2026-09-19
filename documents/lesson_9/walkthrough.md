# Walkthrough - Kotlin Tour: Extension Functions

In this lesson, we explored one of Kotlin's most powerful features: **Extension Functions**. We learned how to add functionality to existing classes without inheritance or decorators.

## Changes Made

### Implementation
- Created [ExtensionFunctions.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ExtensionFunctions.kt) which implements:
    - `String.bold()`: Adds HTML bold tags to a string.
    - `HttpClient.get()` and `HttpClient.post()`: Example of "Extension-Oriented Design," keeping the core class slim.
    - `Int.isPositive()`: A simple utility for integers.
    - `String.toLowercaseString()`: A wrapper for the standard library function.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to:
    - Call the demonstration function.
    - Show how Java calls extension functions as static methods where the first argument is the receiver (e.g., `ExtensionFunctionsKt.bold("text")`).

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Interop**: Confirmed that Java can interact with extension functions via static method calls on the generated `Kt` class.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
