import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.customer.api.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
