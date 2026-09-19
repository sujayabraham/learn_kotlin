# Walkthrough - Kotlin Tour: Control Flow

In this lesson, we explored how Kotlin directs the flow of execution. We covered conditional expressions, ranges, and various loop structures.

## Changes Made

### Implementation
- Created [ControlFlow.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ControlFlow.kt) which implements:
    - `demonstrateIf()`: Uses `if` as an expression to find the maximum of two numbers.
    - `demonstrateWhen()`: Shows `when` as both a statement and an expression, including usage without a subject.
    - `demonstrateRanges()`: Demonstrates `..`, `..<`, `downTo`, and `step`.
    - `demonstrateLoops()`: Covers `for` loops over collections and ranges, as well as `while` and `do-while` loops.
    - `runControlFlowExercises()`: Includes solutions for the dice game, button mapping, FizzBuzz, and list filtering exercises.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to call these new functions.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Runtime**: Verified that ranges work correctly (inclusive vs exclusive) and that `when` branches are evaluated in order.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
