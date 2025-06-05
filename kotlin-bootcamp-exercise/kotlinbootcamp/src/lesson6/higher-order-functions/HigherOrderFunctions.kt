
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val divisibleList = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            divisibleList.add(item)
        }
    }
    return divisibleList
}

fun main(args: Array<String>) {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    println(numbers.divisibleBy { it.rem(3) })
}