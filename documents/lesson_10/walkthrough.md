# Walkthrough - Kotlin Tour: Scope Functions

In this lesson, we explored **Scope Functions** (`let`, `run`, `with`, `apply`, and `also`), which allow you to execute a block of code within the context of an object, making your code more concise and readable.

## Changes Made

### Implementation
- Created [ScopeFunctions.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ScopeFunctions.kt) which implements:
    - `let`: Used for null-safety and transforming objects.
    - `apply`: Used for object configuration (returns the object).
    - `run`: Used for configuration and computing a result (returns the lambda result).
    - `also`: Used for side effects like logging (returns the object).
    - `with`: Used for grouping multiple calls on the same object.
    - `demonstrateExercises()`: Includes the refactored user update example from the tour.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified the different return behaviors (object vs lambda result) and context object access (`this` vs `it`).

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
