# Blog: Building Better Hierarchies - Advanced OOP in Kotlin

Day 12! Today I moved beyond basic classes and looked at how Kotlin handles **Inheritance**, **Interfaces**, and a hidden gem called **Delegation**.

## Open for Business (Literally)
One of the first things you notice in Kotlin is that you can't just inherit from any class. You have to use the `open` keyword. At first, it felt like an extra step, but I quickly realized it prevents the "Fragile Base Class" problem. You only allow inheritance when you've designed for it.

## The Power of Abstract Blueprints
Abstract classes are my favorite way to share code. I built a `Product` base class that handles the price and name, but leaves the "category" to the specific electronics or clothing sub-classes. It’s clean, safe, and keeps the code DRY (Don't Repeat Yourself).

## Delegation: The Boilerplate Killer
But the real showstopper today was **Delegation**. We’ve all been there: you implement an interface, and you just end up writing ten methods that call ten other methods on a member variable. 

In Kotlin, you just say `by memberVariable`. The compiler writes all that boring code for you. It makes the **Composition over Inheritance** principle so much easier to follow.

## Smart Systems
I put it all together by building a mini **Smart Home** system. Using abstract devices and specific light/thermostat implementations, I saw how a strict class hierarchy makes the code predictable and easy to extend.

## Summary
Kotlin’s intermediate OOP features aren't just about "doing what Java does." They are about doing it with more intent and less boilerplate. Delegation alone has probably saved me hundreds of lines of future code!

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #OOP #Inheritance #Interfaces #Delegation #CleanCode #AndroidDev
