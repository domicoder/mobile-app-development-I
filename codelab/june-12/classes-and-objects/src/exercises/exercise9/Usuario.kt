package exercises.exercise9

class Usuario(var username: String, var email: String) {
    init {
        if (username.isEmpty()) {
            throw IllegalArgumentException("Username no puede estar vacío.")
        }
    }
    constructor(username: String) : this(username, "") {
        val regexEmail = Regex("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}\$")
        val emailGenerated = username + "@empresa.com"
        if (emailGenerated.matches(regexEmail)) {
            this.username = username
            this.email = emailGenerated
        } else {
            throw IllegalArgumentException("El email no es valido.")
        }
    }
}