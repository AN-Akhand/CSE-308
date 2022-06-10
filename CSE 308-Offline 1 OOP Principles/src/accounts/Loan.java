package accounts;

import bank.Bank;
import bank.PermissionException;


public class Loan extends Account{
    private final double balance;
    public Loan(String name, double init, Bank bank){
        super(name, 0, bank);
        balance = 0;
        loan = init;
        type = AccountType.LOAN;
    }

    @Override
    public boolean deposit(double amount) throws PermissionException {
        if(loan >= amount){
            loan -= amount;
            bank.incInternalFund(this, amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public boolean reqLoan(double amount) {
        if(amount <= loan * 0.05){
            super.reqLoan(amount);
            return true;
        }
        return false;
    }

    @Override
    public void inc() {
        loan += loan * bank.getLoanInterestRate();
    }
}
