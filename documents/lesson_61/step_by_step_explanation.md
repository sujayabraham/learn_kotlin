# Step-by-Step Explanation: Asynchronous Programming in Kotlin

Kotlin provides various ways to handle asynchronous operations. This lesson provides an overview of common techniques and why Coroutines are the preferred solution.

## 1. Threading
Threading is the most basic form of concurrency. You spawn a new OS thread to run a task in the background.
- **Limitation**: Threads are resource-intensive. Spawning too many can exhaust system memory and slow down the CPU due to context switching.

## 2. Callbacks
Callbacks involve passing a function as an argument to be executed once a task completes.
- **Limitation**: As logic becomes complex, you enter "Callback Hell"—heavily nested code that is difficult to read, maintain, and handle errors for.

## 3. Futures and Promises
Java 8 introduced `CompletableFuture`, which allows chaining tasks and combining results.
- **Limitation**: While better than callbacks, the code can still become verbose with complex combinators (`thenCompose`, `thenCombine`, etc.).

## 4. Coroutines (The Kotlin Way)
Coroutines are "lightweight threads." They allow you to write asynchronous code in a sequential manner using the `suspend` keyword.
- **Advantage**: They are non-blocking. Instead of waiting for a thread to finish (blocking), a coroutine can "suspend" its execution, freeing up the thread for other tasks, and resume later.
- **Readability**: Code looks like normal synchronous code, making it much easier to reason about and debug.
