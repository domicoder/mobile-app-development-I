fun main(args: Array<String>) {
    println(canAddFish(15.0, listOf(4, 4, 4)))
    println(canAddFish(12.0, listOf(3, 3, 3), hasDecorations = false))
    println(canAddFish(20.0, listOf(5, 5, 5), 6))
    println(canAddFish(25.0, listOf(), 8, true))
}

fun canAddFish(tankSize: Double, currentFish: List<Int>,
             fishSize: Int = 3, hasDecorations: Boolean = true): Boolean {
    val tankCapacity = tankSize * if (hasDecorations) 0.8 else 1.0
    val totalFishSize = currentFish.sum() + fishSize
    return tankCapacity >= totalFishSize
}

fun canAddFish(tankSize: Double, currentFish: List<Int>,
             fishSize: Int = 3, hasDecorations: Boolean = true): Boolean {
    val totalFishSizeInInches = currentFish.sum().toDouble()
    val maxCapacityOfTank = tankSize * (if (hasDecorations) 0.8 else 1.0)
    return (totalFishSizeInInches + fishSize) <= maxCapacityOfTank
}