// Exercise 5: Login Attempt 🔑
// Declare two immutable String variables: savedUsername and savedPassword. Initialize them with some values.
// Declare two mutable String variables: enteredUsername and enteredPassword.
// Simulate a user entering a username and password by assigning values to enteredUsername and enteredPassword.
// Write an if statement with nested if statements (or use logical operators &&) to check:
// If enteredUsername matches savedUsername.
// If they match, then check if enteredPassword matches savedPassword.
// Print:
// "Login Successful" if both match.
// "Incorrect Password" if the username matches but the password doesn't.
// "Incorrect Username" if the username doesn't match.


fun runExercises() {
  val savedUsername: String = "jose"
  val savedPassword: String = "123456"
  var enteredUsername: String = "jose"
  var enteredPassword: String = "123456"

  runExercise5(enteredUsername, enteredPassword, savedUsername, savedPassword)

  enteredUsername = "jose1"
  enteredPassword = "123456"

  runExercise5(enteredUsername, enteredPassword, savedUsername, savedPassword)
  
}

fun runExercise5(enteredUsername: String, enteredPassword: String, savedUsername: String, savedPassword: String) {
  // Exercise 5: Login Attempt 🔑
  // Declare two immutable String variables: savedUsername and savedPassword. Initialize them with some values.
  // Declare two mutable String variables: enteredUsername and enteredPassword.
  // Simulate a user entering a username and password by assigning values to enteredUsername and enteredPassword.
  // Write an if statement with nested if statements (or use logical operators &&) to check:
  // If enteredUsername matches savedUsername.
  // If they match, then check if enteredPassword matches savedPassword.
  // Print:
  // "Login Successful" if both match.
  // "Incorrect Password" if the username matches but the password doesn't.
  // "Incorrect Username" if the username doesn't match.
  
  if (enteredUsername == savedUsername) {
      if (enteredPassword == savedPassword) {
          println("Login Successful")
      } else {
          println("Incorrect Password")
      }
  } else {
      println("Incorrect Username")
  }
}