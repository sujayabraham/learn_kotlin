# Walkthrough - Kotlin: Builder Inference

In this lesson, we explored how Kotlin uses Builder Inference to dynamically evaluate and assign top-level generic parameters based on method calls within passed lambda receivers.

## Changes Made

### Implementation
- Created [BuilderInferenceDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/BuilderInferenceDemo.kt) which implements:
    - **Generic Collection Builders**: A generic builder module (`MyCollectionBuilder<E>`) that aggregates types dynamically.
    - **Inferred Parameter Blocks**: A generic higher-order construction function (`buildMyCollection`) that resolves type parameters via lambda method invocations.
    - **Multi-Type Inference Tests**: Evaluating collections of both `String` and `Int` configurations cleanly without explicit type arguments.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to integrate and run the Builder Inference demo function.

## Verification
- **Build Verification**: Clean compilation achieved across the app module using standard Gradle scripts.
- **Inference Verification**: Confirmed that the compiler perfectly infers and locks generic types inside nested scopes based on simple statements like `add("...")` or `add(10)`.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
