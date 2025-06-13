package exercises.exercise3

class Gerente(var bono: Double, override var nombre: String, override  var edad: Int, override var salarioBase: Double) : Empleado(nombre, edad, salarioBase) {
    override fun calcularSalario(): Double = salarioBase + bono
}
