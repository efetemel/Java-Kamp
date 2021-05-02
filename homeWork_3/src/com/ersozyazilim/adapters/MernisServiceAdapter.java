package com.ersozyazilim.adapters;

import com.ersozyazilim.entities.Customer;
import com.ersozyazilim.entities.CustomerCheckService;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
