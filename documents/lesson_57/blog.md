# Blog: Offloading Work - Delegated Properties in Kotlin

Day 57! Today I focused on **Delegated Properties** in Kotlin. When writing applications, you frequently run into situations where multiple properties across completely different classes need to share the exact same behavior—like caching values, intercepting updates for database logging, loading heavy configuration files lazily, or trimming text strings.

Traditionally, this forces you to write duplicate boilerplate code inside every custom getter and setter. Kotlin eliminates this duplication entirely by allowing properties to hand over their behavior to an independent manager object known as a **Property Delegate**.

---

## The Handshake: The `by` Keyword

Delegating a property is incredibly elegant. You drop the internal backing field completely and tell the property to forward its read and write tasks to a specific delegate instance using the **`by`** keyword:

```kotlin
var databaseStatus: String by Delegates.observable("OFFLINE") { ... }
```

Whenever the rest of the application reads or writes to `databaseStatus`, Kotlin seamlessly translates the call straight to the delegate object behind the scenes with zero performance cost!

---

## Built-in Superpowers: `lazy` and `observable`

Kotlin comes packed with standard built-in delegates that solve common development challenges out of the box:

### 1. Lazy Caching (`by lazy`)
Have you ever needed to load a heavy object (like an encrypted security token or a database file) but wanted to avoid loading it during app startup? The `lazy` delegate solves this perfectly. It postpones running the initialization block until the property is **accessed for the very first time**. It computes the value once, caches it, and returns that cached result instantly on all future reads.

### 2. State Observers (`Delegates.observable`)
If you need to trigger a UI refresh or log a security alert whenever a configuration value shifts, the `observable` delegate acts as an automatic property change interceptor. It listens to assignments and executes a callback block, passing along the property name, the old value, and the new value.

---

## Infinite Reuse: Designing Custom Delegates

The ultimate power of delegation is unlocked when you write your own custom delegates. For example, if you want multiple string fields across your data models to automatically strip out accidental surrounding whitespaces during assignments, you can create a reusable trimmer delegate class:

```kotlin
class CustomStringTrimmerDelegate {
    private var internalValue: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>) = internalValue
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        internalValue = value.trim() // Clean string automatically before saving!
    }
}

// Usage inside any class is clean and simple:
var environmentEndpoint: String by CustomStringTrimmerDelegate()
```

## Summary

Property delegation allows developers to decouple property behavior from data definitions completely. By offloading cross-cutting concerns to specialized delegates, your codebase remains clean, modular, and dry.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #DelegatedProperties #LazyInitialization #DesignPatterns #CleanCode #AndroidDev #JVM
