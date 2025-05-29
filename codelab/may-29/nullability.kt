// 4 - Learn about nullability
// var name: String = null
// -> nullability -> ⇒ error: null can not be a value of a non-null type Int

var name: String? = null

var documents: Int? = 6
if (documents != null) {
  documents = documents.dec()
}

// is the same
documents = documents?.dec()

// you can also use elvis operator
documents = documents?.dec() ?: 0

// if you need to handle NullPointerExceptions
val cedula: String? = null

try {
  val cedulaLength = cedula!!.length
} catch (e: NullPointerException) {
  println("Caught NullPointerException: ${e.message}")
}

