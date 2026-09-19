# Walkthrough - Kotlin: Generics Mechanics

In this lesson, we explored the foundations of Kotlin generics, including generic classes, functions, variance, and type projections.

## Changes Made

### Implementation
- Created [GenericsDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/GenericsDemo.kt) which implements:
    - **Generic Classes**: A basic `Box<T>` to store values of any type.
    - **Generic Functions with Constraints**: A `sum` function restricted to `Number` subtypes.
    - **Declaration-site Variance**: Demonstrating `out` (covariance) with a `Source` interface and `in` (contravariance) with a `Comparable` interface.
    - **Use-site Variance**: Using type projections (`Array<out Any>`) to safely copy arrays.
    - **Star-projections**: A utility to print lists of unknown types.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to include the generics demonstration.

## Verification
- **Build Verification**: Successfully executed `./gradlew :app:assemble`.
- **Logic Verification**: Verified that covariance allows assigning `Source<String>` to `Source<Any>`, and type projections prevent type-unsafe operations at compile time.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
