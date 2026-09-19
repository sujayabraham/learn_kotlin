# Walkthrough - Kotlin: Nested and Inner Classes

In this lesson, we explored how Kotlin distinguishes between static nested classes and instance-bound inner classes, managing reference scopes and lifecycle dependencies cleanly.

## Changes Made

### Implementation
- Created [NestedClassesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/NestedClassesDemo.kt) which implements:
    - **Static Nested Class Hierarchy**: Formulating a static `DeviceSpecification` class that is completely isolated from the outer class context.
    - **Instance-Bound Inner Classes**: Implementing an `EmbeddedController` with the `inner` modifier keyword to grant full access to private fields of the parent container class (`securityKernelKey`).
    - **Enclosing Reference Target Validation**: Demonstrating labeled `this` scoping (`this@SmartDeviceWorkspace`) to extract properties dynamically.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to append and call the nested classes demonstration runner function.

## Verification
- **Build Verification**: Clean compilation achieved across the application project module using standard Gradle builders.
- **Reference Logic**: Verified that standard nested classes instantiate directly from the class token name, while inner classes require an active outer object constructor call sequence and successfully print private enclosing field records.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
