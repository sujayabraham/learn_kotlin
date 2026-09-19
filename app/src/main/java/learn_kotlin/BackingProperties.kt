package learn_kotlin

class Element(val name: String)

/**
 * Demonstrates the coding convention for backing properties.
 * If a class has two properties which are conceptually the same but one is part of 
 * a public API and another is an implementation detail, use an underscore as the 
 * prefix for the name of the private property.
 */
class Inventory {
    // Implementation detail (private, mutable)
    private val _items = mutableListOf<Element>()
    
    // Public API (read-only view)
    val items: List<Element>
        get() = _items

    fun addItem(name: String) {
        _items.add(Element(name))
    }
}

fun demonstrateBackingProperties() {
    println("--- Naming Conventions: Backing Properties ---")
    val inventory = Inventory()
    inventory.addItem("Item 1")
    inventory.addItem("Item 2")
    
    println("Items in inventory: ${inventory.items.map { it.name }}")
    // inventory.items.add(...) // ERROR: items is a read-only List
}
