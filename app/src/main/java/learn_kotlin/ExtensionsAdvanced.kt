package learn_kotlin

// 1. Extension Functions
// Extension functions allow adding new methods to existing classes without modifying their source code.
// Syntax: fun ReceiverType.functionName(...)
fun String.removeWhitespace(): String {
    return this.replace("\\s".toRegex(), "")
}

// 2. Extension Properties
// Extensions can also be applied to properties. Since they don't insert members into the real receiver class,
// they cannot have backing fields and must use explicit getters.
val String.isAlphanumericOnly: Boolean
    get() = this.matches("^[a-zA-Z0-9]+$".toRegex())

// 3. Companion Object Extensions
// You can define extensions on a class's companion object if it has one declared.
class MediaConverter {
    companion object {
        val supportedFormats = listOf("MP4", "MKV", "AVI")
    }
}

// Defining an extension on the companion object target
fun MediaConverter.Companion.printMetadataRules() {
    println("MediaConverter factory companion rules. Supported list: $supportedFormats")
}

// 4. Declaring Extensions as Class Members
// An extension function can be declared inside another class, creating a dual-receiver scope:
// - Dispatch Receiver: The class containing the declaration.
// - Extension Receiver: The type being extended.
class ReportExporter(val reportTitle: String) {
    
    fun String.renderAsBulletPoint() {
        // 'this' refers to the extended String (Extension Receiver)
        // 'this@ReportExporter' refers to the container class instance (Dispatch Receiver)
        println("  * $this (Export Context: ${this@ReportExporter.reportTitle})")
    }

    fun exportSuite(items: List<String>) {
        println("Initiating report export for: $reportTitle")
        for (item in items) {
            item.renderAsBulletPoint() // Resolved inside this class container scope
        }
    }
}

fun demonstrateExtensionsAdvanced() {
    println("--- Advanced Extension Mechanics ---")

    // Test 1: Extension function evaluation
    val messyString = "  K o t l i n   E x t e n s i o n s  "
    val cleaned = messyString.removeWhitespace()
    println("Original: '$messyString'")
    println("Cleaned via Extension: '$cleaned'")

    // Test 2: Extension property validation
    val alphaTest1 = "Kotlin42"
    val alphaTest2 = "Hello World!"
    println("\nExtension Property Checks:")
    println("  '$alphaTest1' is alphanumeric: ${alphaTest1.isAlphanumericOnly}")
    println("  '$alphaTest2' is alphanumeric: ${alphaTest2.isAlphanumericOnly}")

    // Test 3: Companion object extensions hook
    println("\nCompanion Object Extension:")
    MediaConverter.printMetadataRules()

    // Test 4: Member extension dispatch scopes
    println("\nEvaluating class member extensions with dual receivers:")
    val exporter = ReportExporter("Quarterly Financial Performance")
    exporter.exportSuite(listOf("Revenue up 15%", "Operating costs reduced by 5%", "R&D investments expanded"))
}
