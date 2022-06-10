package employees;

import bank.Bank;

public class ManagingDirector extends Employee{
    public ManagingDirector(String name, Bank bank){
        super(name, 3, EmployeeType.MANAGING_DIRECTOR, bank);
    }
}
