package example.myapp

class Aquarium(var length: Int = 32, var width: Int = 54, var height: Int = 130) {
    init  {
        println("aquarium initializing")
    }

//    init {
//        val volume = width * height * length / 1000
//        println("Volume: $volume l")
//    }
    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }


    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")

        println("Volume: $volume l")
    }
}