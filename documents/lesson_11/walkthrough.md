# Walkthrough - Kotlin Tour: Lambdas with Receivers

In this lesson, we explored **Lambdas with Receivers**, a sophisticated Kotlin feature that allows you to access members of an object directly within a lambda block. This is the foundation for creating Domain-Specific Languages (DSLs) in Kotlin.

## Changes Made

### Implementation
- Created [LambdasWithReceivers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/LambdasWithReceivers.kt) which implements:
    - **Canvas DSL**: A `render` function that provides a `Canvas` receiver to draw circles and squares.
    - **Menu DSL**: A `menu` function that uses a `Menu` receiver to add items cleanly.
    - **StringBuilder Extension**: Demonstrates how `StringBuilder` can be used as a receiver for string building logic.
    - **Button Events**: Shows how complex event data can be accessed directly in a callback.
    - **List Extension**: An `incremented()` function using `buildList`.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that code inside the lambdas can access receiver methods (like `drawCircle()` or `item()`) without using the object's name.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
