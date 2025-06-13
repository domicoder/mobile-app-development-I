package exercises.exercise2

//El **constructor primario** de `Circulo` debe aceptar un `radio` (Double) además del `nombre`.

class Circulo(var radio: Double, override var nombre: String = "Circulo"): FiguraGeometrica(nombre = nombre) {
    override fun calcularArea(): Double {
        return radio * radio * Math.PI
    }
}