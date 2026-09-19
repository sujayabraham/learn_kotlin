package learn_kotlin

// 1. A Custom Builder Container class that aggregates items
class MyCollectionBuilder<E> {
    private val list = mutableListOf<E>()

    fun add(element: E) {
        list.add(element)
    }

    fun build(): List<E> = list
}

// 2. The Builder Function demonstrating Builder Inference
// Note: In modern Kotlin, builder inference is automatically active for builder parameters 
// when regular type inference needs more context from lambda scopes.
fun <E> buildMyCollection(
    builderAction: MyCollectionBuilder<E>.() -> Unit
): List<E> {
    val builder = MyCollectionBuilder<E>()
    builder.builderAction()
    return builder.build()
}

fun demonstrateBuilderInference() {
    println("--- Builder Inference ---")

    // The type parameter for buildMyCollection is NOT explicitly declared as <String>.
    // Instead, the compiler looks at the method calls inside the lambda body (e.g., add("..."))
    // and infers that E must be String.
    val stringList = buildMyCollection {
        add("Kotlin")
        add("Builder")
        add("Inference")
    }

    println("Inferred String List: $stringList")

    // Another example where E is inferred as Int
    val intList = buildMyCollection {
        add(10)
        add(20)
        add(30)
    }

    println("Inferred Int List: $intList")
}
