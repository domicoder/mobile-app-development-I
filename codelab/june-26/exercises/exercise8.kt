// Ejercicio 8: `Pair` y `Triple` para Devolver Valores

// Crea una función `obtenerCoordenadas()` que no acepte parámetros y devuelva un `Pair` representando una coordenada (X, Y).
// En `main`, llama a esta función y usa la **desestructuración** para asignar los resultados a dos variables separadas, `x` e `y`. Imprime las coordenadas.
// Crea una función `obtenerDatosUsuario()` que devuelva un `Triple` representando un nombre de usuario, su edad y si está activo.
// En `main`, llama a esta función y desestructura el resultado en variables `nombre`, `edad`, y `estaActivo`.
// Imprime los datos del usuario de forma legible.

fun obtenerCoordenadas(): Pair<Int, Int> {
  return Pair(1, 2)
}

fun obtenerDatosUsuario(): Triple<String, Int, Boolean> {
  return Triple("domicoder", 28, true)
}

fun main() {
  val (x, y) = obtenerCoordenadas()
  println("Coordenadas: ($x, $y)")

  val (nombre, edad, estaActivo) = obtenerDatosUsuario()
  println("Nombre: $nombre, Edad: $edad, Está activo: $estaActivo")
}

// result
// Coordenadas: (1, 2)
// Nombre: domicoder, Edad: 28, Está activo: true