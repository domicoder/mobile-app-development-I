// Ejercicio 9: Clases Genéricas con `Caja<T>`

// Crea una clase genérica `Caja` que tenga una propiedad `contenido` de tipo `T` en su constructor.
// Añade una función `obtenerContenido(): T` que devuelva el contenido.
// Añade una función `estaVacia(): Boolean` que devuelva `true` si el contenido es `null` (para esto, el tipo genérico debe ser nulable: `Caja`).
// En `main`, crea una `Caja` para un `String` y otra para un `Int`.
// Muestra el contenido de cada caja y verifica si están vacías.

class Caja<T>(private val contenido: T) {
  fun obtenerContenido(): T {
    return contenido
  }

  fun estaVacia(): Boolean {
    return contenido == null
  }
}

fun main() {
  val cajaString = Caja<String>("Hola")
  val cajaInt = Caja<Int>(1)
  val cajaNull = Caja<Int?>(null)

  println(cajaString.obtenerContenido())
  println(cajaInt.obtenerContenido())
  println(cajaNull.obtenerContenido())

  println(cajaString.estaVacia())
  println(cajaInt.estaVacia())
  println(cajaNull.estaVacia())
}

// result
// Hola
// 1
// null
// false
// false
// true