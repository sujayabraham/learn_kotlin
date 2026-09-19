# Walkthrough - Kotlin: Interfaces

In this lesson, we explored how Kotlin interfaces allow you to mix abstract declarations, state-free custom properties, and default methods while managing diamond-problem method conflicts.

## Changes Made

### Implementation
- Created [InterfacesAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/InterfacesAdvanced.kt) which implements:
    - **Default and Abstract Methods**: Defining payment handling actions inside a `PaymentProcessor` contract hierarchy.
    - **Stateless Properties**: Overriding an abstract property and evaluating a property with a custom getter block (`processingFeeRate`).
    - **Signature Conflict Resolution**: Implementing two interfaces concurrently that hold identical method names, and cleanly resolving the ambiguity via explicit `super<Interface>.methodName()` delegation blocks.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to wire up and invoke the advanced interfaces demonstration runner.

## Verification
- **Build Verification**: Compiled seamlessly via standard Gradle toolkit configurations.
- **Conflict Resolution Logic**: Verified that when triggering `printReceipt`, both parent interface blocks execute sequentially via qualified super notation hooks.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
