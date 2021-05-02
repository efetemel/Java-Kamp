package com.ersozyazilim;

import com.ersozyazilim.adapters.MernisServiceAdapter;
import com.ersozyazilim.managers.BaseCustomerManager;
import com.ersozyazilim.managers.StarbucksCustomerManager;
import com.ersozyazilim.entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Efe Temel","ERSÖZ",new Date(2004,02,27),"1111111111"));
    }
}
