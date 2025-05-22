fun main() {
  studyConditionsAndBooleans()
}

// Step 3
fun studyConditionsAndBooleans() {
  // may 22, 2025
  
val joseAge = 26
  val angelAge = 22
  
  if (joseAge > angelAge) {
      println("Jose is older Angel")
  } else {
      println("Angel is older than Jose")
  }
  
  // People with 25 years old or more (just an example)
  val people1Age = 26
  val people1Name = "Jose"
  val people2Age = 16
  val people2Name = "Perla"
  
  if (people1Age in 25..150) {
      println("People1 \"$people1Name\" is in the Range.")
  }
  
  when (people2Age) {
      0 -> println("People2 hasn't born yet")
      in 25..150 -> println("People2 \"$people2Name\" is in the Range.")
      else -> println("People2 \"$people2Name\" is out of the range.")
  }
}
