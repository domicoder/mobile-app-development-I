package exercises.exercise2

//El **constructor primario** de `Cuadrado` debe aceptar un `lado` (Double) además del `nombre`.

class Cuadrado(var lado: Double, override var nombre: String = "Cuadrado"): FiguraGeometrica(nombre = nombre) {
    override fun calcularArea(): Double {
        return lado * lado
    }
}