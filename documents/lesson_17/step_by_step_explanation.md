# Step-by-Step Explanation: Kotlin Libraries & APIs

Kotlin's ecosystem consists of a powerful standard library, official multiplatform libraries, and a safe mechanism for experimental features.

## 1. The Standard Library
The `kotlin.*` package is imported by default in every Kotlin file. It provides essential utilities like:
- **String operations**: `reversed()`, `uppercase()`, `trim()`.
- **Collections**: `List`, `Set`, `Map` and their extension functions.
- **Math**: Basic functions are available, but `kotlin.math` must be imported for advanced things like `pow()`, `sin()`, etc.

## 2. Time Measurement (`kotlin.time`)
Kotlin provides a type-safe way to represent durations.
- **Extension Properties**: You can write `5.minutes` or `1.hours` because of extensions on `Number`.
- **Companion Imports**: For these to work from Java or in certain contexts, you import `Duration.Companion.minutes`.

## 3. External Libraries (`kotlinx`)
Official libraries outside the standard library are usually under the `kotlinx` namespace.
- **`kotlinx-datetime`**: A multiplatform library for date and time. It handles `Instant`, `LocalDateTime`, and `TimeZone` more cleanly than the legacy Java `Date` API.

## 4. Opt-in APIs
Some features in Kotlin are marked as "Experimental" or "Requires Opt-in." This allows the Kotlin team to ship features while warning that the API might change.
- **`@OptIn`**: Used to acknowledge you are using such an API.
- **Example**: Unsigned types (`UInt`, `UIntArray`) are often under an opt-in requirement.

## 5. Verification
Verified by building the project. The external `kotlinx-datetime` library was correctly resolved after the Gradle sync, and the compound interest calculation successfully used the `Double.pow()` extension from the math library.
