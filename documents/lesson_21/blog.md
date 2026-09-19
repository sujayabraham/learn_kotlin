# Blog: Keeping Secrets - Visibility Modifiers in Kotlin

Day 21! Today I explored the walls we build around our code: **Visibility Modifiers**. 

## Public by Default
In Java, if you don't specify visibility, it’s "package-private." In Kotlin, the default is **`public`**. This reflects Kotlin's philosophy of being "concise by default"—most of the time, you want your code to be accessible, so you don't have to type `public` everywhere.

## The "Internal" Revolution
My favorite discovery today was the **`internal`** modifier. In Java, it's notoriously hard to hide code from your library's users without putting everything in one giant package. Kotlin solves this with `internal`, which makes code visible to your entire module but invisible to anyone who imports your library. It’s a game-changer for clean API design.

## Stricter Protected
Kotlin’s `protected` is stricter than Java’s. In Java, `protected` also means "accessible to the whole package." Kotlin says: "No, if you aren't a subclass, you shouldn't see this." This makes inheritance hierarchies much more predictable and secure.

## Private at the Top
I also learned that you can have `private` functions at the top level of a file. This is perfect for "helper" logic that doesn't need its own class but shouldn't be exposed to the rest of the project. It keeps your namespace clean.

## Hidden Constructors
Need to force users to use a factory method? Just mark your primary constructor as `private`. Kotlin makes this syntax very clear, though you do have to add the `constructor` keyword explicitly.

## Conclusion
Visibility modifiers in Kotlin aren't just about hiding code; they are about **intent**. They let you define exactly who should be able to see and use your logic, leading to more maintainable and less brittle systems.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #VisibilityModifiers #Encapsulation #CleanCode #AndroidDev #ModuleScope #SoftwareArchitecture
