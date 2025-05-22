// Exercises May 22, 2025
fun runExercises() {
  runExercise1(26)
  runExercise1(16)
}

fun runExercise1(age: Int) {
  // Exercise 1: Simple Age Checker 👶👴
  // Declare a mutable variable to store a person's age.
  // Assign an initial age to the variable.
  // Write an if-else statement that prints:
  // "Minor" if the age is less than 18.
  // "Adult" if the age is 18 or greater.
  // Reassign a different age to your variable and observe the output.
  if (age < 18) {
      println("age => Minor")
  } else {
      println("age => Adult")
  }
  
}
