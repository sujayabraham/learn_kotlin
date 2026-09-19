# Blog: Failing Fast and Elegant Fallbacks in Kotlin

Day 23! Today I learned about a Kotlin idiom that makes error handling and null-checks feel like a first-class feature: **Executing an expression if null**.

## The Old Way vs. The Kotlin Way
In many languages, if you need a value but want to throw an error if it's missing, you'd write several lines of `if` checks. In Kotlin, the Elvis operator (`?:`) makes this a one-liner.

## Failing Fast
I love the `?: throw` pattern. It’s so readable:
```kotlin
val user = users[id] ?: throw UserNotFoundException(id)
```
It’s like saying, "Get the user, or else throw an error." It keeps the main flow of your code clean and highlights the error handling right where it happens.

## Custom Fallback Logic
But what if you don't want to crash? What if you want to calculate a default? By combining the Elvis operator with the `run` scope function, you can execute a whole block of logic only when the value is missing.

```kotlin
val size = list?.size ?: run {
    println("List is null, using default size")
    DEFAULT_SIZE
}
```

## Why This Matters
Idioms like this are why Kotlin developers are so productive. They take common patterns and give them elegant, safe syntax. It’s not just about saving lines of code; it’s about making the *intent* of the code obvious to anyone reading it.

## Summary
Whether you’re fail-fasting with an exception or providing a smart default, the "Execute if null" idiom is a tool you’ll use every single day in Kotlin.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Idioms #NullSafety #CleanCode #ProgrammingTips #JavaToKotlin
