# Walkthrough - Kotlin Tour: Special Classes

In this lesson, we explored specialized class types in Kotlin, including Open classes for inheritance, Enum classes for constants, Sealed classes for restricted hierarchies, and Inline Value classes for performance.

## Changes Made

### Implementation
- Created [SpecialClasses.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/SpecialClasses.kt) which implements:
    - **Open Classes**: Demonstrating inheritance using `open` and `override` with `Transport` and `Auto`.
    - **Enum Classes**: Using `Color` with custom properties (`rgb`) and functions.
    - **Sealed Classes**: A restricted hierarchy with `Mammal`, `Human`, and `Cat`.
    - **Inline Value Classes**: Using `@JvmInline value class Email` for type-safe performance.
    - **Exercises**:
        - `DeliveryStatus` (Sealed class) representing package states.
        - `Status` (Sealed class) with a nested `Problem` enum for error handling.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `when` expressions are exhaustive for sealed classes and that enum functions work as expected.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
