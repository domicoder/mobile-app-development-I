package lesson2

fun main(args: Array<String>) {
    println(5.plus(85).plus(150).minus(20).div(25))
    println(5.plus(85).plus(150).minus(20)
            .div(25).plus(1))

    var favoriteColor = "green"
    favoriteColor = "purple"

    var yellowColor = null
    var redColor: Int? = null

    var nullListWay1 = listOf(null, null)
    var nullListWay2: List<String?> = listOf(null, null)
    var nullList: List<String>? = null

    val nullValue: Int? = null
    println(nullValue?.inc() ?: 1)

    val salmon = "salmon"
    var cod = "cod"
    var tilapia = "tilapia"
    println("I enjoy eating $salmon and $tilapia, but I prefer $cod.")

    val animalName = "Dolphin"
    when(animalName.length){
        0 -> println("Animal name cannot be empty")
        in 3..12 -> println("Good animal name")
        else -> println("OK animal name")
    }

    var numbers : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 5) numbers.add(i)
    print(numbers)
}
