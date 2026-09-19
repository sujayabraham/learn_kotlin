# Walkthrough - Kotlin: Unsigned Integer Types

In this lesson, we explored Kotlin's support for unsigned integer types. These types allow for representing non-negative values and utilizing the full bit range of the underlying numeric storage.

## Changes Made

### Implementation
- Created [UnsignedNumbers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/UnsignedNumbers.kt) which implements:
    - **Unsigned Types**: Demonstrating `UByte`, `UShort`, `UInt`, and `ULong`.
    - **Literals**: Using the `u` and `uL` suffixes.
    - **Conversion**: Showing how to convert between signed and unsigned types (e.g., `toUInt()`).
    - **Unsigned Arrays**: Using specialized array types like `UByteArray` and `UIntArray` with the `@OptIn` annotation.
    - **Arithmetic and Ranges**: Demonstrating that unsigned types support standard operations and can be used in ranges.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the unsigned numbers demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that `10u / 3u` result is `3u` and that signed `-1` converted to `UInt` results in `4294967295u`, preserving the bit pattern.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
