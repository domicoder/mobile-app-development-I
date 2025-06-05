import java.util.*

fun main(args: Array<String>) {
    println("Your fortune is: ${getFortuneCookie()}")

    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("peace")) break
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "A beautiful journey awaits you!",
        "Your creativity will lead to success.",
        "Good fortune will smile upon you today.",
        "Trust your intuition and follow your heart.",
        "A pleasant surprise is coming your way.",
        "Find peace in the simple moments.",
        "Your kindness will be rewarded soon.",
        "New opportunities are on the horizon.",
        "Your hard work will pay off today.",
        "Embrace change and good things will follow."
    )

    println("Enter your birthday")
    val birthday = Scanner(System.`in`).nextLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}