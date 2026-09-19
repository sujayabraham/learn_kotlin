# Walkthrough - Kotlin Tour: Properties

In this lesson, we explored how Kotlin manages data through properties. We covered backing fields, custom accessors, extension properties, and the powerful delegation model including `lazy` and `observable`.

## Changes Made

### Implementation
- Created [Properties.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Properties.kt) which implements:
    - **Backing Fields**: Using the `field` keyword in a custom setter to format strings.
    - **Extension Properties**: Adding a `fullName` property to a data class without modifying its source.
    - **Delegated Properties**: A custom `CachedStringDelegate` to demonstrate manual delegation logic.
    - **Lazy Properties**: Using `by lazy` for thread-safe, deferred initialization (Database example).
    - **Observable Properties**: Using `Delegates.observable` to trigger logic on value changes (Thermostat example).
    - **Exercises**:
        - List indices for out-of-stock items.
        - `Double.asMiles` extension property.
        - Lazy health checks for system monitoring.
        - Budget tracker with thresholds using observables.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `field` prevents infinite recursion and that `lazy` initialization only happens once.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
