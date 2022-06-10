package employees;

import bank.Bank;

public class Cashier extends Employee{

    public Cashier(String name, Bank bank){
        super(name, 1, EmployeeType.CASHIER, bank);
    }
}
