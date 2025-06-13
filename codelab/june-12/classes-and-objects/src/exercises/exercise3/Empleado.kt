package exercises.exercise3

open class Empleado(open var nombre: String, open var edad: Int, open var salarioBase: Double) {
    init {
//        nombre será null porque las propiedades aún no han sido asignadas correctamente por la subclase.
        println("Se ha registrado un nuevo empleado: $nombre")
    }

    open fun calcularSalario(): Double = salarioBase
}