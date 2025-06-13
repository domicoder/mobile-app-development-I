package exercises.exercise3

class Desarrollador(var lenguaje: String, override var nombre: String, override var edad: Int, override var salarioBase: Double) : Empleado(nombre = nombre, edad = edad, salarioBase = salarioBase)
