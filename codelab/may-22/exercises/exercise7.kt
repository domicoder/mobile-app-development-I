// Exercise 7: Nullable Name Greeting 👋
// Declare a nullable String variable named userName.
// Assign a name to it (e.g., "Alice").
// Write an if statement to check if userName is not null.
// If it's not null, print "Hello, [userName]!".
// If it is null, print "Hello, Guest!".
// Now, set userName to null and observe the different output.


fun runExercises() {
  runExercise7()
}

fun runExercise7() {
  // Exercise 7: Nullable Name Greeting 👋
  // Declare a nullable String variable named userName.
  // Assign a name to it (e.g., "Alice").
  // Write an if statement to check if userName is not null.
  // If it's not null, print "Hello, [userName]!".
  // If it is null, print "Hello, Guest!".
  // Now, set userName to null and observe the different output.
  var userName: String? = "Jose"
  if (userName != null) {
      println("Hello, $userName!")
  } else {
      println("Hello, Guest!")
  }
  userName = null
  if (userName != null) {
      println("Hello, $userName!")
  } else {
      println("Hello, Guest!")
  }
}