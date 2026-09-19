# Step-by-Step Explanation: Packages and Imports

Kotlin uses a standard package-based system to organize code, but with some extra flexibility in how those packages are declared and imported.

## 1. Package Headers
Every Kotlin file should start with a `package` declaration. If omitted, the file belongs to the "default" or "root" package. Unlike Java, the package name does not strictly have to match the directory structure, though it is highly recommended for project health.

## 2. Import Variations
- **Single Import**: `import com.example.MyClass`. Only this class is brought into scope.
- **Wildcard Import**: `import com.example.*`. Everything inside the package is accessible.
- **Alias Import**: `import com.example.MyClass as LocalClass`. This is essential for resolving name conflicts when two different packages have classes with the same name.

## 3. Default Imports
Kotlin automatically imports several packages into every file, including:
- `kotlin.*` (Standard types like `String`, `Int`)
- `kotlin.collections.*` (Lists, Maps)
- `kotlin.math.*` (Math utilities)
- `kotlin.io.*` (Printing)

## 4. Visibility and Scope
Imports only respect `public` and `internal` (within the same module) visibility. `private` top-level members are scoped strictly to the file they are defined in and cannot be imported elsewhere.

## 5. Verification
Verified by building the project. The implementation successfully used an alias to differentiate between a local `Message` class and a `Message` class imported from `learn_kotlin.other`.
