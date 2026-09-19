# Blog: Everything is an Object - The Unified Type System of Kotlin

Day 24! Today I looked at the big picture: **Kotlin's Type System**. Coming from a background where you have to constantly switch between "primitive types" (like `int`) and "wrapper objects" (like `Integer`), Kotlin’s approach is a breath of fresh air.

## The "Everything is an Object" Philosophy
In Kotlin, you treat every value as an object. This means you can call methods on numbers, strings, and even booleans. It makes the language feel incredibly consistent. You don't have to worry about whether a value needs to be "boxed" or "unboxed"—the compiler handles all that optimization for you.

## The Ultimate Parent: `Any`
I learned that `Any` is the boss of all Kotlin classes. It’s like Java’s `Object`, but even more fundamental because it includes things like numbers and characters. It provides the basic tools every object needs, like a way to print itself (`toString`).

## `Unit` and `Nothing`: More Than Just Words
Two of the most unique types in Kotlin are `Unit` and `Nothing`. 
- **`Unit`** is what you get when a function "doesn't return anything." It’s like Java's `void`, but it's an actual object. 
- **`Nothing`** is even cooler. It represents a value that *never exists*. If a function returns `Nothing`, it means it's going to crash or loop forever. It helps the compiler identify "dead code" that can never be reached.

## Summary
Kotlin’s type system is safe, consistent, and surprisingly powerful. By treating everything as an object, it removes the friction between "data" and "behavior," allowing you to write cleaner and more predictable code.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #TypeSystem #CleanCode #ProgrammingJourney #EverythingIsAnObject #JVM
