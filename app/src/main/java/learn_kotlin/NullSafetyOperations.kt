package learn_kotlin

fun runNullSafetyPipeline(serverPayload: String?) {
    println("\n--- Initializing Null Safety Verification Sequence ---")

    // 1. Safe Call Operator (?.) - Returns null safely if payload is missing
    val inputLength: Int? = serverPayload?.length
    println("Safe Call string length checked: $inputLength")

    // 2. Elvis Operator (?:) - Injects safe defaults fallback seamlessly
    val activeContent: String = serverPayload ?: "FALLBACK_EMPTY_LOG_PAYLOAD"
    println("Elvis Operator content resolved: $activeContent")

    // 3. Safe Cast Operator (as?) - Mismatched types safely evaluate to null instead of crashing
    val unknownObj: Any = 1004
    val stringText: String? = unknownObj as? String
    println("Safe Cast runtime conversion result: $stringText")

    // 4. let Scoping Function - Executes block ONLY when variable contains a valid non-null instance
    serverPayload?.let { nonNullValue ->
        // Guaranteed crash-proof space
        println("Let block successfully processed non-null data: ${nonNullValue.uppercase()}")
    }
}

fun runLesson58Example() {
    runNullSafetyPipeline("Valid System Core Payload Data Available")
    runNullSafetyPipeline(null) // Skips let blocks and evaluates fallbacks perfectly without a single crash!
}

