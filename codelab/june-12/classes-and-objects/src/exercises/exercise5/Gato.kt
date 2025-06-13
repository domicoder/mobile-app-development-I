package exercises.exercise5

class Gato(var nombre: String) : Animal(nombre = nombre) {
    override fun hacerSonido() {
        println("El Gato $nombre maulla.")
    }

    override fun moverse() {
        println("El Gato $nombre camina.")
    }
}