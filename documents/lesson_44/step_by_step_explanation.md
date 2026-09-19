# Step-by-Step Explanation: Advanced and Data Classes in Kotlin

Kotlin modernizes Object-Oriented Programming (OOP) by dividing standard structural models into explicit layout variants—providing streamlined primary/secondary builders alongside automated, value-driven **Data Classes**.

---

# Part 1: Advanced Classes & Inheritance Rules

## 1. Multi-Stage Initialization Architecture
Kotlin separates instantiation pipelines into primary declarations, iterative validation blocks, and secondary configurations:
- **Primary Constructor**: Declared directly in the header line alongside visibility or parameter flags.
- **Initializer Blocks (`init`)**: Run sequentially right after the primary constructor executes, allowing inline validation logic.
- **Secondary Constructors**: Declared inside the body using the `constructor` keyword. They are required to delegate directly or indirectly to the primary constructor via `this(...)`.

## 2. Explicit Closed Hierarchy Defaults
In Kotlin, **all classes and members are `final` by default**. 
- You cannot extend a standard class unless you explicitly open up access rules by applying the **`open`** modifier flag keyword.
- Similarly, member functions cannot be overridden unless they are explicitly marked as `open` in the parent class.

## 3. Abstract Definitions
Classes marked with the `abstract` modifier are incomplete blueprints that cannot be directly instantiated. They can declare unimplemented `abstract` functions that force child subclasses to supply a concrete override statement.

---

# Part 2: Data Classes Mechanics

## 1. Automated Member Projections
When handling pure value models or Data Transfer Objects (DTOs), applying the **`data`** keyword tells the compiler to generate several essential methods automatically:
- **`equals(other: Any?)`**: Checks for structural property value equality rather than memory reference matching.
- **`hashCode()`**: Evaluates corresponding consistent unique hashing numeric values based on underlying properties.
- **`toString()`**: Builds a highly descriptive, human-readable string listing every constructor property parameter name and value.

## 2. Immutable Modifications (`copy`)
To update data within an immutable architecture, data classes provide a built-in **`copy()`** function. It clones the existing instance, allowing you to pass targeted updates to specific properties via named arguments while leaving the remaining fields untouched.

## 3. Unpacking with Destructuring Declarations
Data classes generate sequential structural access hooks known as **`componentN()`** functions (e.g., `component1()`, `component2()`). This enables destructuring declarations, letting you unpack multiple internal properties directly into separate variables in a single sentence:
```kotlin
val (username, age, country) = profile
```
