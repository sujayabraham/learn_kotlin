# Blog: Organizing Data with Kotlin Collections

Day 4! Today was all about **Collections**. Coming from a Java background, I was pleasantly surprised by how Kotlin handles Lists, Sets, and Maps.

## The Power of "No"
The biggest shift in mindset is Kotlin's default stance on mutability. In Java, most collections are mutable by default. In Kotlin, you start with `listOf()`, `setOf()`, or `mapOf()`, which are **read-only**. 

If you want to add or remove things, you have to explicitly ask for a `mutableListOf()`. This small change makes code much safer—if a function receives a `List`, you know for a fact it won't change under your feet!

## Clean Syntax
Look at how maps are created:
```kotlin
val menu = mapOf(
    "Coffee" to 2.50,
    "Tea" to 2.00
)
```
The `to` keyword is so much more readable than traditional `.put()` calls.

## Unique is Easy
I love how Sets automatically handle duplicates. `setOf("apple", "apple", "banana")` just gives you a set with one apple and one banana. No manual checking required.

## Interop Check
Once again, calling these from Java was a breeze. Kotlin's `List` maps directly to `java.util.List`, and `CollectionsKt` makes the top-level functions accessible without any friction.

My project is starting to look like a real Kotlin library!

#Kotlin #Collections #CleanCode #JavaInterop #LearningKotlin
