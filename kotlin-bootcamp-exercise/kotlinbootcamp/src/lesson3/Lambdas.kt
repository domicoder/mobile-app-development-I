import java.util.*

fun main(args: Array<String>) {
    val rollDice = { Random().nextInt(20) + 1 }

    val rollDiceExtend = { sides: Int ->
        Random().nextInt(sides) + 1
    }

    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(rollDice2(12))
    gamePlay(rollDiceExtend(6))
    gamePlay(rollDice0(8))
}

fun gamePlay(rollDice: Int) {
    println("You rolled a $rollDice")
}