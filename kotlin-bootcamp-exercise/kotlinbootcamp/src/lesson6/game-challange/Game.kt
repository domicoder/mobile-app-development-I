
class Game {
    var path = mutableListOf(Directions.START)
    var map = Location()

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
            Directions.NORTH.toString() -> {
                move(north)
                map.updateLocation(Directions.NORTH)
            }
            Directions.SOUTH.toString() -> {
                move(south)
                map.updateLocation(Directions.SOUTH)
            }
            Directions.WEST.toString() -> {
                move(west)
                map.updateLocation(Directions.WEST)
            }
            Directions.EAST.toString() -> {
                move(east)
                map.updateLocation(Directions.EAST)
            }
            else -> {
                move(end)
            }
        }
    }
}