# Step-by-Step Explanation: Class Delegation in Kotlin

Class Delegation is a powerful native compiler optimization pattern that implements the **Composition over Inheritance** design principle, allowing a class to delegate its interface contracts straight to an underlying object instance with zero boilerplate.

## 1. Composition over Inheritance
Inheritance is a common approach to extend functionality, but it binds subclasses rigidly to parent structures, which can introduce fragile architectural dependencies. 
- The **Decorator Pattern** or **Composition** provides a safer alternative: a wrapper class implements an interface and contains an internal instance field of that same interface, forwarding calls manually.
- While safe, manual composition requires writing hundreds of lines of tedious forwarding methods (boilerplate).

## 2. Native Compiler Delegation (`by`)
Kotlin eliminates delegation boilerplate completely through the **`by`** keyword modifier.
- When you declare a class like `class SmartVehicle(engine: Engine) : Engine by engine`, you are instructing the compiler to generate all mandatory forwarding interface methods behind the scenes automatically.
- At runtime, invoking `vehicle.getFuelType()` directly translates to a fast forwarding jump to `engine.getFuelType()`, introducing zero performance overhead.

## 3. Explicit Selective Overrides
You are never locked into the delegated implementation. 
- If you need to intercept or customize a specific interface method, you can simply declare an explicit **`override`** function block for that method inside your class body.
- The compiler will prioritize your explicit override for that method while continuing to auto-forward all other unmentioned interface methods to the delegated target object.
