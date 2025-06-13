package exercises.exercise5

class Pajaro(var nombre: String) : Animal(nombre = nombre) {
    override fun hacerSonido() {
        println("El Pajaro $nombre pía.")
    }

    override fun moverse() {
        println("El Pájaro $nombre vuela.")
    }
}