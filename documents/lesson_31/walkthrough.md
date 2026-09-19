# Walkthrough - Kotlin: Type Casts

In this lesson, we explored how Kotlin handles type checking and type conversions safely using explicit operators and advanced compiler smart casts.

## Changes Made

### Implementation
- Created [TypeCasts.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/TypeCasts.kt) which implements:
    - **Type Validation**: Checking object types with the `is` and `!is` operators.
    - **Smart Casts**: Demonstrating automated type casting within `if` blocks, conditional expressions (`&&`), and `when` branches.
    - **Unsafe Casts**: Using explicit `as` operators to force type changes and handling `ClassCastException` failures.
    - **Safe Casts**: Using the `as?` operator to cleanly recover `null` rather than crashing on mismatched structures.
    - **Generic Type Casts**: Using star projections (`List<*>`) to check collections at runtime despite JVM type erasure.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the type casting demonstration suite.

## Verification
- **Build**: Successfully ran gradle task compilation.
- **Logic**: Verified that unsafe casts throw exceptions upon mismatch whereas safe casts (`as?`) evaluate cleanly to `null`.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
