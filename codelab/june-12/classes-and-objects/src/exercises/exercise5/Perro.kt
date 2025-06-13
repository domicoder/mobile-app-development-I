package exercises.exercise5

class Perro(var nombre: String) : Animal(nombre = nombre) {
    override fun hacerSonido() {
        println("El Perro $nombre ladra.")
    }

    override fun moverse() {
        println("El Perro $nombre camina.")
    }
}