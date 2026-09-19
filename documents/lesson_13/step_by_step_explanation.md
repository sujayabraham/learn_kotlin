# Step-by-Step Explanation: Kotlin Objects

Kotlin simplifies the Singleton pattern and shared state management using the `object` keyword.

## 1. Object Declarations
An object declaration is both a class and a single instance of that class.
- **Singleton**: There is only one instance of `DoAuth` in the entire application.
- **Lazy**: It's only initialized when first accessed.
- **No Constructor**: Because it's a single instance, you cannot call `new` or pass parameters to it.

## 2. Data Objects
Similar to data classes, `data object` provides a clean `toString()` and handles `equals()` automatically.
- Unlike data classes, they don't have a `copy()` method (since there's only one instance to copy).

## 3. Companion Objects
If you need something to be "static" (in Java terms), you put it in a `companion object`.
- It belongs to the class, not a specific instance.
- Only one companion object is allowed per class.
- It can be named (e.g., `Bonger`) or unnamed (defaults to `Companion`).

## 4. Java Interoperability
Java doesn't have a direct equivalent to `object`, so Kotlin generates specific fields:
- **Object Declarations**: Accessed via `INSTANCE`.
- **Companion Objects**: Accessed via `Companion` or the custom name you gave it.

```java
// Java code
DoAuth.INSTANCE.takeParams("user", "pass");
BigBen.Bonger.getBongs(5);
```

## 5. Verification
Verified by building the project. The Java code successfully accessed the Kotlin singleton and companion object, demonstrating how Kotlin's advanced object features map to standard Java fields.
