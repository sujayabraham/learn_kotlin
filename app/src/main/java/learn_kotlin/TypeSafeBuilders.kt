package learn_kotlin

// Renamed all domain artifacts to prevent conflict errors with existing types
abstract class HtmlElement {
    abstract fun render(builder: StringBuilder, indent: String)
    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}

class HtmlTextElement(val text: String) : HtmlElement() {
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent$text\n")
    }
}

@DslMarker
annotation class CustomHtmlDsl

@CustomHtmlDsl
abstract class HtmlTag(val tagName: String) : HtmlElement() {
    val tagChildren = arrayListOf<HtmlElement>()
    val tagAttributes = hashMapOf<String, String>()

    protected fun <T : HtmlElement> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        tagChildren.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent<$tagName")
        for ((attr, value) in tagAttributes) {
            builder.append(" $attr=\"$value\"")
        }
        builder.append(">\n")
        for (child in tagChildren) {
            child.render(builder, "$indent  ")
        }
        builder.append("$indent</$tagName>\n")
    }
}

class HtmlHeadTag : HtmlTag("head") {
    fun title(text: String) = initTag(HtmlTitleTag()) { +text }
}

class HtmlTitleTag : HtmlTag("title") {
    operator fun String.unaryPlus() {
        tagChildren.add(HtmlTextElement(this))
    }
}

class HtmlBodyTag : HtmlTag("body") {
    fun h1(text: String) = initTag(HtmlH1Tag()) { +text }
    fun p(text: String) = initTag(HtmlPTag()) { +text }
    fun a(href: String, text: String) = initTag(HtmlATag()) {
        this.href = href
        +text
    }
}

class HtmlH1Tag : HtmlTag("h1") {
    operator fun String.unaryPlus() {
        tagChildren.add(HtmlTextElement(this))
    }
}

class HtmlPTag : HtmlTag("p") {
    operator fun String.unaryPlus() {
        tagChildren.add(HtmlTextElement(this))
    }
}

class HtmlATag : HtmlTag("a") {
    var href: String
        get() = tagAttributes["href"] ?: ""
        set(value) { tagAttributes["href"] = value }

    operator fun String.unaryPlus() {
        tagChildren.add(HtmlTextElement(this))
    }
}

class HtmlPage : HtmlTag("html") {
    fun head(init: HtmlHeadTag.() -> Unit) = initTag(HtmlHeadTag(), init)
    fun body(init: HtmlBodyTag.() -> Unit) = initTag(HtmlBodyTag(), init)
}

fun renderHtml(init: HtmlPage.() -> Unit): HtmlPage {
    val page = HtmlPage()
    page.init()
    return page
}

fun demonstrateTypeSafeBuilders() {
    println("--- Type-Safe Builders (DSL) ---")
    
    val page = renderHtml {
        head {
            title("Kotlin Type-Safe Builders")
        }
        body {
            h1("Welcome to the Advanced DSL Guide")
            p("Type-safe builders leverage function literals with receivers and operator overloading.")
            a(href = "https://kotlinlang.org", text = "Learn more on official Kotlin site")
        }
    }
    
    println("Rendered Output:\n$page")
}
