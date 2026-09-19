# Step-by-Step Explanation: Kotlin Booleans

Kotlin handles Boolean values similarly to other JVM languages but with strict type safety and built-in support for nullability.

## 1. The Boolean Type
The `Boolean` type has two possible values: `true` and `false`. Unlike some languages (like C or JavaScript), Kotlin does not treat integers (like 0 or 1) as Booleans.

## 2. Logical Operators
- **`!` (Negation)**: Inverts a boolean value.
- **`&&` (Conjunction)**: Returns true if both sides are true. Exhibits short-circuiting (if the left side is false, the right side is not evaluated).
- **`||` (Disjunction)**: Returns true if at least one side is true. Exhibits short-circuiting (if the left side is true, the right side is not evaluated).
- **`xor` (Exclusive OR)**: An infix function that returns true if exactly one side is true.

## 3. Operator Precedence
When combining operators, they are evaluated in this order:
1. `!`
2. `xor`
3. `&&`
4. `||`

For example, `true || false && false` is evaluated as `true || (false && false)`, which is `true`.

## 4. Nullable Booleans (`Boolean?`)
A `Boolean?` can be `true`, `false`, or `null`. Because of this, it cannot be used directly in an `if` statement like a non-nullable Boolean.
```kotlin
val b: Boolean? = null
// if (b) { ... } // Error
if (b == true) { ... } // Safe
```

## 5. Verification
Verified by building the project. The implementation output confirmed that short-circuiting prevents side effects and that nullable booleans are handled safely with explicit comparisons.
