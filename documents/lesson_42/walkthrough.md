# Walkthrough - Kotlin: Operator Overloading

In this lesson, we explored how to bind mathematical and structural operators to custom class configurations by exploiting structural operator functions.

## Changes Made

### Implementation
- Created [OperatorOverloadingDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/OperatorOverloadingDemo.kt) which implements:
    - **Arithmetic Operators**: Mapping addition (`+`) and sign-inversion (`-`) symbols onto a `Point2D` data class.
    - **Indexed Array Operators**: Mapping square bracket container actions (`box[0]`, `box[1] = p`) onto a custom wrapper class.
    - **Containment Operators**: Overloading member verification checks (`p in box`) using the `contains` operator.
    - **Invoke Operator**: Simulating dynamic functional service execution triggers via direct instance calls (`greeter("...")`).
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to wire up and invoke the operator overloading demonstration suite.

## Verification
- **Build Verification**: Compiled seamlessly via the standard Gradle toolkit configurations.
- **Operational Logic**: Verified that custom addition sequences evaluate to combined point sums, container checks return true bounds, and invoke operations call underlying logic strings.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
