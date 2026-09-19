# Walkthrough - Kotlin Idiom: Execute an expression if null

In this lesson, we explored the Kotlin idiom for executing an expression when a value is null. This is a common pattern that leverages the Elvis operator (`?:`) to provide concise fallback logic, including throwing exceptions or executing a block of code.

## Changes Made

### Implementation
- Created [Idioms.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Idioms.kt) which implements:
    - **Exception on Null**: Using `?: throw` to fail fast when mandatory data is missing.
    - **Complex Fallback**: Using `?: run { ... }` to execute a block of logic if a value is null.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the idiom demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that the code correctly catches the exception when a map key is missing and correctly executes the fallback `run` block when a list is null.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
