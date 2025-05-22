fun main() {
  getStarted()
}

fun getStarted() {
  // may 22, 2025
  
val numberOfFish = 5
val numberOfPlants = 12
val result: String = "I have $numberOfFish fish" + " and $numberOfPlants plants"
  val bothResults: String = "I have ${numberOfFish + numberOfPlants} fish and plants"
  
  println("result => $result");
  println("bothResults => $bothResults");
}