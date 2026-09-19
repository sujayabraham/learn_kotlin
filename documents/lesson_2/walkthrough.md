# Walkthrough - Kotlin Tour: Hello World

In this lesson, I explored the foundational concepts of Kotlin based on the "Kotlin Tour". This includes variables, string templates, and basic function structures.

## Changes Made

### Implementation
- Created [KotlinTour.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/KotlinTour.kt) which implements:
    - `showHelloWorld()`: Simple output demonstration.
    - `demonstrateVariables()`: Shows `val` (read-only) vs `var` (mutable) behavior.
    - `demonstrateStringTemplates()`: Shows how to embed variables and expressions in strings.
    - `introducePerson(name: String, age: Int)`: Uses string templates with parameters.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these functions using the `KotlinTourKt` class.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Runtime**: The outputs correctly reflect variable mutations and string template evaluations.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
