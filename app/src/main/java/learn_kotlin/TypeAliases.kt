package learn_kotlin

import java.io.File

// 1. Simple Type Aliases for Existing Types
typealias NodeSet = Set<NetworkNode>
typealias FileList = List<File>

class NetworkNode(val name: String)

fun demonstrateSimpleAliases() {
    println("--- Simple Type Aliases ---")
    val nodes: NodeSet = setOf(NetworkNode("Server-A"), NetworkNode("Server-B"))
    val files: FileList = listOf(File("test.txt"))
    
    println("NodeSet contains ${nodes.size} nodes.")
    println("FileList contains ${files.size} files.")
}

// 2. Type Aliases for Generic Types
typealias MyMap<K, V> = Map<K, List<V>>

fun demonstrateGenericAliases() {
    println("\n--- Generic Type Aliases ---")
    val data: MyMap<String, Int> = mapOf(
        "evens" to listOf(2, 4, 6),
        "odds" to listOf(1, 3, 5)
    )
    println("Generic MyMap keys: ${data.keys}")
}

// 3. Type Aliases for Function Types
typealias Predicate<T> = (T) -> Boolean
typealias MouseClickHandler = (String, Int) -> Unit

fun demonstrateFunctionTypeAliases() {
    println("\n--- Function Type Aliases ---")
    
    // Using a custom predicate type alias
    val isEven: Predicate<Int> = { it % 2 == 0 }
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Filtered evens using Predicate alias: ${numbers.filter(isEven)}")
    
    // Using a custom handler type alias
    val onClick: MouseClickHandler = { element, button -> 
        println("Clicked element '$element' with button ID $button")
    }
    onClick("SubmitButton", 1)
}

// 4. Type Aliases for Inner Classes
class Outer {
    inner class InnerClass {
        fun greet() = "Hello from InnerClass!"
    }
}

typealias OuterInner = Outer.InnerClass

fun demonstrateInnerClassAliases() {
    println("\n--- Inner Class Type Aliases ---")
    val outer = Outer()
    val inner: OuterInner = outer.InnerClass()
    println(inner.greet())
}

// Main runner function called from App.java
fun demonstrateTypeAliases() {
    demonstrateSimpleAliases()
    demonstrateGenericAliases()
    demonstrateFunctionTypeAliases()
    demonstrateInnerClassAliases()
}
