package exercises.exercise2

open class FiguraGeometrica(open var nombre: String) {
    fun imprimirNombre() {
        println("Soy una figura: : $nombre")
    }
    open fun calcularArea(): () -> Double = { 0.0 }
}