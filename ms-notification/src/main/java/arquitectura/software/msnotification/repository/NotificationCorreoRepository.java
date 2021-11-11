package arquitectura.software.msnotification.repository;

import arquitectura.software.msnotification.entity.NotificationCorreoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface NotificationCorreoRepository extends JpaRepository<NotificationCorreoEntity,Integer> {
}
