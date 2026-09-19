# Step-by-Step Explanation: Sealed Classes and Interfaces in Kotlin

Sealed classes and interfaces provide closed, strictly restricted type hierarchies, granting advanced compile-time safety and domain-modeling controls that are central to functional programming architectures.

## 1. Defining a Closed Type Universe
A **Sealed Class** is marked with the `sealed` modifier keyword:
- It represents a bounded inheritance hierarchy where **all subclasses must be completely known at compile-time**.
- **Scope Restriction**: Subclasses must be declared within the exact same package and module directory as the parent sealed class itself. This prevents external libraries or unauthorized developers from subclassing your types, locking the hierarchy completely.
- **Abstract Core**: By default, a sealed class is abstract and cannot be directly instantiated. It serves as a strict structural container model.

## 2. Flexible Structural Child Nodes
Unlike simple Enumeration types (`enum`), which restrict each branch to a uniform instance configuration, sealed classes allow child nodes to take whatever structure fits their needs:
- One branch can be a **`data class`** containing complex parameters and data payloads.
- Another branch can be a standard class containing unique logic methods.
- A third branch can be a singleton **`object`** representing an unvalued state token (like a stateless loading indicator).

## 3. Exhaustive Pattern Matching with `when`
The true superpower of sealed classes is unlocked when they are combined with **`when` expressions**:
- Because the compiler has a complete list of every possible subclass branch at compilation time, a `when` block evaluating a sealed class instance is required to be **exhaustive**.
- You must handle every possible subclass type explicitly. Once all branches are covered, **you do not need to add a redundant `else` fallback branch**.
- **Self-Defending Code**: If a developer adds a brand new child subclass to the network response sealed structure in the future, the compiler will immediately catch it and raise an error on every `when` expression across the codebase, pointing out that the new state is unhandled. This completely eliminates a major category of silent runtime errors.
