# Walkthrough - Kotlin Tour: Libraries & APIs

In this lesson, we explored Kotlin's standard library and how to integrate external libraries like `kotlinx-datetime`. We also covered time measurement, math functions, and opt-in APIs.

## Changes Made

### Configuration
- Added `kotlinx-datetime` to `libs.versions.toml`.
- Added `implementation(libs.kotlinx.datetime)` to `build.gradle.kts`.
- Performed a Gradle sync to download the new dependency.

### Implementation
- Created [LibrariesAndAPIs.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/LibrariesAndAPIs.kt) which implements:
    - **Standard Library**: Demonstrating implicitly imported functions like `reversed()`.
    - **Time Measurement**: Using `kotlin.time` with extension properties (`30.minutes`) and `measureTime`.
    - **External Libraries**: Using `kotlinx-datetime` to get the current time and handle time zones.
    - **Opt-in APIs**: Using `@OptIn` to access experimental unsigned types (`UIntArray`).
    - **Exercises**:
        - Compound interest calculation using `kotlin.math.pow`.
        - Measuring execution time of a data processing block.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `30.minutes == 0.5.hours` and that external date-time logic returns the correct current instant.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
