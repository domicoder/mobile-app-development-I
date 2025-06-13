package exercises.exercise10

class NotificacionEmail: Notificacion() {
    override fun enviar() {
        println("Enviando notificación Email...")
    }
}
