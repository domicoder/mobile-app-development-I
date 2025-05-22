// Exercise 6: Temperature Guide 🌡️
// Declare an immutable variable to store the current temperature in Celsius (as a Double or Int).
// Write a when statement that provides advice based on the temperature range:
// Less than 0: "Freezing! Wear very warm clothes."
// 0 to 10: "Cold. Wear a warm jacket."
// 11 to 20: "Cool. A light jacket should be fine."
// 21 to 30: "Warm. Enjoy the weather!"
// Above 30: "Hot! Stay hydrated."
// Use an else branch in the when for any temperatures outside these specific descriptions, perhaps printing "Temperature out of typical range."

fun runExercises() {
  runExercise6()
}

fun runExercise6() {
  // Exercise 6: Temperature Guide 🌡️
  // Declare an immutable variable to store the current temperature in Celsius (as a Double or Int).
  // Write a when statement that provides advice based on the temperature range:
  // Less than 0: "Freezing! Wear very warm clothes."
  // 0 to 10: "Cold. Wear a warm jacket."
  // 11 to 20: "Cool. A light jacket should be fine."
  // 21 to 30: "Warm. Enjoy the weather!"
  // Above 30: "Hot! Stay hydrated."
  // Use an else branch in the when for any temperatures outside these specific descriptions, perhaps printing "Temperature out of typical range."
  val temperature: Int = 25

  when (temperature) {
    in Int.MIN_VALUE..-1 -> println("Freezing! Wear very warm clothes.")
      in 0..10 -> println("Cold. Wear a warm jacket.")
      in 11..20 -> println("Cool. A light jacket should be fine.")
      in 21..30 -> println("Warm. Enjoy the weather!")
      else -> println("Hot! Stay hydrated.")
  }
}