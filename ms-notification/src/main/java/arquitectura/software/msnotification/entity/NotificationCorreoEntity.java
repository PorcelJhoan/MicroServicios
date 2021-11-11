package arquitectura.software.msnotification.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotificationCorreoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer NotificacionCorreoId;
    private String Notificacion;
    private Integer UsuarioId;
    private String correo;

    public NotificationCorreoEntity(Integer notificacionCorreoId, String notificacion, Integer usuarioId, String correo) {
        NotificacionCorreoId = notificacionCorreoId;
        Notificacion = notificacion;
        UsuarioId = usuarioId;
        this.correo = correo;
    }

    public NotificationCorreoEntity() {

    }

    public Integer getNotificacionCorreoId() {
        return NotificacionCorreoId;
    }

    public void setNotificacionCorreoId(Integer notificacionCorreoId) {
        NotificacionCorreoId = notificacionCorreoId;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
