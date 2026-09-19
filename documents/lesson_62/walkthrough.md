# Walkthrough - Kotlin: Coroutines Overview

In this lesson, we introduced the fundamental concepts of Kotlin Coroutines, including launching coroutines, suspending functions, and exploring their lightweight nature.

## Changes Made

### Configuration
- Updated [libs.versions.toml](file:///Users/sujay/learn_kotlin/gradle/libs.versions.toml) to include the `kotlinx-coroutines-core` library.
- Updated [app/build.gradle.kts](file:///Users/sujay/learn_kotlin/app/build.gradle.kts) to include the coroutines dependency.

### Implementation
- Created [CoroutinesOverview.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/CoroutinesOverview.kt) which implements:
    - **Basic Launch**: Using `GlobalScope.launch` to demonstrate non-blocking background tasks.
    - **Suspending Functions**: Defining a `suspend` function that uses `delay` to simulate network work.
    - **Structured Concurrency**: Using `runBlocking` to manage multiple child coroutines.
    - **Performance Check**: Running a large number of coroutines to demonstrate their efficiency compared to threads.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to coordinate and call the coroutines overview.

## Verification
- **Build Verification**: Successfully executed `./gradlew :app:assemble`.
- **Runtime Logic**: Confirmed that `Hello, World!` prints in the correct order (main thread first, then delayed coroutine) and that 10,000 coroutines execute in a fraction of a second.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
