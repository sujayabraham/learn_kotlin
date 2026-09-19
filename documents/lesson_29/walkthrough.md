# Walkthrough - Kotlin: Strings

In this lesson, we explored the `String` type in Kotlin, including its immutable nature, literal variations, powerful templating system, and common operations.

## Changes Made

### Implementation
- Created [Strings.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Strings.kt) which implements:
    - **String Basics**: Indexing and iteration with `for` loops.
    - **Concatenation**: Comparing `+` with the fluent `buildString` builder.
    - **Literals**: Demonstrating "escaped" strings (standard) vs "raw" strings (triple quotes).
    - **Indentation Management**: Using `trimMargin()` to format multiline strings cleanly.
    - **String Templates**: Using `$variable` and `${expression}` for clean embedding.
    - **Operations**: `trim()`, `uppercase()`, `replace()`, and JVM-style `String.format()`.
    - **Equality**: Comparing structural equality (`==`) vs referential equality (`===`).
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the String demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that structural equality (`==`) works as expected for content comparison, while referential equality (`===`) correctly identifies when two references point to different objects even if the content is the same.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
