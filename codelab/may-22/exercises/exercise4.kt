// Exercise 4: Even or Odd? 🤔
// Declare an immutable variable and initialize it with an integer.
// Write an if-else statement to determine if the number is even or odd.
// Print whether the number is "Even" or "Odd".
// Hint: You might need the modulo operator (%).


fun runExercises() {
  runExercise4()
}

fun runExercise4() {
  // Exercise 4: Even or Odd? 🤔
  // Declare an immutable variable and initialize it with an integer.
  // Write an if-else statement to determine if the number is even or odd.
  // Print whether the number is "Even" or "Odd".
  // Hint: You might need the modulo operator (%).
  val number: Int = 10
  if (number % 2 == 0) {
      println("number => Even")
  } else {
      println("number => Odd")
  }
}