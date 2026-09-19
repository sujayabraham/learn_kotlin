# Blog: Kotlin Types - Smart Inference and Explicit Control

Day 3 of my journey into Kotlin! Today, I explored how Kotlin handles the building blocks of data: **Basic Types**.

## Let the Compiler Do the Work
One of the most refreshing things about Kotlin is **Type Inference**. In Java, I'm used to writing `int x = 10;`. In Kotlin, `var x = 10` is enough. The compiler isn't just guessing; it's strictly determining that `x` is an `Int`. This makes the code cleaner without sacrificing type safety.

## When to be Explicit
Inference is great, but sometimes you need control. If I want a very large number, I'll explicitly tell Kotlin it's a `Long`:
```kotlin
val largeNumber: Long = 100_000_000_000L
```
Notice the underscores? They make large numbers so much easier to read!

## The "Safety First" Approach
Kotlin’s compiler is like a helpful (but strict) friend. If I declare a variable but forget to initialize it before trying to print it, the compiler won't even let the code run. It forces me to be sure that my data is ready before I use it.

## What I Learned
- **Integers**: `Byte`, `Short`, `Int`, `Long`.
- **Decimals**: `Double` (default) and `Float` (with `f`).
- **Others**: `Boolean` for truth and `Char` for single characters (single quotes!).

I'm starting to see why developers love Kotlin—it feels "smarter" than Java while remaining perfectly compatible with it.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #CodingJourney #TypeSafety #ModernDev
