# Blog: Code Sanity Rules - Mastering Advanced Inheritance in Kotlin

Day 48! Today I explored **Inheritance Rules** in Kotlin. In traditional Object-Oriented Programming, inheritance can easily turn into a sprawling, fragile mess if the language doesn't enforce strict boundaries. Kotlin addresses this by introducing explicit compilation rules that ensure subclass relationships remain clean, intentional, and robust.

## Meet `Any`: The True Ancestor Root
The first major architectural change to note is that Kotlin’s root class is **`Any`**, not `java.lang.Object`. Every class you declare implicitly inherits from `Any`. It provides exactly three core methods: `equals()`, `hashCode()`, and `toString()`. It contains no background threading synchronization locks or garbage collection cleanup references, keeping your class metadata extremely lean.

## Overriding Properties is Legal!
In many older frameworks, overriding only applies to methods; field properties are treated as separate variables. In Kotlin, because properties are actually compiled as implicit getters and setters, **you can explicitly override a property field**:

```kotlin
open class CoreBaseAccount {
    open val interestRate: Double = 0.01
}

class PremiumSavingsAccount : CoreBaseAccount() {
    override val interestRate: Double = 0.05 // Upgrading the property value!
}
```
You can even override a base `val` property with a subclass `var` property (since you are simply adding a setter). However, you can *never* override a `var` with a `val`, as you cannot remove an established setter contract.

## Putting a Stop to Changes: `final override`
By default, whenever you override an open function inside a subclass, that function remains open for subsequent grandchildren classes to override again. If you want to cut off this chain and declare that your subclass implementation is the absolute final word, you mark it as a **`final override`**. It locks the method down securely, keeping downstream architectures stable.

## Untangling Multiple Inheritance Conflicts
Kotlin allows you to inherit from a base class while implementing multiple interfaces concurrently. But what happens if both your base class and an interface contain an identical method signature? The compiler intercepts this immediately and **forces you to write an explicit override**. 

Inside your custom block, you map out exactly how calls should be routed using qualified super brackets:
```kotlin
override fun draw() {
    super<RectangleShape>.draw() // Route to base class logic
    super<TextOverlay>.draw()    // Route to interface default logic
}
```

## Summary
By enforcing strict rules around property overriding, final overrides, and multi-inheritance conflict resolution, Kotlin keeps object structures readable, secure, and resilient against fragile base class bugs.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Inheritance #OOP #CleanCode #AndroidDev #JVM #SoftwareArchitecture
