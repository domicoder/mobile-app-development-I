

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END;
}

fun main(args: Array<String>) {

    val game = Game()

    while (true) {
        print("Enter a direction: NORTH/SOUTH/EAST/WEST :")
        game.makeMove(readLine())
    }
}

