# Step-by-Step Explanation: Kotlin Strings

Kotlin strings are designed to be both compatible with Java's `String` class and much more expressive through built-in language features.

## 1. Immutability
Just like in Java, Kotlin strings are **immutable**. Operations like `replace()` or `uppercase()` do not modify the original string; they return a brand new one.

## 2. String Literals
- **Escaped Strings**: Enclosed in `"..."`. They support standard backslash escapes (e.g., `\n`, `\t`).
- **Raw Strings**: Enclosed in `"""..."""`. They preserve newlines and do not support escapes. They are ideal for regex, SQL, or long text blocks.

## 3. Managing White Space
Raw strings often have leading spaces for alignment in code. Kotlin provides two main tools:
- **`trimIndent()`**: Removes common leading whitespace.
- **`trimMargin()`**: Removes everything before a specified character (default is `|`) on each line.

## 4. String Templates
This is the most common way to build strings in Kotlin.
- **`$var`**: Replaces with the variable value.
- **`${expr}`**: Evaluates the expression and replaces with the result.
To use a literal `$` in a template, use `${'$'}`.

## 5. Structural vs. Referential Equality
- **`==`**: Checks for content equality (calls `equals()`). This is what you almost always want.
- **`===`**: Checks if two references point to the exact same object in memory.

## 6. String Concatenation
While `+` works, it can be inefficient in loops.
- Use **String Templates** for simple building.
- Use **`buildString { ... }`** for complex, multi-step construction.

## 7. Verification
Verified by building the project. The implementation output confirmed the behavior of raw strings, templates, and the distinction between content and reference equality.
