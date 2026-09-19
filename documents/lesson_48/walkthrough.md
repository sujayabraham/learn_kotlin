# Walkthrough - Kotlin: Advanced Inheritance Rules

In this lesson, we explored explicit inheritance controls, property overriding dynamics, enforcing finality constraints, and resolving multi-inheritance conflicts.

## Changes Made

### Implementation
- Created [InheritanceRulesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/InheritanceRulesDemo.kt) which implements:
    - **Core Account Hierarchies**: Defining an open base account with open properties (`interestRate`) and final auditing routines.
    - **Final Overrides**: Enforcing finality constraints (`final override`) on overridden subclass actions to prevent downstream alterations.
    - **Qualified Super Routines**: Triggering parent functionality using the `super` keyword reference.
    - **Diamond Inheritance Resolution**: Implementing a `ButtonWidget` that resolves drawing clashes between a `RectangleShape` base class and a `TextOverlay` interface via explicit angle-bracket routing (`super<RectangleShape>.draw()`).
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to coordinate and invoke the inheritance rules demonstration.

## Verification
- **Build Verification**: Clean compilation achieved across the app project module via standard Gradle scripts.
- **Conflict Checking**: Confirmed that the `ButtonWidget` cleanly invokes both the class drawing logic and the interface text overlay routine sequentially without compilation errors.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
