package com.ct.eurder.customer;

import com.ct.eurder.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository {

    private final Map<UUID, Customer> customers = new HashMap<>();

    public List<Customer> getAllCustomers() {
        //return customers;
        return List.copyOf(customers.values());
    }

    public Customer addCustomer(Customer newCustomer) {
        customers.put(newCustomer.getId(), newCustomer);
        return newCustomer;
    }

    public static Customer getCustomerById(UUID id) {
        return customers.get(id);
    }

}
