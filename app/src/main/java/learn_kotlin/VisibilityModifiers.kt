package learn_kotlin

// 1. Top-level Visibility
private fun privateTopLevelFun() {
    println("This is a private top-level function - visible only in this file.")
}

internal val internalTopLevelProp = "Internal Property"

public val publicTopLevelProp = "Public Property"

// 2. Class Member Visibility
open class Base {
    private val privateMember = "private"
    protected open val protectedMember = "protected"
    internal val internalMember = "internal"
    val publicMember = "public" // default

    fun showPrivate() {
        println("Base can see its own private member: $privateMember")
    }
}

class Derived : Base() {
    override val protectedMember = "overridden protected"

    fun showAccess() {
        // println(privateMember) // ERROR: Invisible
        println("Derived can see protected: $protectedMember")
        println("Derived can see internal: $internalMember")
        println("Derived can see public: $publicMember")
    }
}

class Unrelated(base: Base) {
    init {
        // println(base.privateMember)   // ERROR: Invisible
        // println(base.protectedMember) // ERROR: Invisible in Kotlin (unlike Java)
        println("Unrelated in same module can see internal: ${base.internalMember}")
        println("Unrelated can see public: ${base.publicMember}")
    }
}

// 3. Constructor Visibility
class PrivateConstructor private constructor(val data: String) {
    companion object {
        fun create(data: String) = PrivateConstructor(data)
    }
}

// 4. Local Declarations
fun demonstrateLocalScope() {
    // private val local = 5 // ERROR: Visibility modifiers are not allowed for local variables
    val local = 5
    println("Local variable: $local")
}

fun demonstrateVisibility() {
    println("--- Top-level Visibility ---")
    privateTopLevelFun()
    println("Internal Prop: $internalTopLevelProp")
    println("Public Prop: $publicTopLevelProp")

    println("\n--- Class Member Visibility ---")
    val base = Base()
    base.showPrivate()
    
    val derived = Derived()
    derived.showAccess()
    
    val unrelated = Unrelated(base)
    
    println("\n--- Constructor Visibility ---")
    // val pc = PrivateConstructor("Hidden") // ERROR: Invisible
    val pc = PrivateConstructor.create("Visible via Factory")
    println("Private constructor instance data: ${pc.data}")
    
    println("\n--- Local Declarations ---")
    demonstrateLocalScope()
}
