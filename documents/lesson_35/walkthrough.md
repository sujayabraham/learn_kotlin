# Walkthrough - Kotlin: Exceptions

In this lesson, we explored how Kotlin manages runtime failures by eliminating checked exception overhead and treating error handling as a value-based expression.

## Changes Made

### Implementation
- Created [ExceptionsAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ExceptionsAdvanced.kt) which implements:
    - **Try-Catch-Finally Logic**: Standard resource cleanup and error capture.
    - **Try Expressions**: Returning values directly from failure-prone blocks to variables.
    - **Throwing Expressions**: Leveraging the `Nothing` type to integrate errors into Elvis operator validations (`val x = input ?: throw ...`).
    - **Custom Exceptions**: Designing tailored diagnostic types for specific application-level domains.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to integrate and call the exceptions demonstration suite.

## Verification
- **Build Verification**: Compiled successfully using the project's standard Gradle toolchain.
- **Error Resolution Logic**: Verified that `try` as an expression correctly yields `null` (or fallback values) upon failure, keeping application state predictable.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
