// Ejercicio 6: Funciones de Extensión para `Int`

// Crea una función de extensión para la clase `Int` llamada `esPar()` que devuelva `true` si el número es par y `false` si es impar.
// Crea otra función de extensión para `Int` llamada `cuadrado()` que devuelva el número multiplicado por sí mismo.
// En `main`, declara dos números enteros, uno par y otro impar.
// Llama a tus nuevas funciones de extensión en estos números y muestra los resultados. Por ejemplo: `5.esPar()` y `10.cuadrado()`.

// extension functions
fun Int.esPar(): Boolean {
  return this % 2 == 0
}

fun Int.cuadrado(): Int {
  return this * this
}

fun main() {
  val numero1 = 5 // impar
  val numero2 = 10 // par

  println("${numero1} es par? ${numero1.esPar()}")
  println("${numero2} es par? ${numero2.esPar()}")
  println("${numero1} al cuadrado es ${numero1.cuadrado()}")
  println("${numero2} al cuadrado es ${numero2.cuadrado()}")
}

// result
// 5 es par? false
// 10 es par? true
// 5 al cuadrado es 25
// 10 al cuadrado es 100