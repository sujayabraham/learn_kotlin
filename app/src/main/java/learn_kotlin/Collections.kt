package learn_kotlin

fun demonstrateLists() {
    println("--- Lists ---")
    // Read-only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("Read-only list: $readOnlyShapes")
    
    // Mutable list
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("pentagon")
    println("Mutable list after add: $shapes")
    shapes.remove("triangle")
    println("Mutable list after remove: $shapes")
    
    // Access
    println("First item: ${readOnlyShapes.first()}")
    println("Last item: ${readOnlyShapes.last()}")
    println("Item at index 1: ${readOnlyShapes[1]}")
    
    // Existence and Count
    println("Is 'circle' in shapes? ${"circle" in readOnlyShapes}")
    println("Shapes count: ${readOnlyShapes.count()}")
}

fun demonstrateSets() {
    println("\n--- Sets ---")
    // Read-only set (duplicates are dropped)
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println("Read-only set (unique): $readOnlyFruit")
    
    // Mutable set
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    fruit.add("dragonfruit")
    println("Mutable set after add: $fruit")
    fruit.remove("apple")
    println("Mutable set after remove: $fruit")
    
    // Existence and Count
    println("Is 'banana' in fruit? ${"banana" in readOnlyFruit}")
    println("Fruit count: ${readOnlyFruit.count()}")
}

fun demonstrateMaps() {
    println("\n--- Maps ---")
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190)
    println("Read-only map: $readOnlyJuiceMenu")
    
    // Mutable map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190)
    juiceMenu["coconut"] = 150 // Add item
    println("Mutable map after add: $juiceMenu")
    juiceMenu.remove("apple") // Remove item
    println("Mutable map after remove: $juiceMenu")
    
    // Access and checks
    println("Price of kiwi: ${juiceMenu["kiwi"]}")
    println("Has kiwi? ${juiceMenu.containsKey("kiwi")}")
    println("All keys: ${juiceMenu.keys}")
    println("All values: ${juiceMenu.values}")
}

fun runCollectionsExercises() {
    println("\n--- Collections Exercises ---")
    
    // Exercise 1: Lists
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("Total count of numbers: ${greenNumbers.count() + redNumbers.count()}")
    
    // Exercise 2: Sets
    val supported = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in supported
    println("Support for $requested: $isSupported")
    
    // Exercise 3: Maps
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelled as '${number2word[n]}'")
}
