# Step-by-Step Explanation: Reflection in Kotlin

Reflection is a set of language and library features that allow you to introspect the structure of your own program at runtime. Kotlin provides a functional reflection API tailored for its features like properties and null-safety.

## 1. Class References
The most basic feature of reflection is getting a runtime reference to a Kotlin class. 
- Use the `::class` syntax to get a `KClass` object.
- Example: `val c = MyClass::class`.
- From a `KClass`, you can access metadata like the class's name, its members (functions, properties), and its constructors.

## 2. Function References
You can refer to a function as a first-class value.
- Use the `::` operator before the function name to get a `KFunction`.
- Example: `val isOddRef = ::isOdd`.
- These references can be passed to higher-order functions (like `filter` or `map`).

## 3. Property References
Properties can also be accessed via reflection.
- Use the `::` operator with a class and property name.
- Example: `val prop = MyClass::myProperty`.
- A `KProperty` allows you to get or set (if mutable) the property value for a specific instance.
- `KProperty1<T, R>` represents a property of class `T` with return type `R`.

## 4. Bound References
You can create references that are "bound" to a specific object instance.
- Example: `val boundGreet = myInstance::greet`.
- When you call a bound reference, it automatically uses that specific instance as the receiver.

## 5. Constructor References
Constructors can be referred to just like functions.
- Use the `::` operator with the class name.
- Example: `val factory = ::MyClass`.
- Calling the reference invokes the constructor and returns a new instance.

## 6. Kotlin Reflect Library
For advanced reflection (like listing all members of a class), you need to add the `kotlin-reflect` dependency to your project. This provides extensions like `full.memberProperties`.
