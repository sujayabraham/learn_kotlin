# Walkthrough - Kotlin: Booleans

In this lesson, we explored the `Boolean` type in Kotlin, logical operations, short-circuiting behavior, and the nuances of nullable Booleans.

## Changes Made

### Implementation
- Created [Booleans.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Booleans.kt) which implements:
    - **Basic Booleans**: Simple `true` and `false` values and logical comparisons.
    - **Logical Operations**: Negation (`!`), Conjunction (`&&`), Disjunction (`||`), and Exclusive OR (`xor`).
    - **Short-circuiting**: Demonstrating that `&&` and `||` skip second operand evaluation when the result is determined by the first.
    - **Nullable Booleans**: Showing how `Boolean?` requires explicit checks against `true` or `false`.
    - **Operator Precedence**: Verifying the evaluation order of logical operators.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the Boolean demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that short-circuiting prevents side effects from executing and that precedence rules follow the documented order.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
