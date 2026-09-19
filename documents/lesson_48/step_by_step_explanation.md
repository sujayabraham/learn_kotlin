# Step-by-Step Explanation: Advanced Inheritance Rules in Kotlin

Kotlin establishes modern, explicit object inheritance rules, enforcing strict boundary controls while rewriting core platform root objects like `Any`.

## 1. The Root Universe Common Superclass: `Any`
In Kotlin, the ultimate ancestor class of all classes is **`Any`**, not `java.lang.Object`.
- `Any` serves as the implicit baseline configuration root for any class that doesn't declare a superclass.
- `Any` exposes exactly three core methods: `equals()`, `hashCode()`, and `toString()`. It contains no internal fields, reference synchronization hooks, or threading lock methods.

## 2. Property Overriding Laws
Unlike languages where property fields are completely independent of method overloads, Kotlin treats properties as a combination of implicit getters and setters. This means **properties can be explicitly overridden** using the `override` modifier keyword:
- An open property can be mapped to a different value or calculation inside a child subclass.
- A `val` property in a base class can be overridden by a `var` property in a subclass (because a `var` simply adds a setter on top of the inherited getter). However, **a `var` property cannot be overridden by a `val` property**, as that would break the contract by removing an existing setter function.

## 3. Enforcing Method Finality
By default, overridden functions inside a subclass remain open for downstream extensions by grandchildren. If you want to halt this inheritance chain and prevent subsequent subclasses from altering your logic, you can combine modifiers to declare a **`final override`** function:
```kotlin
final override fun calculateYearlyBonus() { ... }
```

## 4. Multi-Inheritance Priority Rules
If a class inherits an identical method name and signature from both a class and an interface simultaneously (or from multiple interfaces), it creates an override conflict. 
- The compiler flags this ambiguity as an error and **forces the class to override the conflicting method**.
- Inside the overridden method, you specify exactly which parent implementation should be triggered by using qualified super angle brackets: `super<BaseClass>.method()` and `super<InterfaceName>.method()`.
