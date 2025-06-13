package exercises.exercise10

class NotificacionPush: Notificacion() {
    override fun enviar() {
        println("Enviando notificación Push...")
    }
}
