// Exercises May 22, 2025
fun runExercises() {
  runExercise1()
}

fun runExercise1() {
  // Exercise 1: Simple Age Checker 👶👴
  // Declare a mutable variable to store a person's age.
  // Assign an initial age to the variable.
  // Write an if-else statement that prints:
  // "Minor" if the age is less than 18.
  // "Adult" if the age is 18 or greater.
  // Reassign a different age to your variable and observe the output.
  var age1: Int = 26
  if (age1 < 18) {
      println("age1 => Minor")
  } else {
      println("age1 => Adult")
  }
  
  var age2: Int = 16
  if (age2 < 18) {
      println("age2 => Minor")
  } else {
      println("age2 => Adult")
  }

}
