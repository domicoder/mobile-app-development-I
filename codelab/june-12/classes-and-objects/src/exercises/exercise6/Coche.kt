package exercises.exercise6

class Coche : Vehiculo() {
    override fun describir() {
        super.describir()
        println("Más específicamente, un coche de 4 ruedas.")
    }
}