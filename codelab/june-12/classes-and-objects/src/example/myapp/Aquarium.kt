package example.myapp

open class Aquarium(open var length: Int = 32, open var width: Int = 54, open var height: Int = 130) {
    init  {
        println("aquarium initializing")
    }

//    init {
//        val volume = width * height * length / 1000
//        println("Volume: $volume l")
//    }
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9


    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")

        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}