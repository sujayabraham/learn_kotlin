# Step-by-Step Explanation: Kotlin Control Flow

Kotlin provides expressive control flow mechanics, converting traditional branching constructs like `if` and `when` into equations that yield values, alongside flexible iterator mechanisms.

## 1. Expressions vs Statements
Unlike traditional imperative languages where conditional flows act as statements, Kotlin turns `if` and `when` blocks into **expressions**. This means they return a trailing block evaluation value that can be cleanly assigned immediately.
```kotlin
val max = if (a > b) a else b
```

## 2. Universal Branch Matching (`when`)
The `when` structure acts as a complete upgrade to traditional switch-case blocks:
- **Multi-match syntax**: Comma-separated inputs handle grouped target actions elegantly (`0, 1 -> ...`).
- **Dynamic targets**: Evaluation criteria are not bound to strict constants; runtime methods or variables are fully valid (`s.toInt() -> ...`).
- **Subjectless configuration**: Omit the target value entirely to execute alternative, highly readable if-else logic checks (`when { condition -> ... }`).

## 3. Structural Range Iteration
Loop iterations exploit range expressions explicitly:
- **`..`**: Complete inclusive ranges (`1..3` spans 1, 2, 3).
- **`until`**: Open-ended boundaries (`1 until 3` spans 1, 2).
- **`downTo` with `step`**: Decoupled inverted jumps (`6 downTo 0 step 2` sequences 6, 4, 2, 0).

## 4. Unconditional While Loops
`while` and `do-while` retain standard runtime structural mechanics, allowing iterative blocks to verify preconditions or execute at least once before post-evaluation checks occur.
