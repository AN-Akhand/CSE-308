package employees;

import accounts.AccountType;
import bank.Bank;
import bank.PermissionException;


abstract public class Employee {
    public String name;
    public int clearanceLevel;
    private EmployeeType type;
    private Bank bank;

    public Employee(String name, int clearanceLevel, EmployeeType type, Bank bank) {
        this.name = name;
        this.clearanceLevel = clearanceLevel;
        this.type = type;
        this.bank = bank;
    }

    public String lookup(String name) throws PermissionException {
        return bank.accounts.get(name).lookup(this);
    }
    public void approveLoan() throws PermissionException{
        if(clearanceLevel < 2){
            throw new PermissionException("Access Denied");
        }
        bank.approveLoan(this);
    }
    void changeInterestRate(AccountType type, double newVal) throws PermissionException{
        if(clearanceLevel < 3){
            throw new PermissionException("Access Denied");
        }
        if(type == AccountType.SAVINGS){

        }
    }
    double seeInternalFund() throws PermissionException{
        if(clearanceLevel < 3){
            throw new PermissionException("Access Denied");
        }
        return 0;
    }
}
