# Step-by-Step Explanation: Destructuring Declarations in Kotlin

Destructuring declarations allow you to "unpack" an object into multiple variables. This makes it easier to work with complex data structures like data classes and maps.

## 1. How It Works
A destructuring declaration is compiled into calls to specialized functions named `component1()`, `component2()`, and so on.
```kotlin
val (name, age) = person
```
is compiled to:
```kotlin
val name = person.component1()
val age = person.component2()
```

## 2. Data Classes
Data classes are the most common source of destructuring. The compiler automatically generates `componentN()` functions for all properties declared in the primary constructor.
- The variables are assigned in the order they are defined in the constructor, not by name.

## 3. Returning Multiple Values
You can use destructuring to "return" multiple values from a function by returning a `data class`, a `Pair`, or a `Triple`.
```kotlin
fun getCoords() = Pair(10, 20)
val (x, y) = getCoords()
```

## 4. Maps and Iteration
One of the most useful applications of destructuring is iterating over maps. A map entry can be destructured into its key and value.
```kotlin
for ((key, value) in map) { ... }
```

## 5. Unused Variables (The Underscore)
If you don't need all the values from a destructuring declaration, you can use an underscore `_` to skip a variable. This tells the compiler not to call the corresponding `componentN()` function.
```kotlin
val (name, _, role) = user
```

## 6. Destructuring in Lambdas
You can use destructuring in lambda parameters. If a lambda takes a parameter that has component functions (like a data class or a map entry), you can destructure it directly in the parameter list.
```kotlin
list.map { (name, age) -> ... }
```
Note: Use parentheses around the destructured parameters.
