# Blog: Logic at its Simplest - Understanding Booleans in Kotlin

Day 27! Today I looked at the most fundamental unit of decision-making: **Booleans**. 

## True or False (and maybe Null?)
At its core, a Boolean is just `true` or `false`. But Kotlin makes it interesting by adding null safety to the mix. A `Boolean?` can be in three states, which is actually very useful for things like "Not yet decided" or "Unknown." I learned that you can't just throw a nullable boolean into an `if` statement; you have to be explicit, which prevents those nasty accidental null pointer exceptions.

## Efficiency with Short-circuiting
I also revisited **Short-circuiting**. It’s a performance feature where the computer stops checking conditions as soon as it knows the final answer. 
- If you have `false && expensiveOperation()`, Kotlin skips the expensive operation entirely! 
- Same for `true || expensiveOperation()`. 
It’s a simple rule that saves a lot of processing power.

## Precedence: The "Hidden" Rule
I was reminded that `&&` always goes before `||`. It’s like order of operations in math. Knowing this is the difference between a bug and a perfectly functioning feature when you have complex business logic.

## Simple and Safe
Booleans in Kotlin aren't flashy, but they are built on the same foundations of safety and efficiency as the rest of the language. No "truthy" or "falsy" values here—just clear, predictable logic.

Check out the full [technical breakdown](./step_by_step_explanation.md)!

#Kotlin #Booleans #Logic #CleanCode #ProgrammingBasics #TypeSafety #ShortCircuit
