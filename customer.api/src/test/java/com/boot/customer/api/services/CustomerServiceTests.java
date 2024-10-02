// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

// import com.boot.customer.api.Application;
// import com.boot.customer.api.entities.Customer;

// import org.springframework.beans.factory.annotation.Autowired;

// import static org.junit.jupiter.api.Assertions.*;

// import java.util.List;
// @SpringBootTest(classes = Application.class)
// public class CustomerServiceTests {
    
//     @MockBean
//     private CustomerRepository CustomerRepository;

//     @Autowired
//     private CustomerService CustomerService;

//     @Test
//     public void getAllCustomers() {
//         Customer customer = new Customer();
//         customer.setFirstName("bat");
//         customer.setLastName("bold");
//         customer.setPhoneNumber("1234567890");
//         customer.setEmail("aa@example.com");
//         customer.setAge(30);
//         customer.setAddress("123 123 123");
//         customer.setActive(true);
        
//         Mockito.when(CustomerRepository.findAll()).thenReturn(List.of(customer));

//         List<Customer> customers = CustomerService.getAllCustomers();
//         assertEquals(1, customers.size());
//     }
// }
