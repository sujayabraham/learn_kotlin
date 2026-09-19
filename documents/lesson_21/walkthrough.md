# Walkthrough - Kotlin: Visibility Modifiers

In this lesson, we explored Kotlin's four visibility modifiers: `public`, `internal`, `protected`, and `private`. We compared them to their Java counterparts and learned how Kotlin uses them to enforce encapsulation at the file, class, and module levels.

## Changes Made

### Implementation
- Created [VisibilityModifiers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/VisibilityModifiers.kt) which implements:
    - **Top-level Visibility**: Demonstrating `private` (file scope) and `internal` (module scope).
    - **Class Member Visibility**: 
        - `private`: Accessible only within the class.
        - `protected`: Accessible within the class and its subclasses (NOT the same package).
        - `internal`: Accessible within the same module.
        - `public`: Accessible everywhere (default).
    - **Constructor Visibility**: Using the `private constructor` syntax with a factory method.
    - **Local Declarations**: Confirming that local variables cannot have visibility modifiers.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the visibility demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `protected` members are not visible to unrelated classes even within the same package, confirming Kotlin's stricter encapsulation compared to Java.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
