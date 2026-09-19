# Blog: Zero and Up - Exploring Unsigned Integers in Kotlin

Day 26! Today I explored a specialized corner of Kotlin: **Unsigned Integer Types**. 

## Why Unsigned?
Sometimes, a negative number just doesn't make sense. If you're working with pixel colors, hardware registers, or low-level file formats, you want to use the full capacity of your bits for positive values. Kotlin gives us `UByte`, `UShort`, `UInt`, and `ULong` for exactly this purpose.

## Simple Syntax
To make a number unsigned, you just add a `u` suffix.
```kotlin
val myAge = 42u // UInt
val distanceToStar = 100_000_000_000uL // ULong
```
It’s clean and fits perfectly with the rest of Kotlin's numeric system.

## Performance for Free
I was impressed to learn that these aren't "heavy" wrapper objects. They are implemented as **inline classes**, which means they are just as fast as regular integers at runtime. You get the safety of a new type without the cost.

## The Opt-in Guardrail
Kotlin uses an "Opt-in" system for features that are still evolving. Unsigned arrays are currently in Beta, so you have to explicitly say "I'm okay with using an experimental feature" with the `@OptIn` annotation. It’s a great way to keep the language stable while still letting developers use powerful new tools.

## Summary
Unsigned integers aren't something you'll use every day, but when you need them, they are a powerful tool. They provide better type safety and more expressive code for specific technical domains.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #UnsignedIntegers #LowLevelProgramming #CleanCode #AndroidDev #JVM #TypeSafety
