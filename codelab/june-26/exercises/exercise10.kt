// Ejercicio 10: Integrador - Sistema de Archivos

// Crea una `sealed class ElementoSistema` con una propiedad `nombre`.
// Define dos subclases de `ElementoSistema`: `Archivo` (con propiedad `tamañoKB`) y `Directorio` (con una `MutableList` para sus contenidos).
// Crea un `object GestorArchivos` con funciones para `crearArchivo` y `crearDirectorio`.
// Crea una **función de extensión** para `Directorio` llamada `calcularTamañoTotal(): Int` que sume recursivamente el tamaño de todos los archivos que contiene.
// En `main`, usa el `GestorArchivos` para construir una estructura de directorios y archivos, y luego llama a tu función de extensión en el directorio raíz para obtener el tamaño total.

sealed class ElementoSistema(val nombre: String) {
  class Archivo(nombre: String, val tamañoKB: Int) : ElementoSistema(nombre)
  class Directorio(nombre: String, val contenidos: MutableList<ElementoSistema>) : ElementoSistema(nombre)
}

object GestorArchivos {
  fun crearArchivo(nombre: String, tamañoKB: Int) = ElementoSistema.Archivo(nombre, tamañoKB)
  fun crearDirectorio(nombre: String, contenidos: MutableList<ElementoSistema>) = ElementoSistema.Directorio(nombre, contenidos)
}

fun ElementoSistema.calcularTamañoTotal(): Int {
  return when (this) {
    is ElementoSistema.Archivo -> tamañoKB
    is ElementoSistema.Directorio -> contenidos.sumBy { it.calcularTamañoTotal() }
  }
}

fun main() {
  val directorioRaiz = GestorArchivos.crearDirectorio("exercises_26_june", mutableListOf())
  val archivo1 = GestorArchivos.crearArchivo("EjercicioDificil.kt", 100)
  val archivo2 = GestorArchivos.crearArchivo("EjercicioDificil2.kt", 200)
  val archivo3 = GestorArchivos.crearArchivo("EjercicioDificil3.kt", 300)

  directorioRaiz.contenidos.add(archivo1)
  directorioRaiz.contenidos.add(archivo2)
  directorioRaiz.contenidos.add(archivo3)

  println("Tamaño total del directorio raíz: ${directorioRaiz.calcularTamañoTotal()}")
}

// result
// Tamaño total del directorio raíz: 600