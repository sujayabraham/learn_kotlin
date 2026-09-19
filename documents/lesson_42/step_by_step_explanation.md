# Step-by-Step Explanation: Operator Overloading in Kotlin

Kotlin allows you to provide custom implementations for a predefined set of operators on your types. These operators have fixed symbolic representations (like `+`, `*`, `[]`) and map directly to specific named member or extension functions behind the scenes.

## 1. Predefined Mapping Architecture
Unlike some languages where you can invent entirely new operators or symbols, Kotlin restricts you to overloading an established list of symbols. 
- To overload a symbol, you must prefix the method signature with the explicit **`operator`** modifier keyword.
- The symbol name maps to a strict internal method naming convention enforced by the compiler.

## 2. Binary Arithmetic Operators
Binary arithmetic operators take a left-hand operand and a right-hand operand, returning a combined type instance:
- `a + b` translates directly under compilation to `a.plus(b)`.
- `a - b` translates directly under compilation to `a.minus(b)`.
- `a * b` translates directly under compilation to `a.times(b)`.

## 3. Unary Operators
Unary operators execute transformations on a singular target operand expression:
- `-a` translates under compilation to `a.unaryMinus()`.
- `+a` translates under compilation to `a.unaryPlus()`.
- `!a` translates under compilation to `a.not()`.

## 4. Indexed Access Operator (`[]`)
The square bracket syntax provides array-like container querying and mutation access conventions for your custom data collections:
- `container[i]` translates to `container.get(i)`.
- `container[i, j]` maps to a multi-parameter get call: `container.get(i, j)`.
- `container[i] = value` translates to an explicit set assignment: `container.set(i, value)`.

## 5. The Membership Operator (`in`)
The `in` operator evaluates containment bounds inside structures:
- `a in container` translates directly to `container.contains(a)`.
- `a !in container` translates directly to `!container.contains(a)`.

## 6. The Function Call Operator (`invoke`)
Overloading the `invoke` operator allows an instance object of your class to be called directly using standard parenthesis function invocation notation:
- `instance("arg")` translates under compilation directly to `instance.invoke("arg")`.
- This is incredibly useful for defining single-responsibility services, callback mechanisms, or establishing clean command-pattern triggers.
