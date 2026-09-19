# Step-by-Step Explanation: Kotlin Collections

Kotlin distinguishes between **read-only** and **mutable** collections to improve code safety and clarity.

## 1. Lists
Ordered collections that allow duplicates.
- **Read-only**: `listOf("A", "B")`. You cannot add or remove items.
- **Mutable**: `mutableListOf("A", "B")`. Allows `.add()` and `.remove()`.
- **Indexing**: Access items using `list[0]` or convenient extensions like `.first()` and `.last()`.

## 2. Sets
Unordered collections that store only unique items.
- **Uniqueness**: If you try to create a set with `setOf(1, 1, 2)`, the result is just `{1, 2}`.
- **Existence**: Extremely efficient for checking if an item exists using the `in` operator.

## 3. Maps
Collections of key-value pairs.
- **Syntax**: Use the `to` keyword: `mapOf("key" to 100)`.
- **Keys**: Must be unique. Adding a new value with an existing key will overwrite the old value in a mutable map.
- **Access**: `map["key"]` returns the value or `null` if the key is missing.

## 4. Mutability Patterns
A common Kotlin pattern is to use a mutable collection internally for building data, but return a read-only view to the outside world to prevent accidental modification.

```kotlin
val mutableItems = mutableListOf(1, 2, 3)
val readOnlyView: List<Int> = mutableItems // Cast to read-only interface
```

## 5. Exercises Implemented
- **List Counting**: Adding the `.count()` of two independent lists.
- **Set Membership**: Using `.uppercase()` and `in` for case-insensitive protocol support checks.
- **Map Lookup**: Using a map as a simple dictionary to translate numbers to words.

## 6. Verification
Verified via Java interop using `CollectionsKt` and building with `./gradlew :app:assemble`.
