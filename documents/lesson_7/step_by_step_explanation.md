# Step-by-Step Explanation: Kotlin Classes and Objects

Kotlin's approach to classes is highly concise, especially when it comes to declaring properties and constructors.

## 1. Class Header vs Body
In Kotlin, you can declare properties directly in the class header. This acts as both the constructor parameter and the class property definition.

```kotlin
class Contact(val id: Int, var email: String)
```
- `val`: Creates a read-only property (and a getter).
- `var`: Creates a mutable property (and both getter and setter).

## 2. Data Classes
Data classes are one of Kotlin's most beloved features. By prefixing a class with `data`, the compiler automatically generates:
- `toString()`: A human-readable representation.
- `equals()` and `hashCode()`: Based on the properties.
- `copy()`: To create a new instance with some properties modified.

## 3. Java Interoperability
When you use a Kotlin class from Java:
- Properties declared in the header are accessed via standard Java Beans conventions (e.g., `getEmail()`, `setEmail()`).
- The primary constructor is available as a standard Java constructor.
- Data class methods like `copy()` are also accessible, though `copy` requires all arguments from Java unless you use specific annotations.

## 4. Exercises Implemented
- **Employee Data Class**: Shows that data classes can have mutable (`var`) properties.
- **RandomEmployeeGenerator**: Demonstrates that Kotlin classes can contain complex logic, use standard library functions like `List.random()`, and use other classes as return types.

## 5. Verification
Verified by building the project. The Java code successfully interacted with the Kotlin `Contact` class, demonstrating the automatic synthesis of getters and setters.
