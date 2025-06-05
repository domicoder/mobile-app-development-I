fun main(args: Array<String>) {
    println(whatShouldIDoSingleExpression("happy", "sunny", 28))
    println(whatShouldIDoSingleExpression("sad", "rainy", 15))
    println(whatShouldIDoSingleExpression("energetic", "cloudy", 22))

    println("How do you feel?")
    println(whatShouldIDoSingleExpression(readLine()!!))
}

fun whatShouldIDoSingleExpression(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isVeryHot(temperature) -> "go to the beach"
        isSadRainyCold(mood, weather, temperature) -> "watch a movie"
        isHappySunny(mood, weather) -> "go for a walk"
        isEnergeticCloudy(mood, weather) -> "go for a run"
        isCold(temperature) -> "stay home and read"
        else -> "relax and enjoy your day"
    }
}

fun isVeryHot(temperature: Int) = temperature > 30

fun isCold(temperature: Int) = temperature < 20

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature < 15

fun isHappySunny(mood: String, weather: String) = 
    mood == "happy" && weather == "sunny"

fun isEnergeticCloudy(mood: String, weather: String) = 
    mood == "energetic" && weather == "cloudy"