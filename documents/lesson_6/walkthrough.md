# Walkthrough - Kotlin Tour: Functions

In this lesson, we explored how Kotlin defines and uses functions, including modern features like default parameters, single-expression functions, and lambda expressions.

## Changes Made

### Implementation
- Created [Functions.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Functions.kt) which implements:
    - `sumNumbers(x, y)`: Standard function declaration.
    - `printMessageWithPrefix(message, prefix)`: Uses **default parameters**. Added `@JvmOverloads` to make it accessible from Java without providing all arguments.
    - `sumSingle(x, y)`: **Single-expression function** using the `=` operator.
    - `demonstrateLambdas()`: Shows variable assignment of lambdas and **trailing lambda** syntax with `filter` and `fold`.
    - `runFunctionsExercises()`: Includes solutions for circle area, time conversion, and URL generation.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute these demonstrations.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Java Interop**: Verified that `@JvmOverloads` allows Java to call the Kotlin function with only one argument.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
