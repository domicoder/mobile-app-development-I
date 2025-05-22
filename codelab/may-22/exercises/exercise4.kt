// Exercise 4: Even or Odd? 🤔
// Declare an immutable variable and initialize it with an integer.
// Write an if-else statement to determine if the number is even or odd.
// Print whether the number is "Even" or "Odd".
// Hint: You might need the modulo operator (%).


fun runExercises() {
  var number: Int = 10

  runExercise4(number)

  number = 11

  runExercise4(number)
}

fun runExercise4(number: Int) {
  // Exercise 4: Even or Odd? 🤔
  // Declare an immutable variable and initialize it with an integer.
  // Write an if-else statement to determine if the number is even or odd.
  // Print whether the number is "Even" or "Odd".
  // Hint: You might need the modulo operator (%).
  if (number % 2 == 0) {
      println("number => Even")
  } else {
      println("number => Odd")
  }
}