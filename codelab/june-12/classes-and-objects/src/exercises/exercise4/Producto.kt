package exercises.exercise4

open class Producto(open var codigo: String, open var precio: Double) {
    init {
        if (precio < 0) {
            throw IllegalArgumentException("El precio no puede ser negativo")
        }
    }
    constructor(codigo: String) : this(codigo, 9.99) {}
    constructor() : this("GEN-001", 0.99) {}
}