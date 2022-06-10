package accounts;

import bank.Bank;
import bank.PermissionException;


public class Savings extends Account{
    public Savings(String name, double init, Bank bank){
        super(name, init, bank);
        type = AccountType.SAVINGS;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance - amount >= 1000){
            return super.withdraw(amount);
        }
        return false;
    }

    @Override
    public boolean reqLoan(double amount) {
        if(amount <= 10000){
            super.reqLoan(amount);
            return true;
        }
        return false;
    }

    @Override
    public void inc() throws PermissionException {
        age++;
        bank.incInternalFund(this, -(balance * bank.getSavingsInterestRate() - loan * bank.getLoanInterestRate() - 500));
        balance += (balance * bank.getSavingsInterestRate() - loan * bank.getLoanInterestRate() - 500);
    }

}
