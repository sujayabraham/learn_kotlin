# Step-by-Step Explanation: Adding Kotlin to a Java Project

This document explains the steps taken to integrate Kotlin into the existing Java application and call Kotlin code from Java.

## 1. Project Configuration

### Update Version Catalog (`libs.versions.toml`)
First, we added the Kotlin version and defined the Kotlin JVM plugin and standard library in the Gradle version catalog.

- **File**: [libs.versions.toml](file:///Users/sujay/learn_kotlin/gradle/libs.versions.toml)
- **Changes**:
    - Added `kotlin = "2.4.20"` to the `[versions]` section.
    - Added `kotlin-stdlib` to the `[libraries]` section.
    - Added `kotlin-jvm` to the `[plugins]` section.

### Apply Kotlin Plugin (`build.gradle.kts`)
Next, we applied the Kotlin JVM plugin to the application module and added the standard library dependency.

- **File**: [build.gradle.kts](file:///Users/sujay/learn_kotlin/app/build.gradle.kts)
- **Changes**:
    - Added `alias(libs.plugins.kotlin.jvm)` to the `plugins` block.
    - Added `implementation(libs.kotlin.stdlib)` to the `dependencies` block (though the plugin often adds this automatically, it's good practice to be explicit).

## 2. Implementing Kotlin Logic

### Create Kotlin File (`Hello.kt`)
We created a new Kotlin file containing basic syntax examples: a function with a return value, a function that prints a sum, and a greeting function.

- **File**: [Hello.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Hello.kt)
- **Code**:
```kotlin
package learn_kotlin

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun getGreeting(): String {
    return "Hello from Kotlin!"
}
```

## 3. Interoperability

### Call Kotlin from Java (`App.java`)
Finally, we updated the Java `main` method to call the Kotlin functions. In Kotlin, top-level functions are compiled into a class named after the file with a `Kt` suffix (e.g., `HelloKt`).

- **File**: [App.java](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/App.java)
- **Changes**:
    - Called `HelloKt.getGreeting()`.
    - Called `HelloKt.printSum(10, 20)`.
    - Called `HelloKt.sum(5, 7)` and printed the result.

## 4. Verification
We verified the changes by running a Gradle build:
- Ran `./gradlew :app:assemble` to ensure everything compiles correctly.
- The IDE correctly resolved the `HelloKt` class after the build/sync.
