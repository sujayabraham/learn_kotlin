# Step-by-Step Explanation: Returns and Jumps in Kotlin

Kotlin features structural jump expressions (`return`, `break`, and `continue`) and augments them with structural **labels** to offer fine-grained control over execution loops and closures.

## 1. Structural Jumping Operators
Kotlin provides three main jump structures:
- `return`: By default, returns from the nearest enclosing function or anonymous function.
- `break`: Terminates the nearest enclosing loop.
- `continue`: Advances execution directly to the next step of the nearest enclosing loop.

## 2. Labeled Loops (`break@label` and `continue@label`)
In nested loops, standard jumps only affect the immediate interior loop. Kotlin permits qualifications by placing a custom user definition prefix followed by an `@` symbol (e.g. `labelName@`).
- A `break@labelName` instantly tears down execution for the specifically specified loop.
- A `continue@labelName` directly skips everything inside, proceeding to evaluate the next cycle step of the labeled loop.

## 3. Labeled Lambda Returns (`return@label`)
When writing expressions inside standard lambdas, an unqualified `return` statement is strictly prohibited unless the lambda is inline. If it is inline, a standard `return` will execute a **non-local return**, terminating the outer enclosing function.

To return early from the lambda itself (mimicking a loop's `continue`), you must qualify the statement with a label:
- **Explicit Labels**: Defined by marking the lambda call explicitly (`numbers.forEach lit@{ ... return@lit }`).
- **Implicit Labels**: Automatically populated by the compiler matching the exact name of the higher-order function invoking the block (`return@forEach`).

## 4. Anonymous Function Fallback
If you prefer standard control flow paths without explicit label matching syntax parameters, you can write an **anonymous function** (`fun(value: Int) { ... }`). A `return` inside an anonymous function returns from that function block directly, operating identically to normal function return paths.

## 5. Returning Values alongside Labels
When executing a return to a specific closure layer (such as a `run` execution scope block), you pass the return value directly behind the target label:
```kotlin
val result = run lit@{
    return@lit "Return value cleanly"
}
```
