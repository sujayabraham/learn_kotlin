package learn_kotlin

// Example 1: Canvas DSL
class Canvas {
    fun drawCircle() = println("🟠 Drawing a circle")
    fun drawSquare() = println("🟥 Drawing a square")
}

fun render(block: Canvas.() -> Unit): Canvas {
    val canvas = Canvas()
    canvas.block()
    return canvas
}

// Example 2: Menu DSL
class MenuItem(val name: String)
class Menu(val name: String) {
    val items = mutableListOf<MenuItem>()
    fun item(name: String) {
        items.add(MenuItem(name))
    }
}

fun menu(name: String, init: Menu.() -> Unit): Menu {
    val menu = Menu(name)
    menu.init()
    return menu
}

// Exercise 1: StringBuilder lambda
fun fetchData(callback: StringBuilder.() -> Unit) {
    val builder = StringBuilder("Data received")
    builder.callback()
    println(builder.toString())
}

// Exercise 2: Button Events
class Button {
    fun onEvent(action: ButtonEvent.() -> Unit) {
        val event = ButtonEvent(isRightClick = false, amount = 2, position = Position(100, 200))
        event.action()
    }
}
data class ButtonEvent(val isRightClick: Boolean, val amount: Int, val position: Position)
data class Position(val x: Int, val y: Int)

// Exercise 3: buildList extension
fun List<Int>.incremented(): List<Int> {
    val originalList = this
    return buildList {
        for (n in originalList) {
            add(n + 1)
        }
    }
}

fun demonstrateLambdasWithReceivers() {
    println("--- Lambdas with Receivers ---")
    
    // Example 1: render
    render {
        drawCircle()
        drawSquare()
    }
    
    // Example 2: menu
    val mainMenu = menu("Lunch Menu") {
        item("Pizza")
        item("Burger")
        item("Salad")
    }
    println("Menu: ${mainMenu.name}, Items: ${mainMenu.items.map { it.name }}")
    
    // Exercise 1: fetchData
    fetchData {
        append(" - Processed Successfully")
    }
    
    // Exercise 2: Button
    val button = Button()
    button.onEvent {
        if (!isRightClick && amount == 2) {
            println("Detected: Double click at ($position)")
        }
    }
    
    // Exercise 3: Incremented
    val nums = listOf(10, 20, 30)
    println("Original: $nums, Incremented: ${nums.incremented()}")
}
