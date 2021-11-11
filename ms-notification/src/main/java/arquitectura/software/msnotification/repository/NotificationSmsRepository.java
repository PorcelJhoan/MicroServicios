package arquitectura.software.msnotification.repository;

import arquitectura.software.msnotification.entity.NotificationCorreoEntity;
import arquitectura.software.msnotification.entity.NotificationSmsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface NotificationSmsRepository extends JpaRepository<NotificationSmsEntity,Integer> {
}
