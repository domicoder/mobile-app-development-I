// Ejercicio 1: Data Classes para un `Libro`

// Crea una `data class` llamada `Libro` con las propiedades `titulo` (String), `autor` (String) y `isbn` (String).
// En `main`, crea dos instancias de `Libro` con los mismos datos.
// Compara las dos instancias usando `==` y comprueba que el resultado es `true`.
// Imprime una de las instancias. Observa el formato legible que proporciona el método `toString()` autogenerado.
// Crea una tercera instancia usando el método `copy()` de la primera, pero cambiando el `titulo`. Imprime esta nueva instancia para ver el cambio.
data class Libro(val titulo: String, val autor: String, val isbn: String)

fun main() {
    val libro1 = Libro("El Que Que", "Que se yo", "978-0062373565")
    val libro2 = Libro("El Que Que", "Que se yo", "978-0062373565")

    println(libro1 == libro2)
    println(libro1)
    println(libro1.copy(titulo = "El Que Que Parte 2"))
}

// result
// true
// Libro(titulo=El Que Que, autor=Que se yo, isbn=978-0062373565)
// Libro(titulo=El Que Que Parte 2, autor=Que se yo, isbn=978-0062373565)