package accounts;

import bank.Bank;
import bank.PermissionException;

public class Student extends Account{

    public Student(String name, double init, Bank bank){
        super(name, init, bank);
        type = AccountType.STUDENT;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= 10000){
            return super.withdraw(amount);
        }
        return false;
    }

    @Override
    public boolean reqLoan(double amount) {
        if(amount <= 1000){
            super.reqLoan(amount);
            return true;
        }
        return false;
    }

    @Override
    public void inc() throws PermissionException {
        age++;
        bank.incInternalFund(this, -(balance * bank.getStudentInterestRate() - loan * bank.getLoanInterestRate() - 500));
        balance += (balance * bank.getStudentInterestRate() - loan * bank.getLoanInterestRate() - 500);
    }

}
