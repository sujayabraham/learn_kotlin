# Blog: Flexible Contracts - Interfaces and Conflict Resolution in Kotlin

Day 46! Today I focused on **Interfaces** in Kotlin. Interfaces are essential for building robust architectural abstractions, but Kotlin extends their standard definition by transforming them into dynamic contracts that can mix abstract definitions, default code executions, and stateless property getters smoothly.

## Properties without Backing Fields
A major advantage of Kotlin interfaces is their support for properties. While interfaces are strictly stateless and cannot maintain internal variables or fields, they can expose properties that use **custom getter function blocks**:

```kotlin
interface PaymentProcessor {
    val processingFeeRate: Double
        get() = 0.02 // Stateless default constant
}
```
This enables you to supply fallback structural parameters straight inside behavioral contracts effortlessly.

## The Diamond Problem Solved
Because a class in Kotlin can implement multiple interfaces concurrently, you can occasionally run into the classic **Diamond Problem**: what happens if two separate interfaces define an identical default method signature, and a subclass implements both?

Kotlin solves this ambiguity elegantly by forcing the subclass to override the clashing method. Inside the overridden body, you pinpoint exactly which parent implementation to invoke by using qualified super brackets:

```kotlin
override fun printReceipt(amount: Double) {
    super<PaymentProcessor>.printReceipt(amount)
    super<AnalyticsTracker>.printReceipt(amount)
}
```
This grants developers full, explicit control over execution prioritizations without brittle assumptions.

## Summary
Interfaces in Kotlin combine the strict safety of traditional contracts with the flexibility of default implementations and stateless properties, providing an elegant tool for building decoupled software configurations.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Interfaces #DiamondProblem #CleanCode #AndroidDev #JVM #SoftwareArchitecture
