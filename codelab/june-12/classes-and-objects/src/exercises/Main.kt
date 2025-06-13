package exercises

import exercises.exercise1.Circulo
import exercises.exercise1.Cuadrado
import exercises.exercise2.Circulo as Circulo2
import exercises.exercise2.Cuadrado as Cuadrado2

import exercises.exercise2.FiguraGeometrica as FG2

fun main() {
    println("\nExercise 1")
    runExercise1()
    println("\nExercise 2")
    runExercise2()
}

fun runExercise1() {
//    Crea una clase base (open class) `FiguraGeometrica`. En su **constructor primario**, debe aceptar una propiedad `nombre` (String).
//    Dentro de la clase `FiguraGeometrica`, añade una función `imprimirNombre()` que imprima "Soy una figura: [nombre]".
//    Crea dos clases hijas: `Circulo` y `Cuadrado`, que hereden de `FiguraGeometrica`.
//    El **constructor primario** de `Circulo` debe aceptar un `radio` (Double) además del `nombre`.
//    El **constructor primario** de `Cuadrado` debe aceptar un `lado` (Double) además del `nombre`.
//    En tu función `main`, crea una instancia de `Circulo` y una de `Cuadrado` y llama a su método `imprimirNombre()`.
    val circle = Circulo(5.0)
    circle.imprimirNombre()
    val square = Cuadrado(5.0)
    square.imprimirNombre()
}

fun runExercise2() {
//    Modifica la clase `FiguraGeometrica` del ejercicio anterior. Añade una función `open fun calcularArea(): Double` que devuelva `0.0`.
//    En las clases `Circulo` y `Cuadrado`, **sobrescribe (override)** el método `calcularArea()` para que calcule y devuelva el área correcta para cada figura (Círculo: π * radio², Cuadrado: lado * lado).
//    En `main`, crea una **lista** de tipo `FiguraGeometrica` y añade tus instancias de `Circulo` y `Cuadrado`.
//    **Itera sobre la lista** y, para cada figura, imprime su nombre y su área calculada. Observa cómo se llama al método `calcularArea()` correcto para cada objeto, demostrando el polimorfismo.
    val figures = mutableListOf<FG2>()
    figures.add(Circulo2(2.0))
    figures.add(Cuadrado2(2.0))

    for (figure in figures) {
        val area = figure.calcularArea()
        println("Nombre: ${figure.nombre}")
        println("Area: ${area}")
    }
}