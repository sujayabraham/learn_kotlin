# Blog: Fixed in Size, Flexible in Power - Arrays in Kotlin

Day 30! Today I took a deep dive into **Arrays**. If you think you know arrays from Java or C++, Kotlin has some surprises in store that make them much more developer-friendly.

## Beyond the Basics
Creating an array in Kotlin feels very modern. Instead of just a fixed size and curly braces, I learned about the **Array constructor**. It lets you define exactly what goes into each index using a lambda.
```kotlin
val squares = Array(5) { i -> i * i }
```
It’s like a factory and a loop rolled into one!

## The Performance Trap
One of the most important things I learned was the difference between `Array<Int>` and `IntArray`. 
- `Array<Int>` is an array of objects. It’s flexible but can be slow.
- `IntArray` is a true primitive array. No boxing, no overhead—just pure speed.
If you're doing heavy math or processing large amounts of data, `IntArray` is your secret weapon.

## The `==` Pitfall
If you've ever tried to compare two arrays using `==` and gotten `false` even though they look identical, you've hit the referential equality wall. In Kotlin, `==` for arrays checks if they are the exact same instance. To check the *data* inside, you use `.contentEquals()`. It’s a simple rule, but vital for avoiding bugs!

## The Spread Operator
Passing an array to a function that takes variable arguments (varargs) used to be a bit clunky. Kotlin makes it "explode" with the **Spread Operator (`*`)**. It’s such a satisfying syntax: `printAll(*myArray)`.

## Multidimensional Ease
Multidimensional arrays are just arrays of arrays, but Kotlin makes them easy to work with. I especially appreciated `.contentDeepToString()`, which finally makes printing a matrix as easy as printing a single number.

## Summary
Arrays in Kotlin provide a perfect balance: the performance of the underlying JVM primitive arrays with the high-level, expressive syntax we expect from a modern language.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Arrays #Performance #CleanCode #ProgrammingJourney #JVM #DataStructures
