package ma.mehdi.customerservice.dao.repositories;

import ma.mehdi.customerservice.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
