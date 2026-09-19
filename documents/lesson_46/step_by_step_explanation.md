# Step-by-Step Explanation: Interfaces in Kotlin

Interfaces in Kotlin serve as powerful behavioural contracts, allowing developers to define a mix of abstract declarations, state-free properties, and complete default method implementations.

## 1. Abstract vs Default Method Declarations
Kotlin interfaces are highly expressive:
- They can declare **abstract methods** that carry no body, forcing implementing classes to provide concrete definitions.
- They can define **default methods** that contain default functional code blocks. Implementing subclasses can use default methods as-is or choose to override them.

## 2. Stateless Interface Properties
Unlike traditional classes, interfaces cannot store instance variables or maintain internal states directly.
- An interface can declare an **abstract property** (`val name: String`), forcing implementing concrete classes to override and map it to a field or variable.
- An interface can provide a property with a **custom getter function block**, as long as it does not rely on backing fields (`field` is prohibited). This lets you declare stateless constants or calculated properties directly inside contracts:
```kotlin
val processingFeeRate: Double
    get() = 0.02
```

## 3. Resolving Signature Conflicts (The Diamond Problem)
Because a Kotlin class can implement multiple interfaces concurrently, a naming clash occurs if two separate interfaces define a default method with the exact same name and parameter signature.
- This creates the classic **Diamond Problem**, where the compiler does not know which parent implementation should take precedence.
- To resolve this, the implementing subclass **must explicitly override the clashing method**.
- Inside the overridden body, you resolve the ambiguity by invoking specific parent targets using qualified super notation syntax: **`super<ParentInterface>.methodName()`**.
```kotlin
override fun printReceipt(amount: Double) {
    super<PaymentProcessor>.printReceipt(amount)
    super<AnalyticsTracker>.printReceipt(amount)
}
```
