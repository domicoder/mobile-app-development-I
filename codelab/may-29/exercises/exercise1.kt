// Exercise 1: Optional User Details 👤
// Declare three nullable String variables: userName, userEmail, and userBio.
// Assign some values to these variables, ensuring at least one of them is null for testing purposes.
// Print the user's details using safe call and Elvis operators.

// Declaring nullable String variables
val userName: String? = "John Doe"
val userEmail: String? = null
val userBio: String? = ""

// Printing user details with null checks
println("Name: ${userName ?: "[Not provided]"}")

println("Email: ${userEmail ?: "[Not available]"}")

// Using safe call operator (?.) and Elvis operator (?:) for bio
println("Bio: ${userBio?.takeIf { it.isNotEmpty() } ?: \"[User has no bio or it's empty]\"}")
