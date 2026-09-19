# Walkthrough - Kotlin: Reflection Mechanics

In this lesson, we explored how to use Kotlin's reflection API to inspect and interact with classes, functions, and properties at runtime.

## Changes Made

### Implementation
- Created [ReflectionDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ReflectionDemo.kt) which demonstrates:
    - **Class References**: Getting `KClass` using `::class` and listing member properties.
    - **Function References**: Passing top-level functions using `::` syntax.
    - **Property References**: Getting and setting property values on an instance via `KProperty1` and `KMutableProperty1`.
    - **Member Function References**: Calling class methods via `KFunction`.
    - **Bound References**: Creating a function reference tied to a specific object instance.
    - **Constructor References**: Creating new instances by referring to the class constructor with `::`.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to include the reflection demonstration in the main execution flow.

## Verification
- **Build Verification**: Successfully executed `./gradlew :app:assemble`.
- **Runtime Logic**: Verified that properties were correctly set and functions were invoked as expected via reflection, and bound references behaved correctly.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
