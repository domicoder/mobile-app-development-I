fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "sunny", 28))
    println(whatShouldIDoToday("sad", "rainy", 15))
    println(whatShouldIDoToday("energetic", "cloudy", 22))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" && temperature > 25 -> "go to the beach"
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" -> "watch a movie"
        mood == "sad" -> "listen to music"
        mood == "energetic" && weather == "cloudy" -> "go for a run"
        mood == "energetic" -> "do some exercise"
        temperature < 20 -> "stay home and read"
        else -> "relax and enjoy your day"
    }
}