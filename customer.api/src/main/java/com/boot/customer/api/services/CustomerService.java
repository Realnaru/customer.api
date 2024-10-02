import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.customer.api.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository CustomerRepository;

    public Customer createCustomer(Customer customer) {
        return CustomerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();  
        CustomerRepository.findAll().forEach(customers1 -> customers.add(customers1));  
        return customers;  
        } 
    public Customer getCustomerById(long id) {
        Optional<Customer> customer = CustomerRepository.findById(id);
        return customer.orElse(null);
    }

    public Customer updateCustomer(Customer customer, long id) {
          Optional<Customer> customerData = CustomerRepository.findById(id);
        if (customerData.isPresent()) {
            Customer updatedCustomerData = customerData.get();
            updatedCustomerData.setFirstName(customer.getFirstName());
            updatedCustomerData.setLastName(customer.getLastName());
            updatedCustomerData.setPhoneNumber(customer.getPhoneNumber());
            updatedCustomerData.setEmail(customer.getEmail());
            updatedCustomerData.setAge(customer.getAge());
            updatedCustomerData.setAddress(customer.getAddress());
            return CustomerRepository.save(updatedCustomerData);
        }
        return null;
    }

    public boolean deleteCustomer(long id) {
        if (CustomerRepository.existsById(id)) {
            CustomerRepository.deleteById(id);
            return true;
        } else {
            return false;
        }       
    }
}
