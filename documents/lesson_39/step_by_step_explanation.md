# Step-by-Step Explanation: Builder Inference in Kotlin

Builder Inference is a specialized form of type inference used when instantiating generic parameters through lambda argument builders.

## 1. The Core Type Inference Challenge
Normally, when calling a generic function like `listOf("a")`, the compiler immediately knows the generic type parameter is `String` based on the argument provided. 

However, when you pass a configuration lambda block to build a structure, the builder method itself typically doesn't take parameters directly:
```kotlin
fun <E> buildMyCollection(builderAction: MyCollectionBuilder<E>.() -> Unit): List<E>
```
Without information inside the parent parameters, traditional compilers require explicit type arguments: `buildMyCollection<String> { ... }`.

## 2. Dynamic Post-Analysis
**Builder Inference** allows the type arguments of a generic function call to be inferred from type information inside the lambda body argument calls.
- Inside the builder lambda, you call member methods on the receiver, such as `add("Kotlin String")`.
- The compiler postpones the generic type evaluation of the parent function call, analyzing the interior statements within the lambda block.
- Upon discovering that `add` is invoked with a `String`, it dynamically resolves that the parent generic `E` type parameter parameter must match `String`.

## 3. Auto-Activation Mechanics
In modern Kotlin versions, builder inference is enabled automatically if the compiler detects that regular type inference cannot resolve a generic parameter without looking inside the method execution calls of a lambda argument receiver. This removes the legacy requirement of marking signatures with a manual `@BuilderInference` decorator.
