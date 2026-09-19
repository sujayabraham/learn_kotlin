# Blog: Diving Deeper - Variables and Templates in Kotlin

Day 2 of my Kotlin journey! Today I followed the "Kotlin Tour" to understand the core building blocks: how Kotlin handles data and strings.

## The `val` vs `var` Debate
One of the first things you learn in Kotlin is that it *loves* immutability. By default, you should use `val`. It’s like a promise that the value won't change. If you absolutely need to change it later, you use `var`. 

```kotlin
val popcorn = 5    // Locked in!
var customers = 10 // Can change
customers = 8      // Legal
```

## String Templates: A Developer's Dream
Coming from Java, string concatenation used to involve a lot of `+` signs and quotes. Kotlin makes this incredibly clean with string templates.

Instead of:
`"There are " + customers + " customers"`
You just write:
`"There are $customers customers"`

And if you need to do math inside the string? `${customers + 1}` works like a charm.

## Java is Still Invited
Even though I'm writing modern Kotlin, I’m still running it from my Java `App` class. It’s fascinating how Kotlin turns a simple file like `KotlinTour.kt` into a Java-friendly `KotlinTourKt` class automatically.

Stay tuned for more!

#KotlinTour #CodingLife #JVM #CleanCode
