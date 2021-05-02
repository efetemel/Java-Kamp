package com.ersozyazilim.managers;

import com.ersozyazilim.entities.Customer;
import com.ersozyazilim.entities.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println("Veri tabanına kayıt edildi! => "+customer.getFirstName()+" "+customer.getLastName());
    }
}
