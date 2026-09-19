# Step-by-Step Explanation: Properties and Fields in Kotlin

Kotlin completely rethinks data storage in objects by introducing first-class **Properties** instead of raw Java-like fields. This design provides clean data access notation while supporting robust encapsulation boundaries.

## 1. Properties vs. Fields
In legacy systems, variable fields and their getter/setter access methods are declared as separate entities. 
- In Kotlin, a property is a unified construct that wraps an underlying storage space (if needed) along with its structural accessors.
- Declaring `var name: String` automatically generates a private field along with default public getter and setter implementations behind the scenes.
- Declaring `val age: Int` automatically produces a final private field and a default public getter, omitting the setter to enforce immutability.

## 2. The Backing Field (`field`) and Custom Accessors
If you customize a property setter or getter to add validation or transformation logic, you frequently need to read or mutate the underlying memory value. 
- Kotlin exposes an explicit syntax identifier named **`field`** (known as the **Backing Field**) exclusively inside custom accessors.
- Using `field` points directly to the auto-generated raw memory value. 
- **CRITICAL RULE**: You must interact with `field` directly instead of referencing the property name itself (e.g., `field = value` instead of `name = value`). Referencing the property name inside its own setter triggers an infinite recursive loop, crashing the thread with a `StackOverflowError`.

```kotlin
var accountHolderName: String = "Unknown"
    set(value) {
        field = value.trim().uppercase() // Secure update to backing field
    }
```

## 3. Granular Visibility Controls
You can change the visibility parameters of getters and setters independently. A highly popular architectural pattern is making a property publicly readable but only writable internally. This is achieved by changing the visibility modifier of the setter exclusively:
```kotlin
var balanceAmount: Double = 0.0
    private set // Publicly readable, privately writable!
```

## 4. Computed Properties (Stateless Fields)
If a property's value can be derived dynamically from other fields, it does not need to consume real memory on the heap.
- By writing a custom `get()` block without using the `field` keyword anywhere inside it, you create a **Computed Property**.
- The compiler will completely omit generating an underlying backing field, making the property entirely stateless. It acts exactly like a traditional calculation method while retaining clean property syntax:
```kotlin
val isOverdrawn: Boolean
    get() = this.balanceAmount < 0.0 // No backing field allocated!
```
