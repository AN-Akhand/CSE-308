package bank;

import accounts.*;
import employees.Cashier;
import employees.Employee;
import employees.ManagingDirector;
import employees.Officer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Bank {
    protected ManagingDirector md;
    protected HashMap<String, Officer> officers;
    protected HashMap<String, Cashier> cashiers;
    public HashMap<String, Account> accounts;
    private LinkedList<Loan> loanReqs;
    private double internalFund;
    private int clock;
    private double savingsInterestRate, studentInterestRate, fixedDepInterestRate, loanInterestRate;
    public Bank(){
        md = new ManagingDirector("MD", this);
        officers = new HashMap<>();
        for(int i = 1; i <= 2; i++){
            officers.put("S" + i, new Officer("S" + i, this));
        }
        cashiers = new HashMap<>();
        for(int i = 1; i <= 5; i++){
            cashiers.put("C" + i, new Cashier("C" + i, this));
        }
        accounts = new HashMap<>();
        loanReqs = new LinkedList<>();
        internalFund = 1000000;
        clock = 0;
        savingsInterestRate = 0.10;
        studentInterestRate = 0.05;
        fixedDepInterestRate = 0.15;
        loanInterestRate = 0.10;
        System.out.print("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");
    }

    public double getInternalFund(Employee employee) throws PermissionException{
        if(employee.clearanceLevel < 3){
            throw new PermissionException("Access Denied");
        }
        return internalFund;
    }
    public void changeSavingsInterest(Employee employee, double newVal) throws PermissionException{
        if(employee.clearanceLevel < 3){
            throw new PermissionException("Access Denied");
        }
        savingsInterestRate = newVal;
    }
    public void changeStudentInterest(Employee employee, double newVal) throws PermissionException{
        if(employee.clearanceLevel < 3){
            throw new PermissionException("Access Denied");
        }
        studentInterestRate = newVal;
    }
    public void changeFixedDepInterest(Employee employee, double newVal) throws PermissionException{
        if(employee.clearanceLevel < 3){
            throw new PermissionException("Access Denied");
        }
        fixedDepInterestRate = newVal;
    }

    public void reqLoan(Loan loan){
        loanReqs.add(loan);
    }

    public boolean createAccount(String name, String accountType, double init, Bank bank){
        if(accounts.keySet().contains(name)){
            System.out.println("Account with this name already exists");
        }
        if(accountType.equalsIgnoreCase("Savings")){
            accounts.put(name, new Savings(name, init, bank));
        }
        else if(accountType.equalsIgnoreCase("Student")){
            accounts.put(name, new Student(name, init, bank));
        }
        else if(accountType.equalsIgnoreCase("FixedDeposit")){
            if(init < 100000){
                System.out.println("Can't open Fixed Deposit account without 100000 initial deposit");
                return false;
            }
            else accounts.put(name, new FixedDeposit(name, init, bank));
        }
        else if(accountType.equalsIgnoreCase("Loan")){
            accounts.put(name, new accounts.Loan(name, init, bank));
        }
        return true;
    }

    public double getSavingsInterestRate() {
        return savingsInterestRate;
    }

    public double getStudentInterestRate() {
        return studentInterestRate;
    }

    public double getFixedDepInterestRate() {
        return fixedDepInterestRate;
    }

    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    public LinkedList<Loan> getLoanReqs(){
        return loanReqs;
    }

    public void approveLoan(Employee e) throws PermissionException {
        if(e.clearanceLevel < 2){
            throw new PermissionException("Access Denied");
        }
        Iterator<Loan> iter = loanReqs.iterator();
        for(Loan loan : loanReqs){
            Account account = accounts.get(loan.name);
            account.takeLoan(loan.amount);
            internalFund -= loan.amount;
            System.out.println("Loan for " + loan.name + " approved");
        }
        loanReqs.clear();
    }

    public void incInternalFund(Account account, double amount) throws PermissionException {
        if(account == null){
            throw new PermissionException("Access Denied");
        }
        internalFund += amount;
    }

    public void inc() throws PermissionException {
        clock++;
        for(Account account : accounts.values()){
            account.inc();
        }
    }

}
