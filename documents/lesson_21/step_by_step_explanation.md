# Step-by-Step Explanation: Kotlin Visibility Modifiers

Kotlin provides a robust set of visibility modifiers designed to improve encapsulation and modularity.

## 1. The Four Modifiers
1.  **`public` (Default)**: Visible everywhere.
2.  **`private`**: 
    - At top-level: Visible only within the file.
    - Inside a class: Visible only within the class.
3.  **`internal`**: Visible only within the same **module** (e.g., a Gradle source set). This is a powerful tool for building libraries.
4.  **`protected`**: 
    - Visible only within the class and its subclasses.
    - **Crucial Difference**: Unlike Java, `protected` in Kotlin does NOT grant access to other classes in the same package.

## 2. Top-level Visibility
You can control the visibility of classes, functions, and properties defined directly in a package.
- `private` is great for utility functions used only within one file.
- `internal` allows you to hide implementation details from users of your library while keeping them accessible across your own project's files.

## 3. Class and Interface Members
Visibility modifiers inside classes work similarly to Java but with the stricter `protected` and the addition of `internal`.
- Note: An outer class does not see private members of its inner or nested classes.

## 4. Constructor Visibility
To hide a primary constructor, you must use the `constructor` keyword explicitly:
```kotlin
class User private constructor(val name: String)
```
This is often used in conjunction with a `companion object` factory or the Builder pattern.

## 5. Local Declarations
Local variables and functions (defined inside a method) cannot have visibility modifiers. Their scope is always restricted to the block where they are declared.

## 6. Verification
Verified by building the project. The implementation showed that `internal` properties are accessible within the module, while `private` top-level functions are hidden from other files.
