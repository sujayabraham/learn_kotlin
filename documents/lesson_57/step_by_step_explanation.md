# Step-by-Step Explanation: Delegated Properties in Kotlin

Property Delegation is a powerful language feature that allows the management, retrieval, and mutation logic of a property to be handled by an independent, reusable object instance known as a **Property Delegate**. This eliminates repetitive boilerplate for cross-cutting property logic.

## 1. Core Mechanics (`by`)
In a standard property configuration, the value is stored inside a local backing field slot. By applying the **`by`** keyword modifier, you instruct the compiler that the property has no backing field of its own. Instead, all read operations (`get()`) and write operations (`set()`) are automatically forwarded to a target delegate object instance:
```kotlin
var databaseStatus: String by Delegates.observable("OFFLINE") { ... }
```

## 2. Built-in Standard Delegates

### A. Lazy Initialization (`by lazy`)
The **`lazy`** delegate allows a property to postpone its initialization until the very first time it is read by a running thread:
- The initialization code block runs exactly once upon initial access.
- The evaluated result is cached. Subsequent reads return the cached value instantly without executing the initialization block again.
- Ideal for loading heavy files, initializing database drivers, or creating complex singletons.

### B. Observable Properties (`Delegates.observable`)
The **`observable`** delegate acts as an automatic property change interceptor. It accepts an initial value and a lambda callback. Whenever the property value is updated, the callback triggers automatically, providing the property metadata along with the old value and the newly assigned value. Perfect for logging state updates or triggering UI refreshes.

## 3. Creating Custom Property Delegates
You can easily design custom property delegates to reuse specialized property logic across your codebase (e.g., auto-trimming strings, parsing JSON strings, caching items in local storage).
- A delegate class managing a `val` property must implement an operator function named **`getValue`**.
- A delegate class managing a mutable `var` property must implement both **`getValue`** and **`setValue`** operator functions.
- These operators accept a reference to the enclosing host object instance (`thisRef`) along with property metadata (`KProperty<*>`).

```kotlin
class CustomStringTrimmerDelegate {
    private var internalValue: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = internalValue

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        internalValue = value.trim() // Intercepts write and applies trim validation
    }
}
```
