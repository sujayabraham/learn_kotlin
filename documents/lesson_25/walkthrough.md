# Walkthrough - Kotlin: Numbers

In this lesson, we explored how Kotlin handles numeric data types. We covered integer and floating-point types, literal constants, explicit conversions, bitwise operations, and the nuances of JVM representation and floating-point comparisons.

## Changes Made

### Implementation
- Created [Numbers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Numbers.kt) which implements:
    - **Integer and Floating-Point Types**: Demonstrating `Byte`, `Short`, `Int`, `Long`, `Float`, and `Double`.
    - **Literal Constants**: Using Hex (`0x`), Binary (`0b`), and Underscores for readability.
    - **Explicit Conversions**: Showing that Kotlin does not support implicit widening (e.g., `Int` to `Long`).
    - **Bitwise Operations**: Using infix functions like `shl`, `and`, and `or`.
    - **JVM Boxing and Caching**: Explaining referential vs. value equality for boxed numbers.
    - **Floating-Point Comparison Rules**: Showing how `NaN` and `0.0` vs `-0.0` behave differently when boxed.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the numbers demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that boxed integers within the -128 to 127 range are cached and show referential equality, while larger numbers do not. Verified that boxed `NaN` equals itself, unlike static `NaN`.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
