# Step-by-Step Explanation: Kotlin Numbers

Kotlin's approach to numbers is designed for precision and performance on the JVM.

## 1. Explicit Conversions are Required
Unlike Java, Kotlin does not automatically convert smaller types to larger types. For example, you cannot assign an `Int` to a `Long` without an explicit conversion.
```kotlin
val i: Int = 1
val l: Long = i.toLong() // Required
```
This prevents subtle bugs caused by implicit widening.

## 2. Literals and Readability
- **Long**: Suffix `L` (e.g., `1L`).
- **Float**: Suffix `f` or `F` (e.g., `1.0f`).
- **Hex**: Prefix `0x` (e.g., `0xFF`).
- **Binary**: Prefix `0b` (e.g., `0b11`).
- **Underscores**: `1_000_000` is allowed for readability.

## 3. Bitwise Operations as Infix Functions
Kotlin uses named infix functions for bitwise operations instead of special characters:
- `shl`: Shift left (`<<`)
- `shr`: Shift right (`>>`)
- `ushr`: Unsigned shift right (`>>>`)
- `and`, `or`, `xor`, `inv`

## 4. JVM Boxing and Caching
On the JVM, numbers are stored as primitives unless they are nullable (`Int?`) or used in generics. Boxed integers between -128 and 127 are cached, so `===` (referential equality) will be `true` for them, but `false` for values outside this range.

## 5. Floating-Point Nuances
Kotlin follows IEEE 754 for floating-point comparisons.
- **Static Types**: `NaN != NaN`.
- **Boxed Types**: `NaN == NaN` and `-0.0 < 0.0`.
This difference occurs because boxed comparisons use `Double.equals()` or `Double.compareTo()`, which provide a total ordering.

## 6. Verification
Verified by building the project. the demonstration output confirmed the behavior of cached integers and the difference between static and boxed `NaN` comparisons.
