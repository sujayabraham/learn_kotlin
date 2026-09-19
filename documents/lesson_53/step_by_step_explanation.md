# Step-by-Step Explanation: Inline (Value) Classes in Kotlin

Inline classes (declared as **`value class`** with a mandatory **`@JvmInline`** decoration annotation modifier on the JVM) provide a highly optimized data wrapping mechanism. They enable developers to establish type-safe wrappers around primitive types without incurring runtime memory object allocation overhead.

## 1. The Allocation Overhead Dilemma
In high-quality domain modeling, wrapping primitive types inside domain-specific wrapper objects is a standard best practice to achieve type safety:
- Instead of using a raw `String` for an email or database ID token, you wrap it inside a custom `class SecureIdToken(val idString: String)`.
- This ensures you cannot accidentally pass a regular user name string into a secure token argument slot.
- **The Performance Problem**: Creating wrapper objects triggers massive runtime **object allocations**, adding heavy memory consumption and performance pressure to the JVM Garbage Collector.

## 2. Compile-Time Inlining & Flattening Mechanics
Kotlin resolves this memory trade-off completely using **Inline Value Classes**:
- You declare an inline class by using the **`value`** keyword modifier and adding the **`@JvmInline`** annotation decorator header on the JVM platform.
- **The Core Constraint**: An inline value class **must declare exactly one primary constructor parameter property field**.
- At compile time, the compiler completely flattens the wrapper. In the resulting compiled bytecode, **the wrapper object instance is completely deleted and replaced with the raw underlying primitive type value itself**.
```kotlin
@JvmInline
value class SecureIdToken(val idString: String)
```

## 3. High-Level Capabilities without Cost
Despite compiling down to a raw primitive value underneath, an inline value class supports a range of high-level class behaviors:
- You can add initialization validation code blocks (`init { ... }`).
- You can define calculated computed properties with custom getter blocks.
- You can declare member functions and secondary methods natively.

At runtime, these members are optimized and transformed into hyper-fast, clean static methods that receive the raw primitive value as an argument, giving you **type safety with zero object allocation memory overhead**.
