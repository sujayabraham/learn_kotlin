# Walkthrough - Kotlin Tour: Intermediate Null Safety

In this lesson, we advanced our understanding of null safety in Kotlin, covering safe casts, collection filtering, and handling mandatory non-null values.

## Changes Made

### Implementation
- Created [IntermediateNullSafety.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/IntermediateNullSafety.kt) which implements:
    - **Safe Cast (`as?`)**: Demonstrating how to attempt a cast and receive `null` instead of a crash if it fails.
    - **Not-Null Assertion (`!!`)**: Showing the operator that forces a value to be non-null (and how it can crash).
    - **Collection Filtering**: Using `filterNotNull()` and `listOfNotNull()` to manage lists with potential nulls cleanly.
    - **Early Returns**: Using the Elvis operator `?:` to validate preconditions and return early (e.g., `val x = input ?: return`).
    - **Exercises**:
        - Notification preferences filtering.
        - Finding a single active subscription with `singleOrNull`.
        - Stock validation with early returns.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `as?` handles type mismatches safely and that `listOfNotNull` excludes missing map entries.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
