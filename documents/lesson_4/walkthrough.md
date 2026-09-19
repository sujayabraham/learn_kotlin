# Walkthrough - Kotlin Tour: Collections

In this lesson, we covered the three primary collection types in Kotlin: Lists, Sets, and Maps. We explored the critical distinction between read-only and mutable collections and practiced common operations.

## Changes Made

### Implementation
- Created [Collections.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Collections.kt) which implements:
    - `demonstrateLists()`: Ordered collections with duplicates. Shows `listOf()` vs `mutableListOf()`.
    - `demonstrateSets()`: Unordered collections with unique items. Shows `setOf()` vs `mutableSetOf()`.
    - `demonstrateMaps()`: Key-value pairs. Shows `mapOf()` vs `mutableMapOf()`.
    - `runCollectionsExercises()`: Practical examples combining these concepts.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Runtime**: Verified that sets correctly drop duplicates and maps return `null` for missing keys while allowing mutable updates.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
