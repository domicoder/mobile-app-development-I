// Ejercicio 3: Enum Classes para `PrioridadTarea`

// Crea una `enum class` llamada `PrioridadTarea` con tres constantes: `BAJA`, `MEDIA`, `ALTA`.
// Añade un constructor a la clase enum para que cada constante pueda tener una propiedad `colorHex` (String), por ejemplo: `BAJA("#00FF00")`.
// Crea una función `obtenerColor(prioridad: PrioridadTarea): String` que devuelva el código de color de la prioridad dada.
// En `main`, itera sobre todos los valores de `PrioridadTarea` usando `PrioridadTarea.values()` y muestra el nombre de cada prioridad y su color.

enum class PrioridadTarea(val colorHex: String) {
    BAJA("#00FF00"),
    MEDIA("#FFFF00"),
    ALTA("#FF0000")
}

fun obtenerColor(prioridad: PrioridadTarea): String {
    return prioridad.colorHex
}

fun main() {
    for (prioridad in PrioridadTarea.values()) {
        println("Prioridad: ${prioridad.name}, Color: ${obtenerColor(prioridad)}")
    }
}

// result
// Prioridad: BAJA, Color: #00FF00
// Prioridad: MEDIA, Color: #FFFF00
// Prioridad: ALTA, Color: #FF0000