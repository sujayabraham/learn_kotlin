# Step-by-Step Explanation: Kotlin Null Safety

Kotlin's type system is designed to eliminate `NullPointerException` from our code. Here’s how it works.

## 1. Non-Nullable by Default
In Kotlin, you cannot assign `null` to a variable unless you explicitly say so.
```kotlin
var name: String = "Kotlin"
// name = null // This will NOT compile
```

## 2. Nullable Types (`?`)
If you want to allow a variable to be null, you must mark it with a question mark.
```kotlin
var name: String? = null // This IS allowed
```

## 3. Safe Call Operator (`?.`)
When you have a nullable variable, you can't access its properties directly. You use `?.` which returns the value if the object is present, or `null` otherwise.
```kotlin
val length = name?.length // length is of type Int?
```

## 4. The Elvis Operator (`?:`)
This operator is used to provide a "fallback" or default value when an expression evaluates to `null`.
```kotlin
val length = name?.length ?: 0 // If name is null, length becomes 0
```

## 5. Working with Java
Java doesn't have Kotlin's null safety built into the type system. When Java calls Kotlin:
- If a Kotlin function expects `String` (non-nullable), passing `null` from Java might cause a crash at the boundary if not careful.
- If a Kotlin function expects `String?` (nullable), it will handle `null` from Java correctly using the operators above.

## 6. Verification
We verified that passing `null` from `App.java` to `NullSafetyKt.describeString(null)` works perfectly because the Kotlin function was designed to handle a nullable `String?`.
