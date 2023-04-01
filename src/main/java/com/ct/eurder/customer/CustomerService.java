package com.ct.eurder.customer;

import com.ct.eurder.customer.Customer;
import com.ct.eurder.customer.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    public Customer getCustomerByEmail(String email) {
        return customerRepository.getCustomerByEmail(email);
    }

    public Customer addCustomer(Customer newCustomer) {
        return customerRepository.addCustomer(newCustomer);
    }
}
