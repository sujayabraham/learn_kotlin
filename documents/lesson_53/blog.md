# Blog: Zero-Cost Types - Inline Value Classes in Kotlin

Day 53! Today I dove deep into **Inline Value Classes** in Kotlin. In professional software architecture, a common design goal is achieving **Type Safety**. For instance, instead of passing around raw, generic strings for database keys, passwords, or security hashes, you want to wrap them inside dedicated domain types like `SecureIdToken`.

This prevents catastrophic mistakes where a developer accidentally passes a standard username string into a sensitive security token slot. 

## The Performance Penalty of Wrappers
While wrapping primitives is an architectural win, it comes with a major catch on the JVM: **Object Allocation Overhead**. 

Creating thousands of tiny wrapper objects forces the runtime environment to constantly allocate heap memory, causing visual lag, slow operations, and heavy garbage collector pressure in data-intensive apps.

## The Secret Trick: `@JvmInline value class`
Kotlin solves this performance dilemma completely using **Inline Value Classes**. By combining the `value class` keyword with a `@JvmInline` decorator, you instruct the compiler to perform a clever optimization trick:

```kotlin
@JvmInline
value class SecureIdToken(val idString: String)
```

At compile time, the compiler completely flattens the wrapper. In the resulting compiled bytecode, **the wrapper class instance object is entirely deleted, leaving behind only the raw underlying primitive string itself!**

## High-Level Features for Free
Even though it compiles down to a raw primitive under the hood, you can write value classes exactly like real classes:
- You can add **`init` blocks** to validate inputs instantly upon creation.
- You can define custom **computed properties** and formatting getters (`maskedToken`).
- You can declare member methods and domain functions natively.

During compilation, these class methods are transformed into optimized static methods that process the raw primitive parameter directly. You get the beauty and security of strongly typed domain objects, with the hyper-fast performance of raw primitives!

## Summary
Inline value classes allow developers to create type-safe architectures with zero object allocation overhead, successfully removing the friction between performant execution and clean design.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #ValueClasses #JvmInline #Optimization #CleanCode #AndroidDev #JVM #ProgrammingJourney
