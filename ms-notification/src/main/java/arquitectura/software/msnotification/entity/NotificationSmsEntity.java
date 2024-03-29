package arquitectura.software.msnotification.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class NotificationSmsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer NotificacionSmsId;
    private String Notificacion;
    private Integer UsuarioId;
    private String Telefono;

    public NotificationSmsEntity(Integer notificacionCorreoId, String notificacion, Integer usuarioId, String telefono) {

        NotificacionSmsId = notificacionCorreoId;
        Notificacion = notificacion;
        UsuarioId = usuarioId;
        Telefono = telefono;
    }

    public NotificationSmsEntity() {
    }

    public Integer getNotificacionCorreoId() {
        return NotificacionSmsId;
    }

    public void setNotificacionCorreoId(Integer notificacionCorreoId) {
        NotificacionSmsId = notificacionCorreoId;
    }

    public String getNotificacion() {
        return Notificacion;
    }

    public void setNotificacion(String notificacion) {
        Notificacion = notificacion;
    }

    public Integer getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
