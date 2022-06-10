package accounts;

import bank.Bank;
import bank.Loan;
import bank.PermissionException;
import employees.Employee;


public abstract class Account {
    public String ownerName;
    protected double balance, loan;
    protected int age;
    protected Bank bank;
    public AccountType type;

    public Account(String name, double init, Bank bank){
        ownerName = name;
        balance = init;
        this.bank = bank;
        loan = 0;
        age = 0;
    }

    public boolean deposit(double amount) throws PermissionException {
        if(loan > 0){
            if(loan >= amount){
                loan -= amount;
            }
            else{
                balance += (amount - loan);
                loan = 0;
            }
        }
        balance += amount;
        return true;
    }
    public boolean withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
    public boolean reqLoan(double amount){
        bank.reqLoan(new Loan(ownerName, amount));
        return false;
    }

    public void takeLoan(double amount){
        loan += amount;
        if(type != AccountType.LOAN){
            balance += amount;
        }
    }

    public String lookup(Employee employee) throws PermissionException {
        if(employee == null){
            throw new PermissionException("Access Denied");
        }
        return query(this);
    }

    public String query(Account account){
        if(!account.ownerName.equalsIgnoreCase(ownerName)){
            return "Not Allowed";
        }
        if(loan == 0)
            return "Current balance " + balance + "$";
        else
            return "Current balance " + balance + "$, loan " + loan + "$";
    }

    public double getBalance(Bank bank) throws PermissionException {
        if(bank != this.bank){
            throw new PermissionException("Access Denied");
        }
        return balance;
    }

    public double getLoan(Bank bank) throws PermissionException {
        if(bank != this.bank){
            throw new PermissionException("Access Denied");
        }
        return loan;
    }

    abstract public void inc() throws PermissionException;

}
