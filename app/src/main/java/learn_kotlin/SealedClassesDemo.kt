package learn_kotlin

// 1. Defining a Sealed Class Hierarchy representing Network Operations
// Sealed classes provide restricted class hierarchies, giving compile-time control over subclasses.
// All direct subclasses of a sealed class are known at compile time and must be in the same package.
sealed class NetworkResponse {
    
    // Subclass 1: Data Class representing a successful data payload capture
    data class Success(val dataPayload: String, val timestamp: Long) : NetworkResponse()

    // Subclass 2: Standard Class representing a failure event with diagnostic details
    class Error(val errorCode: Int, val description: String) : NetworkResponse()

    // Subclass 3: Singleton Object representing a persistent background loading state
    object Loading : NetworkResponse()
}

// 2. Pattern Matching validation with 'when' expressions
fun evaluateNetworkState(response: NetworkResponse): String {
    // When used as an expression with a sealed class, 'when' is required to be exhaustive.
    // The compiler enforces that every possible subclass branch is handled, removing the need for an 'else' branch.
    return when (response) {
        is NetworkResponse.Success -> {
            "Data loaded successfully at ${response.timestamp}: ${response.dataPayload}"
        }
        is NetworkResponse.Error -> {
            "Network error [Code ${response.errorCode}]: ${response.description}"
        }
        NetworkResponse.Loading -> {
            "Network channel is busy. Please wait..."
        }
    }
}

fun demonstrateSealedClasses() {
    println("--- Sealed Classes Mechanics ---")

    // Test instances
    val stateLoading = NetworkResponse.Loading
    val stateSuccess = NetworkResponse.Success("Account Profile Payload JSON", 1718000000L)
    val stateError = NetworkResponse.Error(404, "Requested resource not found on server.")

    // Print evaluation responses
    println(evaluateNetworkState(stateLoading))
    println(evaluateNetworkState(stateSuccess))
    println(evaluateNetworkState(stateError))
}
