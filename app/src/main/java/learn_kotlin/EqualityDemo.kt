package learn_kotlin

// A simple standard class to demonstrate default reference comparison behavior
class BasicUser(val name: String, val age: Int)

// A data class to demonstrate automated structural value comparison behavior
data class DataUser(val name: String, val age: Int)

fun demonstrateEqualityOperations() {
    println("--- Structural vs Referential Equality ---")

    // 1. Structural Equality (==) vs Referential Equality (===) on Standard Classes
    val userA = BasicUser("Alice", 25)
    val userB = BasicUser("Alice", 25)

    println("Standard Class (BasicUser):")
    // == checks structural equality by calling equals(). For standard classes, default equals() checks reference.
    println("  userA == userB (Structural): ${userA == userB}") 
    // === checks referential equality (whether they point to the exact same object instance on the heap)
    println("  userA === userB (Referential): ${userA === userB}")
    
    val userACopyRef = userA
    println("  userA === userACopyRef (Same reference): ${userA === userACopyRef}")

    // 2. Structural Equality (==) vs Referential Equality (===) on Data Classes
    // Data classes automatically override equals() to check property values structurally.
    val dataUserA = DataUser("Bob", 30)
    val dataUserB = DataUser("Bob", 30)

    println("\nData Class (DataUser):")
    // == checks structural values, returning true because data fields match perfectly.
    println("  dataUserA == dataUserB (Structural): ${dataUserA == dataUserB}")
    // === checks reference, returning false because they are distinct heap allocations.
    println("  dataUserA === dataUserB (Referential): ${dataUserA === dataUserB}")

    // 3. Null Safety handles within Structural Equality checks
    // In Kotlin, writing 'a == b' automatically safe-guards against nulls. 
    // It translates directly to: 'if (a == null) b === null else a.equals(b)'
    val nullUser: DataUser? = null
    println("\nHandling Nulls with ==:")
    println("  nullUser == dataUserA: ${nullUser == dataUserA}")
    println("  nullUser == null: ${nullUser == null}")
}
