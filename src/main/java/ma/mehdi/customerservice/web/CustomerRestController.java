package ma.mehdi.customerservice.web;


import lombok.AllArgsConstructor;
import ma.mehdi.customerservice.dao.entities.Customer;
import ma.mehdi.customerservice.dao.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController @AllArgsConstructor
public class CustomerRestController {
    CustomerRepository customerRepository;

    @GetMapping("/getall")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }
    @GetMapping("/getbyid/{id}")
    public Optional<Customer> customerById(@PathVariable Long id){
        return customerRepository.findById(id);
    }
    @PostMapping("/save")
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
