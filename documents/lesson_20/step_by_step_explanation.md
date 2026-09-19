# Step-by-Step Explanation: Kotlin Annotations

Annotations provide a way to add metadata to your code, which can be used by the compiler, the IDE, or at runtime via reflection.

## 1. Defining Annotations
Annotations are declared as special classes. Unlike regular classes, they cannot have a body and their parameters must be defined in the primary constructor.
```kotlin
annotation class Special(val why: String)
```
**Meta-annotations:**
- `@Target`: Limits where the annotation can be used (e.g., `CLASS`, `FUNCTION`, `EXPRESSION`).
- `@Retention`: Controls how long the annotation survives (`SOURCE`, `BINARY`, `RUNTIME`).
- `@Repeatable`: Allows the same annotation to be applied multiple times to one element.

## 2. Parameter Restrictions
Annotation parameters are limited to:
- Primitive types
- Strings
- Classes (`KClass`)
- Enums
- Other annotations
- Arrays of the above
**Crucially, parameters cannot be nullable.**

## 3. Use-Site Targets
Since a single Kotlin property generates multiple JVM elements (field, getter, setter), you often need to specify which one you are annotating.
- `@field:Ann`: Attaches to the Java field.
- `@get:Ann`: Attaches to the Java getter.
- `@set:Ann`: Attaches to the Java setter.
- `@param:Ann`: Attaches to the constructor parameter.

## 4. Expression Annotations
Kotlin allows annotating expressions, but they **must** have `AnnotationRetention.SOURCE` (or default to it) because the JVM does not support expression-level annotations in bytecode.

## 5. Reflection Support
To inspect annotations at runtime, you need the `kotlin-reflect` library. In this lesson, we used `::class.annotations` to verify that our metadata was correctly attached.

## 6. Verification
Verified by building the project. The implementation demonstrated that `@Repeatable` annotations are collected into a list and that use-site targets allow precise bytecode generation.
