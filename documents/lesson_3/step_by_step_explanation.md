# Step-by-Step Explanation: Kotlin Basic Types

This document explains how to work with Kotlin's basic types and the compiler's type inference engine.

## 1. Type Inference
Kotlin is statically typed, but you don't always have to write the type. The compiler looks at the value you assign and "infers" the type.

- **Example**: `var customers = 10` is automatically an `Int`.
- Once inferred, the variable behaves strictly as that type. You can perform arithmetic on `Int`, but you couldn't assign a `String` to it later.

## 2. Explicit Type Declaration
If you need a specific type (like `Long` instead of `Int`) or just want to be explicit, use the `: Type` syntax.

```kotlin
val year: Int = 2020
val amount: Long = 350_000_000L
val currentTemp: Float = 24.5f
```

### Key Differences from Java:
- **Suffixes**: Like Java, `Long` needs an `L` suffix and `Float` needs an `f`.
- **Unsigned Types**: Kotlin supports unsigned types like `UInt` (e.g., `100u`).
- **Readability**: You can use underscores in numbers: `1_000_000`.

## 3. Deferred Initialization
Kotlin allows you to declare a variable without a value, but you **must** specify the type. The compiler also tracks if you've initialized it before use.

```kotlin
val d: Int // Type is required here
d = 3      // Initialized later
```

## 4. Interop with Java
All these types map directly to Java types (either primitives or wrappers). When calling from Java, top-level functions in `BasicTypes.kt` are accessed via `BasicTypesKt`.

## 5. Verification
The implementation was verified by building the project with `./gradlew :app:assemble` and running the application to see the values printed in the console.
