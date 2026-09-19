# Walkthrough - Kotlin Coding Conventions: Backing Properties

In this lesson, we focused on the specific Kotlin coding convention for naming **Backing Properties**. This is a common pattern used to preserve encapsulation while providing a public read-only view of mutable internal state.

## Changes Made

### Implementation
- Created [BackingProperties.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/BackingProperties.kt) which implements:
    - **Inventory Class**: Uses the underscore prefix convention (`_items`) for the private mutable list and a public read-only property (`items`) for the API.
    - **Demonstration**: Shows how the public API prevents external modifications while the internal logic remains flexible.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the convention demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that the naming follows the official Kotlin Style Guide and correctly implements the encapsulation pattern.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
