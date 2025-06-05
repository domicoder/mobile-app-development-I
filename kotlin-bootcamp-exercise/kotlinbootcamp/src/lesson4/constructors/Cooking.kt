
fun main(args: Array<String>) {

    val newSpice = Spice("cayenne", spiciness = "spicy")

    val spiceList = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy"),
            makeSalt())

    val filteredSpiceList = spiceList.filter { it.heat < 5 }

    println("filteredSpiceList :- $filteredSpiceList")

}

fun makeSalt() = Spice("Salt")