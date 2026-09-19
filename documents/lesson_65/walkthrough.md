# Walkthrough - Kotlin: Grammar and Syntax Nuances

In this lesson, we explored the structural rules of Kotlin's grammar, focusing on how file-level declarations, expressions, and local functions create a more expressive language.

## Changes Made

### Implementation
- Created [GrammarSyntaxDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/GrammarSyntaxDemo.kt) which demonstrates:
    - **Top-level Declarations**: Defining constants and functions outside of any class.
    - **Custom Setters**: Implementing property logic that prints to the console when changed.
    - **Local Functions**: Nesting logic inside a method to demonstrate scoping.
    - **Expression Power**: Using `if` and `try` as value-returning expressions.
    - **Labeled Jumps**: Using a `loop@` label to break out of a nested loop.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to include the grammar demonstration.

## Verification
- **Build Verification**: Successfully executed `./gradlew :app:assemble`.
- **Runtime Logic**: Verified that local functions correctly accessed outer variables and labeled breaks successfully terminated the correct loop level.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
