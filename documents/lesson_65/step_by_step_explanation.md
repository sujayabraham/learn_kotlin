# Step-by-Step Explanation: Kotlin Grammar and Syntax

The Kotlin grammar defines the formal rules for how code is structured. While technical, understanding the grammar helps clarify why Kotlin feels different from Java and how its unique features are implemented.

## 1. File Structure
A Kotlin file (`.kt`) is more than just a class container.
- It can contain **multiple declarations** at the top level: classes, interfaces, objects, functions, and properties.
- This allows for "script-like" utility files without forcing every function into a class.

## 2. Expressions vs. Statements
A core philosophical pillar of Kotlin's grammar is that **most constructs are expressions**.
- An **expression** returns a value (e.g., `1 + 1`, `if (a > b) a else b`).
- A **statement** performs an action but returns nothing (e.g., a variable declaration `val x = 1`).
- Because `if`, `when`, and `try` are expressions, they can be used on the right side of an assignment, reducing boilerplate.

## 3. Local Functions
Kotlin's grammar allows functions to be nested within other functions.
- Local functions can access variables from the outer function's scope (closures).
- This is useful for code organization and hiding implementation details that only matter to a single task.

## 4. Labels and Control Flow
The grammar includes support for **Labels** (e.g., `loop@`).
- Labels can be attached to loops or lambda expressions.
- They allow for precise control over `break`, `continue`, and `return` in nested structures, enabling you to exit an outer loop from an inner one.

## 5. Property Accessors
Kotlin properties are not just fields. The grammar supports custom `get()` and `set()` blocks directly within the property declaration, enforcing encapsulation at the language level.
