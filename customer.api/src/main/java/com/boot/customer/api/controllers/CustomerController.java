import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.boot.customer.api.dto.CustomerDto;
import com.boot.customer.api.entities.Customer;
import com.boot.customer.api.mapper.CustomerMapper;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService CustomerService;

    @PostMapping("/create")
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        Customer customer = CustomerMapper.toEntity(customerDto);
        try {
            Customer createdCustomer = CustomerService.createCustomer(customer);
            return new ResponseEntity<>(CustomerMapper.toDto(createdCustomer), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        try {
            List<Customer> customers = CustomerService.getAllCustomers();
            if (customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            List<CustomerDto> customerDtos = customers.stream()
                    .map(CustomerMapper::toDto)
                    .toList();
            return new ResponseEntity<>(customerDtos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getCustomerById/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id) {
        try {
            Customer customer = CustomerService.getCustomerById(id);
            if (customer == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            CustomerDto customerDto = CustomerMapper.toDto(customer);
            return new ResponseEntity<>(customerDto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
        
    @PostMapping("/updateCustomerById/{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
        Customer customer = CustomerMapper.toEntity(customerDto);

          try {
            Customer updatedCustomer = CustomerService.updateCustomer(customer, id);
            if (updatedCustomer != null) {
                return new ResponseEntity<>(CustomerMapper.toDto(updatedCustomer), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteCustomerById/{id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable Long id) {
        try {
            boolean isDeleted = CustomerService.deleteCustomer(id);
            if (isDeleted) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
