package learn_kotlin

// 1. Extending the String class
fun String.bold(): String = "<b>$this</b>"

// 2. Extension-Oriented Design Example
class HttpClient {
    fun request(method: String, url: String, headers: Map<String, String>) {
        println("Requesting $method to $url with headers $headers")
    }
}

fun HttpClient.get(url: String) = request("GET", url, emptyMap())
fun HttpClient.post(url: String) = request("POST", url, emptyMap())

// 3. Exercises
fun Int.isPositive(): Boolean = this > 0

fun String.toLowercaseString(): String = this.lowercase()

// Demonstration function for Java interop
fun demonstrateExtensions() {
    println("--- Extension Functions ---")
    
    // Using String.bold
    val greeting = "Hello World"
    println("Original: $greeting")
    println("Bolded: ${greeting.bold()}")
    
    // Using HttpClient extensions
    val client = HttpClient()
    println("Using client.get():")
    client.get("https://kotlinlang.org")
    
    // Using Int.isPositive
    val number = 42
    println("Is $number positive? ${number.isPositive()}")
    println("Is -5 positive? ${(-5).isPositive()}")
    
    // Using String.toLowercaseString
    val loud = "I AM LOUD"
    println("Lowercase version: ${loud.toLowercaseString()}")
}
