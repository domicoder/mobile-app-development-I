
class Spice(val spiceName: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when(spiciness){
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("Spice Name :- $spiceName")
        println("Spiciness :- $heat")
    }

}