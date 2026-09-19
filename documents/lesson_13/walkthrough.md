# Walkthrough - Kotlin Tour: Objects

In this lesson, we explored Kotlin's unique "Object" features, which provide a first-class way to handle singletons and shared state without the complexity of traditional patterns.

## Changes Made

### Implementation
- Created [Objects.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Objects.kt) which implements:
    - **Object Declarations (Singletons)**: The `DoAuth` object, created lazily and thread-safely.
    - **Data Objects**: The `AppConfig` object, providing a clean `toString()` for singleton data.
    - **Companion Objects**: The `BigBen` class with a named companion object `Bonger` to share functionality across instances.
    - **Exercises**:
        - `OrderOne` and `OrderTwo` data objects implementing the `Order` interface.
        - `FlyingSkateboard` object inheriting from the `Vehicle` interface.
        - `TourUser` with a companion object for email validation.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to:
    - Call the demonstration function.
    - Interact with Kotlin objects from Java using `INSTANCE` and `Companion` (or named companion) accessors.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Runtime**: Verified that object declarations are initialized only on first access and that companion objects can be accessed directly via the class name in Kotlin.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
