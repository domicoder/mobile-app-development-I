// Ejercicio 5: Companion Object para Factory Method

// Crea una clase `Usuario` con un **constructor primario privado** que acepte `email` (String).
// Dentro de la clase `Usuario`, crea un `companion object`.
// En el `companion object`, crea una función `crearDesdeEmail(email: String): Usuario?`.
// Esta función debe validar si el email contiene un "@". Si es válido, debe crear y devolver una nueva instancia de `Usuario`. Si no, debe devolver `null`.
// En `main`, intenta crear usuarios usando `Usuario.crearDesdeEmail()` con un email válido y uno inválido, y maneja el caso `null`.

class Usuario private constructor(val email: String) {
  companion object {
    fun crearDesdeEmail(email: String): Usuario? {
      if (email.contains("@")) {
        return Usuario(email)
      }
      return null
    }
  }
}

fun main() {
  val usuario1 = Usuario.crearDesdeEmail("test@test.com")
  val usuario2 = Usuario.crearDesdeEmail("test_test.com")

  println(usuario1)
  println(usuario1?.email)
  println(usuario2)
}

// result
// Usuario@433c675d
// test@test.com
// null