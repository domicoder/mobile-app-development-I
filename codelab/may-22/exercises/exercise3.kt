// Exercise 3: Traffic Light Simulator 🚦
// Declare a mutable variable to store the current color of a traffic light (as a String, e.g., "Red", "Yellow", "Green").
// Write a when statement (Kotlin's version of a switch statement) that prints the action a driver should take based on the light's color:
// "Red": "Stop"
// "Yellow": "Caution"
// "Green": "Go"
// Any other color: "Invalid light color"
// Change the light color and see the different actions.


fun runExercises() {
  runExercise3()
}

fun runExercise3() {
  // Exercise 3: Traffic Light Simulator 🚦
  // Declare a mutable variable to store the current color of a traffic light (as a String, e.g., "Red", "Yellow", "Green").
  // Write a when statement (Kotlin's version of a switch statement) that prints the action a driver should take based on the light's color:
  // "Red": "Stop"
  // "Yellow": "Caution"
  // "Green": "Go"
  // Any other color: "Invalid light color"
  // Change the light color and see the different actions.
  var trafficLightColor: String = "Red"
  when (trafficLightColor) {
      "Red" -> println("Stop")
      "Yellow" -> println("Caution")
      "Green" -> println("Go")
      else -> println("Invalid light color")
  }
}