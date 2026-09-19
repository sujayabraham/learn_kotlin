package learn_kotlin

import kotlin.math.*
import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.measureTime
import kotlinx.datetime.*

// 1. Standard Library Functions (Implicit)
fun demonstrateStandardLibrary() {
    println("--- Standard Library ---")
    val text = "emosewa si niltoK"
    println("Reversed: ${text.reversed()}")
}

// 2. Time Measurement & Companion Imports
fun demonstrateTime() {
    println("\n--- Time Measurement ---")
    val thirtyMinutes: Duration = 30.minutes
    val halfHour: Duration = 0.5.hours
    println("30 minutes == 0.5 hours? ${thirtyMinutes == halfHour}")
    
    val timeTaken = measureTime {
        val data = List(1000) { it * 2 }
        data.filter { it % 3 == 0 }.map { it / 2 }
    }
    println("Time taken for processing: $timeTaken")
}

// 3. External Library (kotlinx-datetime)
fun demonstrateDateTime() {
    println("\n--- kotlinx-datetime ---")
    val now = Clock.System.now()
    println("Current instant: $now")
    
    val zone = TimeZone.currentSystemDefault()
    val localDateTime = now.toLocalDateTime(zone)
    println("Local date-time: $localDateTime")
}

// 4. Opt-in APIs
@OptIn(ExperimentalUnsignedTypes::class)
fun demonstrateOptIn() {
    println("\n--- Opt-in APIs (Unsigned) ---")
    val unsignedArray: UIntArray = uintArrayOf(1u, 2u, 3u)
    unsignedArray[1] = 42u
    println("Unsigned array: ${unsignedArray.joinToString()}")
}

// Exercise: Compound Interest
fun calculateCompoundInterest(P: Double, r: Double, n: Int, t: Int): Double {
    return P * (1 + r / n).toDouble().pow(n * t)
}

fun demonstrateLibrariesAndAPIs() {
    demonstrateStandardLibrary()
    demonstrateTime()
    demonstrateDateTime()
    demonstrateOptIn()
    
    println("\n--- Exercises ---")
    val interest = calculateCompoundInterest(1000.0, 0.05, 4, 5)
    println("Accumulated amount (1000, 5%, 4 times/yr, 5 yrs): $interest")
}
