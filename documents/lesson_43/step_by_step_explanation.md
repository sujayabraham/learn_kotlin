# Step-by-Step Explanation: Unused Return Value Checker in Kotlin

Kotlin integrates robust static inspection checkers and linter tools (such as the `@CheckResult` paradigm) to intercept potential logic vulnerabilities where pure function return expressions are discarded by the caller.

## 1. The Ignored Return Value Vulnerability
In functional programming and immutable data management, methods do not modify internal class state directly. Instead, they evaluate and return a newly generated instance representation:
- Calling `string.replace("a", "b")` as a standalone statement does not modify the original string; it yields a brand new string value.
- If a developer writes `myString.replace("a", "b")` without assigning the result to a variable, the statement executes but the result is lost, which often indicates a logic bug.

## 2. Static Checker Mechanics (`@CheckResult`)
The compiler toolchain introduces static structural inspections to prevent these mistakes:
- Functions whose output calculations must be used are decorated with an indicator flag like `@CheckResult`.
- When the linter analyzes code statements, it tracks whether the result of a decorated function call is assigned to a variable, passed as a parameter, or returned out of the containing method.
- If a decorated function is invoked as a standalone expression statement, the toolchain immediately raises a warning or compile-time error.

## 3. Pure Functions and Immutability
This check is especially critical for:
- **String Manipulations**: Standard strings are immutable, meaning method transformations always require assignment captures.
- **Security Calculations**: Generating verification hashes or cryptographic tokens that must be retained.
- **Data Collections Builders**: Operations on persistent collections that return modified collection copies instead of modifying the structure in place.
