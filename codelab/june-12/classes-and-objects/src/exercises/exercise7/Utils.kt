package exercises.exercise7

import exercises.exercise10.Notificacion
import exercises.exercise5.Animal
import exercises.exercise5.Perro
import exercises.exercise5.Pajaro

class Utils {
    companion object {
        fun describirComportamiento(animal: Animal) {
            when (animal) {
                is Pajaro -> println("Este animal vuela alto.")
                is Perro -> println("Este animal es el mejor amigo del hombre.")
                else -> println("Este animal tiene un comportamiento interesante.")
            }
        }

        fun enviarTodas(notificaciones: List<Notificacion>) {
            notificaciones.forEach { it.enviar() }
        }
    }
}