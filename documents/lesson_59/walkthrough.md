# Walkthrough - Kotlin: Equality Mechanics

In this lesson, we explored the runtime differences between structural value validation (`==`) and heap referential pointer comparison (`===`), checking how null tracking and data models alter resolution paths.

## Changes Made

### Implementation
- Created [EqualityDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/EqualityDemo.kt) which implements:
    - **Standard Instance Comparisons**: Proving that standard object declarations fall back to referential behavior under `==` unless manually customized.
    - **Data Model Valuations**: Demonstrating automated structural comparisons within a `data class DataUser`.
    - **Null-Safety Evaluations**: Verifying that `a == b` safely wraps null pointers without throwing exceptions or runtime crashes.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to append and launch the equality validation demo framework.

## Verification
- **Build Verification**: Compiled successfully using standard Gradle build scripts.
- **Equality Assertions**: Confirmed that distinct data class instances with identical text structures evaluate to true under `==` and false under `===`, while null references resolve safely.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
