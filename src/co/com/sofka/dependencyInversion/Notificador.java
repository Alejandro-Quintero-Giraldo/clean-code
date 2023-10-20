package co.com.sofka.dependencyInversion;

public class Notificador {

    ServicioEmail servicioEmail;
    ServicioSMS servicioSMS;

    public Notificador(ServicioEmail servicioEmail, ServicioSMS servicioSMS) {
        this.servicioEmail = servicioEmail;
        this.servicioSMS = servicioSMS;
    }

    protected void enviarNotificacion(String mensaje) {
        this.servicioEmail.enviarMensaje(mensaje);
        this.servicioSMS.enviarMensaje(mensaje);
    }
}
