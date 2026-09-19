# Step-by-Step Explanation: Intermediate Classes & Interfaces

Kotlin provides a robust hierarchy for building complex systems while maintaining strict rules to prevent common OOP pitfalls.

## 1. Controlled Inheritance
Unlike Java, where classes are open by default, Kotlin classes are **closed** by default. To allow inheritance, you must explicitly mark a class as `open`.

```kotlin
open class Shape(val name: String)
class Circle(...) : Shape("Circle")
```

## 2. Abstract Classes
Abstract classes are inherently "open" but cannot be instantiated. They are perfect for defining a base type that has some shared logic but requires sub-classes to fill in specific details (abstract members).

## 3. Interfaces and Multiple Inheritance
Interfaces are contracts. A class can implement as many interfaces as it needs.
- **Default Methods**: Kotlin interfaces can contain logic (though the "Tour" focused on pure contracts).
- **Properties**: Interfaces can define properties that must be overridden in the implementing class.

## 4. Delegation with `by`
Delegation is a first-class citizen in Kotlin. Instead of writing wrapper methods for every function in an interface, you can delegate the entire implementation to a field.

```kotlin
class CanvasSession(val tool: DrawingTool) : DrawingTool by tool
```
This tells the compiler: "Any call to `DrawingTool` methods on `CanvasSession` should be forwarded to `tool`."

## 5. The `Any` Class
Every class in Kotlin inherits from `Any`. This is the root of the hierarchy and provides methods like `toString()`, `equals()`, and `hashCode()`.

## 6. Verification
Verified by building the project. The Java code calls the top-level demonstration function, which exercises inheritance, abstraction, and delegation patterns.
