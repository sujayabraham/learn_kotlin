# Blog: The Underscore Standard - Naming Backing Properties in Kotlin

Day 22! Today I looked at a specific detail of the **Kotlin Coding Conventions** that explains how to name properties that work together as a team.

## The "Mutable Internal, Read-only External" Pattern
A common challenge in software design is wanting to change a list inside your class but not letting anyone else change it from the outside. 

In Kotlin, we solve this by having two variables. But what do you name them? If you have `items` and `readOnlyItems`, it starts to get wordy. 

## Enter the Underscore
The official Kotlin recommendation is elegant:
1. Use an **underscore** for the private one: `_items`.
2. Use the **clean name** for the public one: `items`.

```kotlin
private val _items = mutableListOf<String>()
val items: List<String> get() = _items
```

## Why I Like It
It’s short, it’s standardized, and it clearly distinguishes between "Implementation Detail" and "Public API." When I see an underscore in a Kotlin codebase, I instantly know: "Okay, this is the internal state that I shouldn't touch directly."

## It's Everywhere!
Once you notice this pattern, you'll see it everywhere in the Kotlin ecosystem. From the Android Jetpack libraries to the Kotlin compiler itself, this is the gold standard for state encapsulation.

## Summary
Coding conventions might seem like small details, but they are what make a language feel cohesive. Following the underscore convention makes your code more "idiomatic" and much easier for other Kotlin developers to read.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #CodingConventions #CleanCode #ProgrammingTips #Encapsulation #StyleGuide
