package com.ct.eurder.customer;

import com.ct.eurder.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository {

    private final Map<String, Customer> customers = new HashMap<>();

    public List<Customer> getAllCustomers() {
        //return customers;
        return List.copyOf(customers.values());
    }

    public Customer getCustomerByEmail(String email) {
        return customers.get(email);
    }

    public Customer addCustomer(Customer newCustomer) {
        customers.put(newCustomer.getEmail(), newCustomer);
        return newCustomer;
    }
}
