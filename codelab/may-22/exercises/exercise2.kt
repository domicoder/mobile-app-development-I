// Exercise 2: Grade Evaluator 🎓
// Declare an immutable variable to store a student's numerical grade (e.g., out of 100).
// Write a series of if-else if-else statements to print the letter grade based on the following scale:
// 90-100: "A"
// 80-89: "B"
// 70-79: "C"
// 60-69: "D"
// Below 60: "F"

fun runExercises() {
  runExercise2()
}

fun runExercise2() {
  // Exercise 2: Grade Evaluator 🎓
  // Declare an immutable variable to store a student's numerical grade (e.g., out of 100).
  // Write a series of if-else if-else statements to print the letter grade based on the following scale:
  // 90-100: "A"
  // 80-89: "B"
  // 70-79: "C"
  // 60-69: "D"
  // Below 60: "F"
  val studentNumericalGrade: Int = 95
  if (studentNumericalGrade >= 90) {
      println("studentNumericalGrade => A")
  } else if (studentNumericalGrade >= 80) {
      println("studentNumericalGrade => B")
  } else if (studentNumericalGrade >= 70) {
      println("studentNumericalGrade => C")
  } else if (studentNumericalGrade >= 60) {
      println("studentNumericalGrade => D")
  } else {
      println("studentNumericalGrade => F")
  }
}