# Step-by-Step Explanation: Intermediate Null Safety

Kotlin's null safety continues to shine with advanced tools for casting and collection management.

## 1. Safe Cast (`as?`)
Standard casting in Java (`(String) obj`) can throw a `ClassCastException`. Kotlin's `as?` operator returns `null` if the cast is not possible.

```kotlin
val s = obj as? String // s is String?
```

## 2. Not-Null Assertion (`!!`)
The `!!` operator converts any value to a non-nullable type. If the value is `null`, it throws a `NullPointerException`. 
> [!CAUTION]
> Use this sparingly. It is a sign that you are bypassing Kotlin's safety features. It is best used when interacting with Java libraries where you are certain a value won't be null but Kotlin can't verify it.

## 3. Filtering Collections
Kotlin's standard library makes it easy to work with nullable data in lists:
- **`filterNotNull()`**: Returns a list containing only the non-null elements of the original collection.
- **`listOfNotNull()`**: Creates a list containing only the arguments that are not null.
- **`mapNotNull()`**: Applies a transformation and keeps only the non-null results.

## 4. Early Returns with Elvis
Combining `?:` with `return` or `throw` is a powerful way to handle missing data without nested `if` blocks.

```kotlin
val user = getUser(id) ?: return // Exit function if user is null
```

## 5. Verification
Verified by building the project. The Java code successfully called the demonstration function, which showed both safe casts and the handling of the not-null assertion crash (via a `try-catch` block).
