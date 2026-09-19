# Walkthrough - Kotlin: Packages and Imports

In this lesson, we explored how Kotlin organizes code using packages and how to bring that code into other files using various import strategies.

## Changes Made

### Implementation
- Created [Utils.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/other/Utils.kt) in a sub-package `learn_kotlin.other` to provide entities for importing.
- Created [Packages.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Packages.kt) in the main `learn_kotlin` package which demonstrates:
    - **Single Imports**: Importing a specific function.
    - **Wildcard Imports**: Importing all members of a package.
    - **Import Aliasing**: Using the `as` keyword to resolve name clashes (e.g., `Message` vs `OtherMessage`).
    - **Default Imports**: Utilizing classes like `kotlin.math` that are available without explicit headers.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the package and import demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that the aliased import correctly refers to the class in the `other` package while the local `Message` class remains accessible.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
