# Step-by-Step Explanation: Execute an expression if null

The "Execute an expression if null" idiom is a powerful way to handle nullability in a concise and expressive manner using the Elvis operator (`?:`).

## 1. The Elvis Operator (`?:`)
The Elvis operator works by checking the expression on its left:
- If it's **not null**, the operator returns the value of the left expression.
- If it **is null**, it evaluates and returns the expression on the right.

## 2. Failing Fast with `throw`
One of the most common uses of this idiom is to throw an exception if a required value is missing.
```kotlin
val email = values["email"] ?: throw IllegalStateException("Email missing")
```
This is much more concise than an `if` check with an explicit `throw`.

## 3. Complex Fallback with `run`
If you need more than a single value or a simple throw as a fallback, you can use the `run` scope function on the right side of the Elvis operator.
```kotlin
val result = nullableValue ?: run {
    val temp = calculateFallback()
    temp * 2
}
```
The `run` block will only execute if `nullableValue` is null.

## 4. Why it's Idiomatic
- **Conciseness**: It reduces boilerplate code.
- **Readability**: It clearly expresses the intent: "Get this value, or do this other thing if it's not there."
- **Safety**: It forces you to think about the null case.

## 5. Verification
Verified by building the project. The implementation demonstrated both throwing an exception and using a fallback block, with the results printed to the console.
