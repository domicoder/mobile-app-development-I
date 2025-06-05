fun main(args: Array<String>) {
    val time = args[0].toInt()
    val greeting = when {
        time < 6 -> "Good Night"
        time < 12 -> "Good Morning"
        time < 18 -> "Good Afternoon"
        else -> "Good Evening"
    }

    println("$greeting Kotlin")
    println(if (time < 12) "Good Morning Kotlin" else "Good Night Kotlin")
    println("${if (time < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
}