# Walkthrough - Kotlin Tour: Classes

In this lesson, we explored object-oriented programming in Kotlin, focusing on class declarations, properties, and the powerful "Data Class" feature.

## Changes Made

### Implementation
- Created [Classes.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Classes.kt) which implements:
    - `Contact`: A standard class with properties in the header (`val`/`var`) and a body property.
    - `User`: A simple **Data Class** demonstrating `toString()` and `copy()`.
    - `Employee`: A mutable data class used in the exercises.
    - `RandomEmployeeGenerator`: A class demonstrating member functions and internal logic.
    - `demonstrateClasses()`: A comprehensive test function for all the above.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to:
    - Call the demonstration function.
    - Directly instantiate and interact with the `Contact` class from Java to show how Kotlin properties map to Java getters and setters.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Interop**: Confirmed that Java sees `var email` as `getEmail()` and `setEmail()`.
- **Data Classes**: Verified that `user.copy()` and `user.toString()` work automatically as expected.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
