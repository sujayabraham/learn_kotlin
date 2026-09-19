# Blog: Adding Meaning to Code - Kotlin Annotations

Day 20! Today I explored **Annotations**, the secret language of metadata that powers almost every modern framework, from Dagger to Room.

## Metadata Magic
In Java, annotations can sometimes feel a bit "magic." Kotlin brings some much-needed structure and safety to them. Declaring an annotation is as simple as `annotation class Fancy`, but the control you have over its behavior is immense.

## Precision Targeting
The most interesting thing I learned today was **Use-Site Targets**. When you write `val name: String` in Kotlin, the compiler generates a field and a getter. If you want to annotate just the field for your database but keep the getter clean, Kotlin gives you `@field:MyAnn`. It’s this level of precision that makes Kotlin feel like a surgical tool for developers.

## Repeat Yourself (Safely)
Remember when you had to write a "container" annotation in Java just to use the same annotation twice? Kotlin handles that for you! Just mark your annotation as `@Repeatable`, and the compiler does the heavy lifting.

## Nullability? Not Here.
Kotlin is famous for its null safety, but in the world of annotations, the JVM is king. Since the JVM doesn't support nulls in annotation attributes, Kotlin strictly forbids nullable types in annotation constructors. It’s a rare place where the `?` is nowhere to be found!

## Summary
Annotations are the glue that holds frameworks together. Understanding how to declare them, target them, and inspect them with reflection is a huge step toward mastering advanced Kotlin development.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Annotations #Metadata #Reflection #CleanCode #AdvancedKotlin #AndroidDev
