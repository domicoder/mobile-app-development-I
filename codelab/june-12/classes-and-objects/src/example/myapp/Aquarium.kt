package example.myapp

class Aquarium {
    var width: Int = 32
    var height: Int = 54
    var length: Int = 130

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        val volume = width * height * length / 1000
        println("Volume: $volume l")
    }
}