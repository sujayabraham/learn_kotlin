# Blog: Smart Compilers - Unlocking Builder Inference in Kotlin

Day 39! Today I took a deep dive into **Builder Inference** in Kotlin. When working with generic collection builders or sequence generators, typing out explicit generic parameters over and over can feel like redundant boilerplate. Kotlin's compiler tackles this intelligently by reading between the lines of your configuration blocks.

## The Type Inferencing Riddle
When you write a generic builder function that handles structures, the function call itself doesn't take parameters directly—instead, it takes a configuration lambda. Normally, a compiler would get confused and demand that you state the type explicitly:

```kotlin
// Explicitly stating types used to be mandatory:
val strings = buildMyCollection<String> {
    add("Hello")
}
```

## The Smart Fix: Look Inside the Block
With **Builder Inference**, Kotlin delays declaring the final generic parameter evaluation. Instead, it looks inside the lambda block execution to find out what you are doing.

If you call `add("Kotlin")` inside that block, the compiler notes that you passed a `String` to the collection's internal method. It connects the dots backwards and deduces that the generic parameter `E` for the parent factory call must be a `String`. 

```kotlin
// Clean, boilerplate-free builder inference:
val strings = buildMyCollection {
    add("Kotlin does the work for you!")
}
```

## Modern, Invisible Power
In earlier iterations of Kotlin, you had to mark parameters with a manual `@BuilderInference` opt-in annotation. Today, the Kotlin engine does this automatically behind the scenes. If a generic type argument can be inferred by evaluating your lambda receiver statements, it just works out of the box!

## Summary
Builder Inference is another example of Kotlin prioritizing developer experience. By enabling the compiler to analyze statements inside block parameters, you get full, robust static type safety without the visual clutter of explicit generic declarations.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #BuilderInference #Generics #CleanCode #AndroidDev #JVM #ProgrammingJourney
