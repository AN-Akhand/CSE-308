package accounts;

import bank.Bank;
import bank.PermissionException;

public class FixedDeposit extends Account{

    public FixedDeposit(String name, double init, Bank bank){
        super(name, init, bank);
        type = AccountType.FIXED_DEPOSIT;
    }

    @Override
    public boolean deposit(double amount) throws PermissionException {
        if(amount >= 50000){
            return super.deposit(amount);
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if(age >= 1){
            return super.withdraw(amount);
        }
        return false;
    }

    @Override
    public boolean reqLoan(double amount) {
        if(amount <= 100000){
            super.reqLoan(amount);
            return true;
        }
        return false;
    }

    @Override
    public void inc() throws PermissionException {
        age++;
        bank.incInternalFund(this, -(balance * bank.getFixedDepInterestRate() - loan * bank.getLoanInterestRate() - 500));
        balance += (balance * bank.getFixedDepInterestRate() - loan * bank.getLoanInterestRate() - 500);
    }
}
