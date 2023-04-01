package com.ct.eurder;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{email}")
    public Customer getCustomerByEmail(String email) {
        return customerService.getCustomerByEmail(email);
    }

    @PostMapping(value ="customer/{new}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer addCustomer(@RequestBody Customer newCustomer) {
        return customerService.addCustomer(newCustomer);
    }
}
