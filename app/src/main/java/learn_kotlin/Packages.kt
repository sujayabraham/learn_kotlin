package learn_kotlin

// 1. Single Import
import learn_kotlin.other.printOtherMessage

// 2. Wildcard Import (simulated by importing all from other)
import learn_kotlin.other.*
import kotlin.math.sqrt

// 3. Alias Import
import learn_kotlin.other.Message as OtherMessage

// 4. Name clash resolution (simulated with a local class)
class Message(val text: String)

fun demonstratePackages() {
    println("--- Package and Import Statements ---")
    
    // Using single import
    printOtherMessage("Hello from Utils")
    
    // Using locally defined class
    val localMsg = Message("Local Message")
    println("Local Message: ${localMsg.text}")
    
    // Using alias import to avoid clash with local 'Message'
    val otherMsg = OtherMessage("Message from 'other' package")
    println("Other Message (via alias): ${otherMsg.content}")
    
    println("\n--- Default Imports ---")
    // kotlin.math.* is imported by default
    val root = sqrt(16.0)
    println("Square root of 16 (default import): $root")
}
