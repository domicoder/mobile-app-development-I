package exercises

import exercises.exercise1.Circulo
import exercises.exercise1.Cuadrado
import exercises.exercise10.Notificacion
import exercises.exercise10.NotificacionEmail
import exercises.exercise10.NotificacionPush
import exercises.exercise10.NotificacionSMS
import exercises.exercise3.Desarrollador
import exercises.exercise3.Gerente
import exercises.exercise4.Producto
import exercises.exercise5.Animal
import exercises.exercise5.Gato
import exercises.exercise5.Pajaro
import exercises.exercise5.Perro
import exercises.exercise6.Coche
import exercises.exercise7.Utils
import exercises.exercise8.ArticuloDeRevista
import exercises.exercise8.Libro
import exercises.exercise9.Usuario
import exercises.exercise2.Circulo as Circulo2
import exercises.exercise2.Cuadrado as Cuadrado2

import exercises.exercise2.FiguraGeometrica as FG2

fun main() {
    println("\nExercise 1")
    runExercise1()
    println("\nExercise 2")
    runExercise2()
    println("\nExercise 3")
    runExercise3()
    println("\nExercise 4")
    runExercise4()
    println("\nExercise 5")
    runExercise5()
    println("\nExercise 6")
    runExercise6()
    println("\nExercise 7")
    runExercise7()
    println("\nExercise 8")
    runExercise8()
    println("\nExercise 9")
    runExercise9()
    println("\nExercise 10")
    runExercise10()
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

    figures.forEach { it ->
        it.imprimirNombre()
        println("Area: ${it.calcularArea()}")
    }
}

fun runExercise3() {
//    Crea una clase base `Empleado` con un **constructor primario** que acepte `nombre` (String), `edad` (Int) y `salarioBase` (Double).
//    Dentro de la clase `Empleado`, usa un **bloque `init`** para imprimir un mensaje de bienvenida, por ejemplo: "Se ha registrado un nuevo empleado: [nombre]".
//    Añade a `Empleado` una función `open fun calcularSalario(): Double` que simplemente devuelva `salarioBase`.
//    Crea una clase hija `Gerente` que herede de `Empleado`. Su constructor primario debe aceptar también una propiedad `bono` (Double).
//    **Sobrescribe** `calcularSalario()` en `Gerente` para que devuelva la suma de `salarioBase` y `bono`.
//    Crea una clase hija `Desarrollador` que herede de `Empleado`. Añade una propiedad `lenguaje` (String) en su constructor.
//    En `main`, crea un `Gerente` y un `Desarrollador`, y muestra el salario calculado para cada uno.
    val gerente = Gerente(nombre = "Pink Qk", edad = 30, salarioBase = 1000.0, bono = 200.0)
    println("Salario gerente: ${gerente.calcularSalario()}")
    val dev = Desarrollador(nombre = "White Qk", edad = 30, salarioBase = 1000.0, lenguaje = "Java")
    println("Salario desarrollador: ${dev.calcularSalario()}")
}

fun runExercise4() {
//    Crea una clase `Producto` con un **constructor primario** que tome `codigo` (String) y `precio` (Double).
//    Dentro de la clase, utiliza un **bloque `init`** para validar que el `precio` no sea negativo. Si lo es, lanza una excepción (`IllegalArgumentException`).
//    Crea un **constructor secundario** que solo acepte el `codigo`. Este constructor debe delegar al primario, asignando un precio por defecto de `9.99`.
//    Crea otro **constructor secundario** que no acepte parámetros. Debe delegar al constructor primario asignando un `codigo` "GEN-001" y un `precio` de `0.99`.
//    En `main`, crea instancias de `Producto` usando los tres constructores y muestra sus detalles.
    val p1 = Producto("GEN-123", 10.0)
    println("Producto: ${p1.codigo} - Precio: ${p1.precio}")
    val p2 = Producto("GEN-456")
    println("Producto: ${p2.codigo} - Precio: ${p2.precio}")
    val p3 = Producto()
    println("Producto: ${p3.codigo} - Precio: ${p3.precio}")
}

fun runExercise5() {
//    Crea una **clase abstracta (abstract class) `Animal`** con una propiedad `nombre` (String) en su constructor.
//    Dentro de `Animal`, define dos métodos abstractos: `abstract fun hacerSonido()` y `abstract fun moverse()`.
//    Crea tres clases concretas que hereden de `Animal`: `Perro`, `Gato` y `Pajaro`.
//    **Implementa** los métodos `hacerSonido()` y `moverse()` en cada clase hija con un comportamiento apropiado (p. ej., el perro ladra y corre, el pájaro pía y vuela).
//    Crea una lista de `Animal` que contenga instancias de tus tres clases.
//    Recorre la lista y llama a `hacerSonido()` y `moverse()` para cada animal, demostrando el polimorfismo.
    val animals = mutableListOf<Animal>()
    animals.add(Perro(nombre = "Fido"))
    animals.add(Gato(nombre = "Paco"))
    animals.add(Pajaro(nombre = "Juani"))

    animals.forEach { it ->
        it.hacerSonido()
        it.moverse()
    }
}

