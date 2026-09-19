# Blog: Beyond Dependency Injection - Context Parameters in Kotlin

Day 40! Today I explored one of the most exciting new developments in the Kotlin ecosystem: **Context Parameters**. Introduced as a fresh, refined feature in modern Kotlin versions (Kotlin 2.0.20+), context parameters provide an exceptionally elegant way to handle cross-cutting concerns like loggers, configuration contexts, or transaction scopes.

## The Cluttered Architecture Dilemma
In any large application, you frequently have utility objects like a `Logger` or an analytics tracker that need to be accessed deep inside your business functions. You are left with two uncomfortable choices: pass the logger explicitly into *every single function* as a parameter (which creates massive noise), or instantiate mutable global dependencies.

Kotlin introduces a third, incredibly elegant option. You declare that a function requires a specific **context** to exist in order to be executed:

```kotlin
context(logger: Logger)
fun performBusinessLogic(data: String) {
    logger.log("Clean, readable code with implicit context dependencies!")
}
```

## How It Works
When you declare a `context(logger: Logger)`, you are instructing the Kotlin compiler that whoever calls this method must supply a `Logger` object in their environment.

Instead of typing out the argument manually on every function invocation, you supply it implicitly using standard scoping functions like `with`:

```kotlin
val myLogger = Logger()

with(myLogger) {
    // The compiler sees myLogger in scope and automatically maps it to the context parameter!
    performBusinessLogic("Important Business Data")
}
```

## The Evolution: Parameters Over Receivers
If you have kept an eye on Kotlin development, you might recall an older experimental feature called *Context Receivers*. While the concept was similar, receivers were completely anonymous, which occasionally led to confusing name clashes or weird `this@Type` syntax workarounds.

**Context Parameters** fix this entirely by giving the dependency a clear, user-defined local name (`logger`). It makes your code highly explicit, self-documenting, and beautifully readable.

## Summary
Context parameters give developers the capability to declare context requirements with complete type safety and clear naming, cleanly splitting business arguments from infrastructure dependencies.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #ContextParameters #CleanCode #Architecture #Kotlin2 #AndroidDev #JVM
