package exercises.exercise10

class NotificacionSMS: Notificacion() {
    override fun enviar() {
        println("Enviando notificación SMS...")
    }
}
