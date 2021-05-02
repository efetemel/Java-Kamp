package com.ersozyazilim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers = {new FileLogger(),new DatabaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer engin = new Customer(1,"Engin","Demiroğ");
        customerManager.add(engin);
    }
}
