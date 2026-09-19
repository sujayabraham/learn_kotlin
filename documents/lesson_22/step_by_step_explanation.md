# Step-by-Step Explanation: Naming Backing Properties

The Kotlin Style Guide provides specific advice on how to name properties when you have a private "backing" property and a public "access" property for the same concept.

## 1. The Problem: Encapsulation vs API
Often, you want to maintain a mutable collection internally (so you can add/remove items) but expose it as a read-only collection to the rest of the world.
- In Java, you'd use a private field `List items` and a getter `getItems()`.
- In Kotlin, properties encompass both the field and the getter.

## 2. The Convention: The Underscore Prefix
If you have two properties that represent the same data:
1.  The **Private** property (implementation detail) should be prefixed with an **underscore** (`_`).
2.  The **Public** property (part of the API) should have a clean name without the underscore.

```kotlin
private val _items = mutableListOf<String>() // Implementation
val items: List<String> get() = _items        // Public API
```

## 3. Why This Matters
- **Readability**: It's immediately clear which variable is the "real" source of truth and which is the public view.
- **Consistency**: Following this standard ensures that your code looks like official Kotlin libraries (like the collections or Compose state libraries).
- **Safety**: It prevents naming collisions while staying concise.

## 4. Verification
Verified by building the project. The implementation demonstrated that `Inventory.items` returns a read-only list, protecting the internal `_items` from unauthorized modifications from the outside.
