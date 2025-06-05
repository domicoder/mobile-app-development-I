fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("success")) break
    }
}

fun getBirthday(): Int {
    println("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "A new adventure awaits you!",
        "Your creativity will shine today.",
        "Success is just around the corner.",
        "Trust your instincts and move forward.",
        "A pleasant surprise is coming your way.",
        "Your kindness will be rewarded.",
        "New opportunities will present themselves.",
        "Your hard work will pay off soon.",
        "Embrace change and good things will follow.",
        "Your positive energy will attract success."
    )

    return when (birthday) {
        15, 30 -> fortunes[2]
        in 1..10 -> fortunes[5]
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}