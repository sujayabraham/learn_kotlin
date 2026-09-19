# Walkthrough - Kotlin: Arrays

In this lesson, we explored how Kotlin handles arrays, from simple factory functions to optimized primitive arrays and multidimensional structures. We also learned about comparing array contents and using the spread operator.

## Changes Made

### Implementation
- Created [Arrays.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Arrays.kt) which implements:
    - **Array Creation**: Using `arrayOf()`, `arrayOfNulls()`, and the `Array` constructor with an initialization lambda.
    - **Element Access**: Using the `[]` operator for both reading and writing.
    - **Primitive Arrays**: Using specialized types like `IntArray` and `DoubleArray` to avoid boxing overhead.
    - **Comparison**: Demonstrating the difference between reference equality (`==`) and content equality (`contentEquals()`/`contentDeepEquals()`).
    - **Spread Operator**: Using `*` to pass array elements into a `vararg` parameter.
    - **Multidimensional Arrays**: Creating and printing nested arrays using `contentDeepToString()`.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the array demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `a1 == a2` is false for arrays with identical content, while `a1.contentEquals(a2)` is true, highlighting the importance of using content-aware functions.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
