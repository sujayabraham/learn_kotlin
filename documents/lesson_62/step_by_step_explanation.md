# Step-by-Step Explanation: Kotlin Coroutines Overview

Kotlin Coroutines provide a way to write asynchronous, non-blocking code that is easy to read and maintain. They are often described as "lightweight threads."

## 1. What is a Coroutine?
A coroutine is an instance of a suspendable computation. It is conceptually similar to a thread, but it is not bound to a specific native OS thread. 
- It can suspend its execution on one thread and resume on another.
- Coroutines are managed by the Kotlin runtime, not the Operating System.

## 2. The `suspend` Keyword
The `suspend` keyword is used to mark functions that can pause the execution of a coroutine without blocking the underlying thread.
- Suspending functions can only be called from other suspending functions or from a coroutine scope.
- They allow for "sequential async code"—you write code that looks like synchronous logic, but it performs asynchronous work under the hood.

## 3. Coroutine Scopes and Builders
- **`launch`**: A coroutine builder that starts a new coroutine without returning a result (fire-and-forget). It returns a `Job` object.
- **`runBlocking`**: A coroutine builder that bridges regular code and coroutines. It blocks the current thread until all coroutines within its scope complete. It is mainly used in `main` functions and tests.
- **`CoroutineScope`**: Defines the lifecycle of coroutines. Using **Structured Concurrency**, coroutines launched in a scope are tied to that scope's lifetime.

## 4. Lightweight Nature
Coroutines are incredibly memory-efficient. While spawning thousands of OS threads would likely crash your system with an `OutOfMemoryError`, you can easily launch tens or even hundreds of thousands of coroutines on a single thread.
- Coroutines use very little memory (just a few hundred bytes each).
- Suspension frees up the thread for other work, making system resource usage extremely efficient.
