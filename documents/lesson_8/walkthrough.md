# Walkthrough - Kotlin Tour: Null Safety

In this lesson, we explored Kotlin's unique approach to null safety, which helps prevent the dreaded `NullPointerException` by moving checks from runtime to compile time.

## Changes Made

### Implementation
- Created [NullSafety.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/NullSafety.kt) which implements:
    - **Nullable Types**: Demonstrating the `String?` syntax to allow null values.
    - **Null Checks**: Using `if` statements to safely handle nullable variables.
    - **Safe Call Operator (`?.`)**: Accessing properties or methods only if the object is not null.
    - **Elvis Operator (`?:`)**: Providing fallback values for null expressions.
    - **Exercise**: A `salaryById` function that handles missing employees gracefully by returning 0 instead of crashing.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to demonstrate these concepts, including passing `null` from Java to Kotlin.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Runtime**: Verified that safe calls return `null` and the Elvis operator returns the specified default when encountering null values.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
