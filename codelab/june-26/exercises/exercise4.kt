// Ejercicio 4: Singleton con `object` para `Logger`

// Crea un `object` llamado `Logger`.
// Dentro de `Logger`, añade una lista mutable de `String` para almacenar los mensajes de log: `private val logs = mutableListOf()`.
// Crea una función `log(mensaje: String)` que añada el mensaje a la lista `logs` y lo imprima en la consola.
// Crea una función `mostrarLogs()` que imprima todos los mensajes almacenados en la lista.
// En `main`, llama a `Logger.log()` desde diferentes partes de tu código y al final llama a `Logger.mostrarLogs()` para ver el historial completo.

object Logger {
    private val logs = mutableListOf<String>()

    fun log(mensaje: String) {
        logs.add(mensaje)
        println(mensaje)
    }

    fun mostrarLogs() {
        for (log in logs) {
            println(log)
        }
    }
}


fun main() {
  Logger.log("[LOGGER] Error 1")
  Logger.log("[LOGGER] Error 2")
  Logger.log("[LOGGER] Error 3")
  Logger.mostrarLogs()
}

// result
// [LOGGER] Error 1
// [LOGGER] Error 2
// [LOGGER] Error 3
// [LOGGER] Error 1
// [LOGGER] Error 2
// [LOGGER] Error 3