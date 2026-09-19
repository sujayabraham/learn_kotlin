# Blog: Composition Made Perfect - Native Class Delegation in Kotlin

Day 47! Today I focused on **Class Delegation** in Kotlin. Every experienced software architect knows the classic design rule: **Prefer Composition over Inheritance**. While inheritance can look convenient early on, it tightly couples subclasses to parent structures, creating fragile codebases that break easily during refactoring.

## The Boilerplate Trap of Composition
To avoid inheritance issues, developers use the **Decorator Pattern**: your class implements an interface and wraps an internal instance of that same interface, manually forwarding calls. 

The downside? If your interface has twenty methods, you have to write twenty tedious forwarding methods yourself. It’s boring, error-prone boilerplate.

## The Kotlin Magic: The `by` Keyword
Kotlin completely eliminates this trade-off by handling delegation natively at the compiler level using the **`by`** keyword:

```kotlin
class SmartVehicle(engine: Engine) : Engine by engine
```

With that single line, the Kotlin compiler automatically generates all necessary forwarding methods behind the scenes! If anyone calls `vehicle.getFuelType()`, the call is instantly forwarded to the underlying `engine` instance with zero runtime performance cost.

## Flexible Interception
You are never locked into the automated delegation. If you want to change or enrich a specific interface method, you simply write a normal `override` block inside your class body:

```kotlin
override fun startEngine() {
    println("Performing validation check before starting engine...")
}
```
The compiler seamlessly routes calls to your custom override for that specific method, while continuing to auto-forward all other unmentioned methods to your delegated target object.

## Summary
Class delegation via the `by` keyword allows developers to achieve the structural safety of composition with the visual simplicity of inheritance, completely eliminating tedious boilerplate code.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #ClassDelegation #Composition #DesignPatterns #CleanCode #AndroidDev #JVM #SoftwareArchitecture
