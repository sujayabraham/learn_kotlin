# Step-by-Step Explanation: Kotlin Characters

Kotlin handles characters as distinct types, not as numeric values, which improves type safety and clarity.

## 1. The `Char` Type
A `Char` represents a single UTF-16 code unit.
- **Literal**: Must be in single quotes: `'A'`.
- **Not a Number**: You cannot assign a number directly to a `Char` (e.g., `val c: Char = 65` is an error in Kotlin). You must use `65.toChar()`.

## 2. Escape Sequences
Kotlin supports standard backslash escape sequences for special characters:
- `\t`: Tab
- `\n`: New line
- `\r`: Carriage return
- `\'`, `\"`, `\\`: Quotes and backslashes
- `\$`: Dollar sign (needed because of string templates)

## 3. Unicode and Emojis
You can represent any BMP character using `\u` plus 4 hex digits (e.g., `\u0041` for 'A').
For characters outside the BMP, like emojis (e.g., 🚀), Kotlin uses **surrogate pairs**. This means an emoji is stored as two `Char` units in a `String`.

## 4. Conversion and Arithmetic
- **Unicode Value**: Use `char.code` to get the `Int` representation.
- **Digit Value**: Use `char.digitToInt()` to convert `'7'` to `7`. This is much safer than subtraction (like `'7' - '0'`).
- **Arithmetic**: You can add or subtract integers to/from characters: `'a' + 1` results in `'b'`.

## 5. JVM Boxing
On the JVM:
- `Char` is a primitive `char`.
- `Char?` (nullable) is a boxed `java.lang.Character` object.

## 6. Verification
Verified by building the project. The implementation demonstrated that character arithmetic and Unicode sequences work as expected, and surrogate pair behavior for emojis was correctly identified via `String.length`.
