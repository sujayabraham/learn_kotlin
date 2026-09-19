# Walkthrough - Kotlin: Inline Value Classes

In this lesson, we explored compile-time data flattening using inline value classes, learning how to add domain-level validation and methods to primitive objects with zero memory allocation cost.

## Changes Made

### Implementation
- Configured [EnumAndInlineDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/EnumAndInlineDemo.kt) to include a strongly typed `@JvmInline value class SecureIdToken` wrapping a singular string value component.
- Implemented data verification code inside the `init` block to enforce validation constraints at construction time.
- Designed custom member functions and computed getters (`maskedToken`) directly on the wrapper class.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to integrate and trigger the inline value class simulation suite.

## Verification
- **Build Verification**: Clean compilation completed successfully through standard Gradle execution paths.
- **Runtime Optimization Logic**: Verified that properties evaluate correctly and formatting text runs without problems, confirming that code remains type-safe while compiling down to flat, fast primitive operations.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
