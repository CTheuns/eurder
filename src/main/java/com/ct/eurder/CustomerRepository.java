package com.ct.eurder;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getAllCustomers() {
        //return customers;
        return List.copyOf(customers);
    }

    public Customer getCustomerByEmail(String email) {
        return customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Customer with id " + email + " not found"));
    }

    public Customer addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        return newCustomer;
    }
}
