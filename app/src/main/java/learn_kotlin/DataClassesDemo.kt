package learn_kotlin

// 1. Defining a core Data Class representation
// The compiler automatically generates toString(), equals(), hashCode(), copy(), and componentN() functions.
data class UserProfile(val username: String, var age: Int, val country: String = "Global")

fun demonstrateDataClasses() {
    println("--- Data Classes Mechanics ---")

    // Instantiation
    val user1 = UserProfile("alice99", 25, "Canada")
    val user2 = UserProfile("bob_builder", 30) // Uses default country parameter
    
    // 2. Automated toString() verification
    println("Automated toString() output:\n  user1: $user1\n  user2: $user2")

    // 3. Automated structural equality equals() vs referential equality ===
    val user1CopyIdentical = UserProfile("alice99", 25, "Canada")
    println("\nEvaluating Equality:")
    println("  Structural equality (user1 == user1CopyIdentical): ${user1 == user1CopyIdentical}")
    println("  Referential equality (user1 === user1CopyIdentical): ${user1 === user1CopyIdentical}")

    // 4. Using the copy() function to create modified instances cleanly
    val user1MovedToUx = user1.copy(country = "United Kingdom")
    val user1Aged = user1.copy(age = 26)
    println("\nModified instances via copy():")
    println("  Moved country: $user1MovedToUx")
    println("  Incremented age: $user1Aged")

    // 5. Destructuring Declarations via compiled componentN() properties
    println("\nDestructuring Declarations:")
    val (name, currentAge, locale) = user1
    println("  Unpacked properties: name=$name, age=$currentAge, locale=$locale")
}
