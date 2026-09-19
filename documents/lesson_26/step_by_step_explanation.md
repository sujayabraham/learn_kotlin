# Step-by-Step Explanation: Unsigned Integer Types

Kotlin provides a set of types for working with non-negative numbers, useful for tasks like bit manipulation and low-level IO.

## 1. The Four Unsigned Types
- `UByte`: 8-bit, 0 to 255.
- `UShort`: 16-bit, 0 to 65,535.
- `UInt`: 32-bit, 0 to 4,294,967,295.
- `ULong`: 64-bit, 0 to 2^64 - 1.

These are implemented as **inline classes**, meaning they carry zero runtime overhead compared to their signed counterparts.

## 2. Unsigned Literals
To create an unsigned number, add the `u` or `U` suffix.
- `1u` is a `UInt` by default.
- `1uL` or `1UL` is explicitly a `ULong`.
- If you assign a `u` literal to a `UByte` or `UShort` variable, the compiler handles the conversion if the value fits.

## 3. Explicit Conversions
Signed and unsigned types are not interchangeable. You must use conversion functions:
- `toInt().toUInt()` and vice-versa.
- Converting a negative signed number to an unsigned type preserves the binary representation (e.g., `-1` becomes the maximum possible unsigned value).

## 4. Unsigned Arrays and Opt-in
Specialized array types like `UIntArray` exist to prevent boxing.
- **Experimental Status**: As of current Kotlin versions, unsigned arrays are in Beta. To use them without warnings, you must use the `@OptIn(ExperimentalUnsignedTypes::class)` annotation.

## 5. Usage Recommendations
Kotlin's designers recommend using unsigned types only when you specifically need the extra bit range or for bitwise operations. For general-purpose "non-negative" values (like list sizes), **signed** integers are still preferred to help detect errors like negative indices.

## 6. Verification
Verified by building the project. The output demonstrated arithmetic results and the conversion of a negative signed integer to its unsigned equivalent.
