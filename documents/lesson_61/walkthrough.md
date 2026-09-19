# Walkthrough - Kotlin: Async Programming Overview

In this lesson, we explored the landscape of asynchronous programming in Kotlin, comparing traditional methods like threading and callbacks with modern approaches like Futures and Coroutines.

## Changes Made

### Implementation
- Created [AsyncProgrammingOverview.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/AsyncProgrammingOverview.kt) which demonstrates:
    - **Threading**: Using the `thread {}` factory to spawn OS threads.
    - **Callbacks**: Implementing a `fetchAsyncData` function that notifies completion via a lambda.
    - **Futures**: Using Java's `CompletableFuture` for asynchronous result handling.
    - **Wait Logic**: Using `Thread.sleep` to ensure the asynchronous background tasks print to the console before the demo finishes.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to include the async overview demonstration.

## Verification
- **Build Verification**: Successfully compiled using `./gradlew :app:assemble`.
- **Async Execution**: Verified that background tasks run on separate threads and correctly return results via their respective mechanisms.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
