
class Game {
    var path = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over")
        println("Path :- $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            Directions.NORTH.toString() -> move(north)
            Directions.SOUTH.toString() -> move(south)
            Directions.WEST.toString() -> move(west)
            Directions.EAST.toString() -> move(east)
            else -> move(end)
        }
    }
}
