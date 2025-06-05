
enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END;
}

fun main(args: Array<String>) {

    val game = Game()

    println("Path in main() :- ${game.path}")

    game.north()
    game.east()
    game.south()
    game.west()
    game.end()

    println("Path again in main() :- ${game.path}")
}