package learn_kotlin

class UserAccountProfile {
    // Using the 'field' backing keyword to intercept updates and format inputs safely
    var username: String = "Anonymous"
        set(value) {
            field = value.trim().lowercase() // Formats text seamlessly inside the backing field
        }

    // Publicly readable property, but strictly private to mutate externally
    var loyaltyPoints: Int = 0
        private set

    // Computed Property: Entirely stateless, no backing field memory consumption
    val isEliteTier: Boolean
        get() = this.loyaltyPoints >= 1000

    fun awardBonusPoints(points: Int) {
        if (points > 0) this.loyaltyPoints += points
    }
}

fun runLesson56Example() {
    val profile = UserAccountProfile()
    profile.username = "  SUJAY_DEVELOPER_99  "
    profile.awardBonusPoints(1200)

    println("Cleaned Username: '${profile.username}'")
    println("Loyalty Balance: ${profile.loyaltyPoints} (Is Elite: ${profile.isEliteTier})")
    // profile.loyaltyPoints = 5000 // ERROR: Setter is private!
}