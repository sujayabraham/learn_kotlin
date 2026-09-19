# Walkthrough - Kotlin: Destructuring Declarations

In this lesson, we explored how to unpack objects into multiple variables using destructuring declarations, a powerful feature for working with structured data.

## Changes Made

### Implementation
- Created [DestructuringDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/DestructuringDemo.kt) which demonstrates:
    - **Data Class Destructuring**: Unpacking `UserData` into name, age, and role.
    - **Skipping Variables**: Using `_` to ignore specific components.
    - **Function Return Values**: Destructuring the result of a function that returns a data class.
    - **Map Iteration**: Using destructuring in a `for` loop to cleanly access keys and values.
    - **Lambda Destructuring**: Using destructuring directly in a `map` lambda parameters.
    - **Custom Component Functions**: Implementing manual `component1()` and `component2()` in a `Point` class.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to include the destructuring demonstration.

## Verification
- **Build Verification**: Successfully executed `./gradlew :app:assemble`.
- **Runtime Logic**: Verified that variables were correctly assigned based on the order of properties in data classes and manual component functions.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
