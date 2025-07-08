// Ejercicio 2: Sealed Classes para `ResultadoAPI`

// Crea una `sealed class` llamada `ResultadoAPI`.
// Dentro de `ResultadoAPI`, crea tres subclases:
// Una `data class Exito` que contenga una propiedad `datos` (String).
// Una `data class Error` que contenga una propiedad `mensaje` (String).
// Un `object Cargando` que no contenga propiedades.
// Crea una función `procesarResultado(resultado: ResultadoAPI)` que use una expresión `when` para manejar todos los casos posibles sin necesidad de una rama `else`.
// En `main`, prueba la función `procesarResultado` con una instancia de cada subclase (`Exito`, `Error` y `Cargando`).

sealed class ResultadoAPI {
    data class Exito(val datos: String) : ResultadoAPI()
    data class Error(val mensaje: String) : ResultadoAPI()
    object Cargando : ResultadoAPI()
}

fun procesarResultado(resultado: ResultadoAPI) {
    when (resultado) {
        is ResultadoAPI.Exito -> println("Datos: ${resultado.datos}")
        is ResultadoAPI.Error -> println("Error: ${resultado.mensaje}")
        ResultadoAPI.Cargando -> println("Cargando...")
    }
}

fun main() {
    val resultado1 = ResultadoAPI.Exito("Datos de éxito")
    val resultado2 = ResultadoAPI.Error("Error en la API")
    val resultado3 = ResultadoAPI.Cargando

    procesarResultado(resultado1)
    procesarResultado(resultado2)
    procesarResultado(resultado3)
}

// result
// Datos: Datos de éxito
// Error: Error en la API
// Cargando...