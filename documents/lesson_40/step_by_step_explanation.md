# Step-by-Step Explanation: Context Parameters in Kotlin

Context Parameters (introduced as an advanced experimental capability in Kotlin 2.0.20+) provide a formal, type-safe approach to declaring implicit contextual dependencies for functions, properties, and classes.

## 1. What are Context Parameters?
Traditionally, passing cross-cutting dependencies like loggers, transaction coordinators, database connections, or security roles forced developers into two patterns:
1. **Explicit Parameter Passing**: Adding parameters to every single function signature (`fun perform(data: String, logger: Logger)`), which clutters business logic.
2. **Dependency Injection / Fields**: Storing dependencies inside a class instance, which binds functions rigidly to specific classes or state objects.

**Context Parameters** solve this by moving dependencies into a specialized declaration layer header (`context(logger: Logger)`). These parameters are filled implicitly by the calling environment without being typed explicitly in every individual function call argument list.

## 2. Syntax Breakdown
The `context(...)` block precedes the function declaration:
```kotlin
context(logger: Logger)
fun performBusinessLogic(data: String) {
    logger.log("Performing logic: $data")
}
```
- Inside the function scope, the context parameter variable (`logger`) is fully accessible just like a normal explicit parameter.
- Multiple contexts can be chained together via a comma-separated list (`context(logger: Logger, tx: TransactionContext)`).

## 3. Invoking with Scopes
To call a function configured with context parameters, the surrounding calling environment must contain active instances matching those declared types. This is commonly satisfied using structured scoping functions like **`with(...)`**:
```kotlin
val myLogger = Logger()
with(myLogger) {
    performBusinessLogic("Application Data") // Automatically matches 'logger' context parameter
}
```

## 4. Evolution from Context Receivers
Context parameters represent a design evolution over the legacy experimental *Context Receivers* feature:
- Legacy Context Receivers used an anonymous type signature layout (`context(Logger)`) where internal methods were invoked via implicit `this` targeting, which occasionally caused name conflicts or ambiguity.
- **Context Parameters** name dependencies explicitly (`context(logger: Logger)`), significantly improving code clarity, self-documentation, and making name resolution completely unambiguous.