fun runExercise6() {
//    Crea una clase base `Vehiculo` con un método `open fun describir()` que imprima "Este es un vehículo genérico."
//    Crea una clase hija `Coche` que herede de `Vehiculo`.
//    Sobrescribe el método `describir()` en `Coche`. Dentro de este método,
//    primero **llama al método de la clase padre** (`super.describir()`)
//    y luego añade una nueva línea que imprima "Más específicamente, un coche de 4 ruedas."
    val coche = Coche()
    coche.describir()
}

fun runExercise7() {
//    Usando la jerarquía de `Animal` del ejercicio 5, crea una función fuera de las clases llamada `describirComportamiento(animal: Animal)`.
//    Dentro de esta función, utiliza una sentencia `when` para comprobar el tipo de `animal`.
//    Si `animal` **es un** `Pajaro`, imprime "Este animal vuela alto." (Kotlin hará un *smart cast* y sabrá que es un `Pajaro`).
//    Si `animal` **es un** `Perro`, imprime "Este animal es el mejor amigo del hombre."
//    Para cualquier otro tipo de `Animal`, imprime "Este animal tiene un comportamiento interesante."
//    Llama a esta función desde `main` con tus instancias de `Perro`, `Gato` y `Pajaro`.
    val animals = mutableListOf<Animal>()
    animals.add(Perro(nombre = "Fido"))
    animals.add(Gato(nombre = "Paco"))
    animals.add(Pajaro(nombre = "Juani"))

    animals.forEach { it ->
        Utils.describirComportamiento(it)
    }
}

fun runExercise8() {
//    Crea una clase base `Publicacion` con propiedades `titulo` y `autor`.
//    Crea una clase `Libro` que herede de `Publicacion` y añada una propiedad `numeroPaginas`.
//    Crea una clase `ArticuloDeRevista` que también herede de `Publicacion` y añada una propiedad `nombreRevista`.
//    En `main`, demuestra que puedes crear un `Libro` y un `ArticuloDeRevista`, y que ambos tienen acceso a las propiedades `titulo` y `autor` de la clase base.
    val libro = Libro(numeroPaginas = 11)
    println("Libro Titulo: ${libro.titulo}")
    println("Libro Autor: ${libro.autor}")
    val revista = ArticuloDeRevista(nombreRevista = "La Atalaya")
    println("Revista Titulo: ${revista.titulo}")
    println("Revista Autor: ${revista.autor}")
}

fun runExercise9() {
//    Crea una clase `Usuario` con un **constructor primario** que tome `username` (String) y `email` (String).
//    En el **bloque `init`** del constructor primario, valida que el `username` no esté vacío.
//    Crea un **constructor secundario** que solo acepte `username`. Este constructor debe validar que el email generado por defecto (`[username]@empresa.com`) sea un email válido (puedes hacer una validación simple, como verificar que contenga "@"). Luego, debe delegar al constructor primario.
//    Prueba creando usuarios con ambos constructores.
    val usuario1 = Usuario("domicoder", "domicoder@empresa.com")
    val usuario2 = Usuario("domicoder2")

    println("Usuario 1: ${usuario1.username} - ${usuario1.email}")
    println("Usuario 2: ${usuario2.username} - ${usuario2.email}")
}

fun runExercise10() {
//    Crea una clase base `Notificacion` con un método `open fun enviar()` que imprima "Enviando notificación genérica...".
//    Crea tres clases hijas: `NotificacionEmail`, `NotificacionSMS` y `NotificacionPush` con propiedades y métodos `enviar()` sobrescritos y apropiados.
//    En `main`, crea una función `enviarTodas(notificaciones: List)` que itere sobre una lista de notificaciones y llame al método `enviar()` de cada una.
//    Crea una lista mixta con diferentes tipos de notificaciones y pásala a tu función `enviarTodas`.

    val notificaciones = mutableListOf<Notificacion>()
    notificaciones.add(NotificacionEmail())
    notificaciones.add(NotificacionSMS())
    notificaciones.add(NotificacionPush())
    Utils.enviarTodas(notificaciones)
}
