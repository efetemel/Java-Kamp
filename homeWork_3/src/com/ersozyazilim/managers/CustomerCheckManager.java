package com.ersozyazilim.managers;

import com.ersozyazilim.entities.Customer;
import com.ersozyazilim.entities.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
