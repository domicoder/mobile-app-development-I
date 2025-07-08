// Ejercicio 7: Delegación de Interfaces con `by`

// Crea una interfaz `Impresora` con una función `imprimir(documento: String)`.
// Crea una interfaz `Escaner` con una función `escanear(): String`.
// Crea una clase `ImpresoraLaser` que implemente `Impresora` y muestre un mensaje.
// Crea una clase `EscanerDeCamaPlana` que implemente `Escaner` y devuelva un texto escaneado.
// Crea una clase `Multifuncional` que acepte una `Impresora` y un `Escaner` en su constructor.
// Haz que `Multifuncional` implemente ambas interfaces **delegando** la implementación a los objetos pasados en el constructor, usando la palabra clave `by`.
// En `main`, crea una instancia de `Multifuncional` y prueba sus capacidades de impresión y escaneo.

interface Impresora {
  fun imprimir(documento: String)
}

interface Escaner {
  fun escanear(): String
}

class ImpresoraLaser : Impresora {
  override fun imprimir(documento: String) {
    println("Imprimiendo ${documento} con Impresora Laser")
  }
}

class EscanerDeCamaPlana : Escaner {
  override fun escanear(): String {
    return "Texto escaneado de Cama Plana"
  }
}

class Multifuncional(private val impresora: Impresora, private val escaner: Escaner) : Impresora by impresora, Escaner by escaner {
  fun imprimirYEscanear(documento: String) {
    impresora.imprimir(documento)
    println(escaner.escanear())
  }
}

fun main() {
  val impresora = ImpresoraLaser()
  val escaner = EscanerDeCamaPlana()
  val multifuncional = Multifuncional(impresora, escaner)

  multifuncional.imprimirYEscanear("Documento de prueba")
}

// result
// Imprimiendo Documento de prueba con Impresora Laser
// Texto escaneado de Cama Plana