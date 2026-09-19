# Walkthrough - Kotlin: Characters

In this lesson, we explored the `Char` type in Kotlin, learning about its literal representation, escape sequences, Unicode support, and conversion methods.

## Changes Made

### Implementation
- Created [Characters.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Characters.kt) which implements:
    - **Char Literals**: Using single quotes for individual UTF-16 code units.
    - **Escape Sequences**: Demonstrating common sequences like `\n`, `\t`, and the dollar sign `\$`.
    - **Unicode Support**: Using `\uXXXX` for hex-encoded characters and demonstrating surrogate pairs for emojis.
    - **Conversions**: Using `.code` for Unicode values and `.digitToInt()` for numeric digit parsing.
    - **JVM Representation**: Showing how nullable `Char?` values are boxed on the JVM.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the Character demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that emojis have a length of 2 (due to surrogate pairs) and that character arithmetic (e.g., `'A' + 1`) produces the correct subsequent character.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
