package employees;

import bank.Bank;

public class Officer extends Employee{

    public Officer(String name, Bank bank){
        super(name, 2, EmployeeType.OFFICER, bank);
    }
}
