# Kotlin Learning Journey

This repository contains a comprehensive step-by-step learning guide for Kotlin, ranging from basic syntax to advanced concurrency and reflection.

## Project Structure

- **`app/src/main/java/learn_kotlin/`**: Source code for all Kotlin lessons.
- **`documents/`**: Detailed walkthroughs, step-by-step explanations, and blog posts for each session.

## Lessons Index

| Lesson | Topic | Description | Source File |
| :--- | :--- | :--- | :--- |
| **1** | Adding Kotlin to Java | Integrating Kotlin into an existing Java project. | [Hello.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Hello.kt) |
| **2** | Kotlin Tour Basics | Variables (`val`, `var`) and String Templates. | [KotlinTour.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/KotlinTour.kt) |
| **3** | Basic Types | Type inference and explicit type declarations. | [BasicTypes.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/BasicTypes.kt) |
| **4** | Collections | Lists, Sets, and Maps (Mutable vs Immutable). | [Collections.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Collections.kt) |
| **5** | Control Flow | `if`, `when`, ranges, and loops (`for`, `while`). | [ControlFlow.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ControlFlow.kt) |
| **6** | Functions | Named arguments, defaults, and single-expressions. | [Functions.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Functions.kt) |
| **7** | Classes and Objects | Constructors, properties, and class initialization. | [Classes.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Classes.kt) |
| **8** | Null Safety | Safe calls (`?.`) and the Elvis operator (`?:`). | [NullSafety.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/NullSafety.kt) |
| **9** | Extension Functions | Adding functionality to existing classes without inheritance. | [ExtensionFunctions.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ExtensionFunctions.kt) |
| **10** | Scope Functions | Utilizing `let`, `run`, `with`, `apply`, and `also`. | [ScopeFunctions.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ScopeFunctions.kt) |
| **11** | Lambdas with Receivers | Building DSL-like structures with `T.() -> Unit`. | [LambdasWithReceivers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/LambdasWithReceivers.kt) |
| **12** | Intermediate Classes | Interfaces, inheritance, and abstract classes. | [IntermediateClasses.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/IntermediateClasses.kt) |
| **13** | Objects | Singleton declarations and companion objects. | [Objects.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Objects.kt) |
| **14** | Special Classes | Data, Enum, Sealed, and Inline Value classes. | [SpecialClasses.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/SpecialClasses.kt) |
| **15** | Properties | Custom getters and setters with backing fields. | [Properties.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Properties.kt) |
| **16** | Intermediate Null Safety | Deep dive into `lateinit`, `notNull`, and platform types. | [IntermediateNullSafety.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/IntermediateNullSafety.kt) |
| **17** | Standard Libraries | Exploring Kotlin Standard Library utilities and APIs. | [LibrariesAndAPIs.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/LibrariesAndAPIs.kt) |
| **18** | Basic Syntax | Summary of fundamental syntax rules and idioms. | [BasicSyntax.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/BasicSyntax.kt) |
| **19** | Packages and Imports | Managing namespaces and importing declarations. | [Packages.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Packages.kt) |
| **20** | Annotations | Defining and using metadata via annotations. | [Annotations.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Annotations.kt) |
| **21** | Visibility Modifiers | `public`, `internal`, `protected`, and `private` rules. | [VisibilityModifiers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/VisibilityModifiers.kt) |
| **22** | Backing Properties | Implementing the backing property naming convention. | [BackingProperties.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/BackingProperties.kt) |
| **23** | Execute if Null | Idiomatic patterns for executing logic on null values. | [Idioms.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Idioms.kt) |
| **24** | Types Overview | Broad overview of Kotlin's hierarchy (Any, Unit, Nothing). | [TypesOverview.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/TypesOverview.kt) |
| **25** | Numbers | Integer and Floating-Point literal mechanics. | [Numbers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Numbers.kt) |
| **26** | Unsigned Integers | Using `UInt`, `ULong`, and unsigned arithmetic. | [UnsignedNumbers.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/UnsignedNumbers.kt) |
| **27** | Booleans | Logical operators and boolean type behavior. | [Booleans.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Booleans.kt) |
| **28** | Characters | Working with the `Char` type and escapes. | [Characters.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Characters.kt) |
| **29** | Strings | Multiline literals, templates, and string manipulation. | [Strings.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Strings.kt) |
| **30** | Arrays | Specialized primitive arrays and invariant behavior. | [Arrays.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Arrays.kt) |
| **31** | Type Casts | Smart casts, unsafe (`as`), and safe (`as?`) operators. | [TypeCasts.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/TypeCasts.kt) |
| **32** | Type Aliases | Providing alternative names for complex types. | [TypeAliases.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/TypeAliases.kt) |
| **33** | Adv. Control Flow | Targetless `when` and advanced range stepping. | [ControlFlowAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ControlFlowAdvanced.kt) |
| **34** | Returns and Jumps | Using labels to break, continue, or return from nested scopes. | [ReturnsAndJumps.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ReturnsAndJumps.kt) |
| **35** | Exceptions | Unchecked exceptions and `try` as an expression. | [ExceptionsAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ExceptionsAdvanced.kt) |
| **36** | Adv. Functions | Infix functions, `vararg`, and `tailrec` optimizations. | [FunctionsAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/FunctionsAdvanced.kt) |
| **37** | Adv. Lambdas | Closures, function types, and literals with receiver. | [LambdasAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/LambdasAdvanced.kt) |
| **38** | Type-Safe Builders | Creating custom DSLs for markup and configuration. | [TypeSafeBuilders.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/TypeSafeBuilders.kt) |
| **39** | Builder Inference | Inferring generic types from builder lambda contents. | [BuilderInferenceDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/BuilderInferenceDemo.kt) |
| **40** | Context Parameters | Declaring implicit dependencies for functions (2.0.20+). | [ContextParametersDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ContextParametersDemo.kt) |
| **41** | Inline Functions | Bytecode inlining, `noinline`, and `crossinline`. | [InlineFunctionsDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/InlineFunctionsDemo.kt) |
| **42** | Operator Overload | Mapping symbols like `+` and `[]` to member functions. | [OperatorOverloadingDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/OperatorOverloadingDemo.kt) |
| **43** | @CheckResult | Static analysis to ensure return values are not ignored. | [CheckResultDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/CheckResultDemo.kt) |
| **44** | Advanced Classes | Constructors, init blocks, and Data Class mechanics. | [ClassesAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ClassesAdvanced.kt), [DataClassesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/DataClassesDemo.kt) |
| **45** | Extensions | Extension functions and properties on existing types. | [ExtensionsAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ExtensionsAdvanced.kt) |
| **46** | Interfaces | Method implementations and property contracts in interfaces. | [InterfacesAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/InterfacesAdvanced.kt) |
| **47** | Class Delegation | Composition over inheritance using the `by` keyword. | [DelegationDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/DelegationDemo.kt) |
| **48** | Inheritance Rules | Member overriding and multi-inheritance conflict resolution. | [InheritanceRulesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/InheritanceRulesDemo.kt) |
| **49** | Object Declarations | Singletons, companion objects, and expressions. | [ObjectDeclarationsAdvanced.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ObjectDeclarationsAdvanced.kt) |
| **50** | `this` Expressions | Identifying implicit receivers in nested scopes. | [ThisExpressionsDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ThisExpressionsDemo.kt) |
| **51** | Sealed Classes | Bounded type hierarchies for exhaustive pattern matching. | [SealedClassesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/SealedClassesDemo.kt) |
| **52** | Enum Classes | Constants with parameters and abstract member overrides. | [EnumAndInlineDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/EnumAndInlineDemo.kt) |
| **53** | Inline Classes | Optimizing wrappers with `@JvmInline value class`. | [InlineValueClassesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/InlineValueClassesDemo.kt) |
| **54** | Nested and Inner | Static nested vs. instance-bound inner class models. | [NestedClassesDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/NestedClassesDemo.kt) |
| **55** | SAM Interfaces | Single Abstract Method conversion and `fun interface`. | [Functional_Interfaces.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/Functional_Interfaces.kt) |
| **56** | Properties & Fields | Backing fields and granular visibility for setters. | [UserAccountProfile.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/UserAccountProfile.kt) |
| **57** | Delegated Props | Using `lazy`, `observable`, and custom delegates. | [MaxLengthStringDelegate.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/MaxLengthStringDelegate.kt) |
| **58** | Null Safety | Safe calls, Elvis operator, and nullable type mechanics. | [NullSafetyOperations.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/NullSafetyOperations.kt) |
| **59** | Equality | Structural (`==`) vs. Referential (`===`) comparison. | [EqualityDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/EqualityDemo.kt) |
| **60** | Generics | Type parameters, constraints, and variance (`in`/`out`). | [GenericsDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/GenericsDemo.kt) |
| **61** | Async Overview | Exploring threading, callbacks, and future models. | [AsyncProgrammingOverview.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/AsyncProgrammingOverview.kt) |
| **62** | Coroutines Intro | Introduction to non-blocking suspending functions. | [CoroutinesOverview.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/CoroutinesOverview.kt) |
| **63** | Reflection | Runtime introspection of classes and members. | [ReflectionDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/ReflectionDemo.kt) |
| **64** | Destructuring | Unpacking data classes and map entries into variables. | [DestructuringDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/DestructuringDemo.kt) |
| **65** | Grammar & Syntax | The formal structure and philosophical pillars of Kotlin. | [GrammarSyntaxDemo.kt](file:///Users/sujay/learn_kotlin/app/src/main/java/learn_kotlin/GrammarSyntaxDemo.kt) |

## How to Run

1.  Sync the project with Gradle.
2.  Run the `main` method in `learn_kotlin.App` to execute the full demonstration suite.
