# Step-by-Step Explanation: Kotlin Properties

Kotlin properties are much more than just fields; they are sophisticated accessors with built-in support for delegation and custom logic.

## 1. Backing Fields and `field`
When you write a custom getter or setter, you often need to refer to the actual data stored for that property. You must use the `field` keyword.
```kotlin
var name: String = ""
    set(value) {
        field = value.trim() // 'field' is the backing field
    }
```
If you used `this.name = ...` inside the setter, you would trigger the setter again, causing a `StackOverflowError`.

## 2. Extension Properties
Like extension functions, extension properties let you add new API surface to a class. However, because they are defined outside the class, they **cannot have backing fields**. They must compute their value every time.

## 3. Delegation with `by`
Kotlin allows you to delegate the "how" of a property to another object. The most common delegates are:
- **`lazy`**: The value is computed only on first access and cached.
- **`observable`**: Executes a callback after every change.

## 4. Custom Delegates
By implementing `getValue` (and `setValue`), any object can become a property delegate. This is useful for cross-cutting concerns like caching or database syncing.

## 5. Exercises Implemented
- **Indices**: Demonstrated `inventory.indices` for safe iteration.
- **asMiles**: Showed how to add simple unit conversion to `Double`.
- **Lazy Checks**: Showed how to avoid expensive calls (like `checkDatabase()`) unless they are actually required by the logic.

## 6. Verification
Verified by building the project. The Java code successfully called the demonstration function, which printed the expected lifecycle of lazy and delegated properties to the console.
