package learn_kotlin

import kotlin.reflect.KClass

// 1. Basic Annotation Declaration
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy

@Target(AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
annotation class ExpressionAnn

// 2. Annotation with Parameters
annotation class Special(val why: String)

annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

// 3. Usage on various elements
@Fancy class AnnotatedClass {
    @Fancy fun annotatedFunction(@Fancy param: Int): Int {
        return (@ExpressionAnn 1)
    }
}

// 4. Annotation Use-Site Targets
annotation class FieldAnn
annotation class GetAnn
annotation class ParamAnn

class UseSiteExample(
    @field:FieldAnn val fieldOnly: String,
    @get:GetAnn val getterOnly: String,
    @param:ParamAnn val constructorParamOnly: String
)

// 5. Repeatable Annotations
@Repeatable
annotation class Tag(val name: String)

@Tag("v1")
@Tag("v2")
class RepeatableExample

// 6. Standard Annotations Example
annotation class Replacement(val expression: String)

annotation class Legacy(
    val message: String,
    val replaceWith: Replacement = Replacement("")
)

@Legacy("Use modern method instead", Replacement("modernMethod()"))
fun oldMethod() {
    println("Old method called")
}

fun demonstrateAnnotations() {
    println("--- Annotation Declaration and Usage ---")
    val annotated = AnnotatedClass()
    println("Class is annotated with @Fancy: ${AnnotatedClass::class.annotations.any { it is Fancy }}")
    
    println("\n--- Use-Site Targets ---")
    val useSite = UseSiteExample("field", "getter", "param")
    // Reflection would show these on different JVM elements
    println("Use-site targets are configured in the bytecode.")
    
    println("\n--- Repeatable Annotations ---")
    val tags = RepeatableExample::class.annotations.filterIsInstance<Tag>()
    println("Tags on RepeatableExample: ${tags.map { it.name }}")
    
    println("\n--- Standard-style Annotations ---")
    oldMethod()
}
