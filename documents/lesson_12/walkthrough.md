# Walkthrough - Kotlin Tour: Intermediate Classes & Interfaces

In this lesson, we advanced our understanding of Object-Oriented Programming in Kotlin by exploring inheritance, abstract classes, interfaces, and the unique "Delegation" pattern.

## Changes Made

### Implementation
- Created [IntermediateClasses.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/IntermediateClasses.kt) which implements:
    - **Inheritance**: Using `open` to allow sub-classing and `override` to customize behavior.
    - **Abstract Classes**: Defining blueprints that cannot be instantiated but provide shared logic.
    - **Interfaces**: Demonstrating multiple inheritance (implementing `PaymentMethod` and `PaymentType`).
    - **Delegation**: Using the `by` keyword to delegate interface implementations to other objects, reducing boilerplate.
    - **Smart Home Exercise**: Implementation of `SmartDevice` and `SmartLight`.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these advanced OOP demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `Circle` correctly overrides `Shape`, and that `CanvasSession` delegates its `draw` call to `PenTool`.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
