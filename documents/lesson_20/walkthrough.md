# Walkthrough - Kotlin: Annotations

In this lesson, we explored Kotlin **Annotations**, which are a powerful way to attach metadata to various elements of your code. We covered declaration, usage, parameters, and specialized JVM targeting.

## Changes Made

### Configuration
- Added `kotlin-reflect` to the project dependencies to enable runtime inspection of annotations.

### Implementation
- Created [Annotations.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Annotations.kt) which implements:
    - **Annotation Declaration**: Using `annotation class` with meta-annotations like `@Target`, `@Retention`, and `@MustBeDocumented`.
    - **Constructors with Parameters**: Showing how annotations can take strings, classes, and even other annotations as arguments.
    - **Use-Site Targets**: Using `@field:`, `@get:`, and `@param:` to precisely control where annotations are placed in the generated Java bytecode.
    - **Repeatable Annotations**: Using `@Repeatable` to allow multiple instances of the same annotation on a single element.
    - **Expression Annotations**: Demonstrating `@Retention(AnnotationRetention.SOURCE)` for expression-level metadata.
- Updated [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java) to execute the annotation demonstration.

## Verification
- **Build**: Successfully executed `./gradlew :app:assemble`.
- **Logic**: Verified that runtime reflection correctly identifies `@Fancy` on the class and retrieves multiple `@Tag` instances from the repeatable example.

See the [Step-by-Step Explanation](./step_by_step_explanation.md) for technical details.
