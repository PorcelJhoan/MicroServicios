package arquitectura.software.mscustomer.repository;

import arquitectura.software.mscustomer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
}
