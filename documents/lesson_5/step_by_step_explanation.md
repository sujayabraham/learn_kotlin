# Step-by-Step Explanation: Kotlin Control Flow

Kotlin's control flow structures are powerful because they can often be used as expressions, returning values directly.

## 1. Conditional Expressions: `if`
In Kotlin, `if` is an expression. This means it returns a value, effectively replacing the ternary operator (`? :`) found in Java.

```kotlin
val max = if (a > b) a else b
```

## 2. Conditional Expressions: `when`
The `when` expression is a more powerful version of the `switch` statement.
- **Subject**: You can check a specific variable.
- **No Subject**: You can use it as a cleaner `if-else if` chain by providing Boolean conditions for each branch.
- **Order**: Branches are checked from top to bottom.

## 3. Ranges and Progressions
Kotlin makes it easy to work with intervals.
- `1..4`: 1, 2, 3, 4 (Inclusive)
- `1..<4`: 1, 2, 3 (Exclusive end)
- `4 downTo 1`: Counting backwards.
- `step`: Changing the increment (e.g., `step 2`).

## 4. Loops
- **For**: Used to iterate over anything that provides an iterator (ranges, lists, sets, etc.).
- **While / Do-While**: Standard behavior, but `do-while` ensures the body runs at least once.

## 5. Exercises Implemented
- **FizzBuzz**: Used `when` without a subject to check for divisibility by 15, 3, and 5.
- **List Filtering**: Used a `for` loop combined with an `if` statement to filter words based on their starting character.

## 6. Verification
Verified by calling from Java via the generated `ControlFlowKt` class and building the project.
