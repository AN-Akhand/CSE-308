package bank;

import accounts.Account;
import employees.Employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings;
        Bank bank = new Bank();
        Account currentAccount = null;
        Employee currentEmployee = null;
        while(true){
            try {
                strings = reader.readLine().split(" ");
                if (strings[0].equalsIgnoreCase("Create")) {
                    if(!bank.createAccount(strings[1], strings[2], Double.parseDouble(strings[3]), bank)){
                        continue;
                    }
                    currentAccount = bank.accounts.get(strings[1]);
                    System.out.println(strings[2] + " account for " + strings[1] + " created. Initial balance " + strings[3] + "$");
                } else if (strings[0].equalsIgnoreCase("Deposit")) {
                    if (currentAccount == null) {
                        System.out.println("Not allowed");
                        continue;
                    }
                    if (!currentAccount.deposit(Double.parseDouble(strings[1]))) {
                        System.out.println("Invalid Transaction. " + currentAccount.query(currentAccount));
                    } else
                        System.out.println(strings[1] + "$ deposited. " + currentAccount.query(currentAccount));
                } else if (strings[0].equalsIgnoreCase("Withdraw")) {
                    if (currentAccount == null) {
                        System.out.println("Not allowed");
                        continue;
                    }
                    if (!currentAccount.withdraw(Double.parseDouble(strings[1]))) {
                        System.out.println("Invalid Transaction. " + currentAccount.query(currentAccount));
                    } else {
                        System.out.println("Withdrawal successful. " + currentAccount.query(currentAccount));
                    }
                } else if (strings[0].equalsIgnoreCase("Query")) {
                    if (currentAccount == null) {
                        System.out.println("Not allowed");
                        continue;
                    }
                    System.out.println(currentAccount.query(currentAccount));
                } else if (strings[0].equalsIgnoreCase("Request")) {
                    if (currentAccount == null) {
                        System.out.println("Not allowed");
                        continue;
                    }
                    if (!currentAccount.reqLoan(Double.parseDouble(strings[1]))) {
                        System.out.println("Invalid Transaction." + currentAccount.query(currentAccount));
                    } else {
                        System.out.println("Loan request successful, sent for approval");
                    }
                } else if (strings[0].equalsIgnoreCase("Close")) {
                    if (currentAccount != null) {
                        System.out.println("Transaction for " + currentAccount.ownerName + " closed");
                        currentAccount = null;
                    } else if (currentEmployee != null) {
                        System.out.println("Operations for " + currentEmployee.name + " closed");
                        currentEmployee = null;
                    }
                } else if (strings[0].equalsIgnoreCase("Open")) {
                    if (strings[1].equalsIgnoreCase("MD")) {
                        currentEmployee = bank.md;
                        System.out.println("MD active");
                        if(bank.getLoanReqs().size() > 0){
                            System.out.println("There are loan requests pending");
                        }
                    } else if (bank.officers.containsKey(strings[1])) {
                        currentEmployee = bank.officers.get(strings[1]);
                        System.out.println(currentEmployee.name + " active");
                        if(bank.getLoanReqs().size() > 0){
                            System.out.println("There are loan requests pending");
                        }
                    } else if (bank.cashiers.containsKey(strings[1])) {
                        currentEmployee = bank.cashiers.get(strings[1]);
                        System.out.println(currentEmployee.name + " active");
                    } else if (bank.accounts.containsKey(strings[1])) {
                        currentAccount = bank.accounts.get(strings[1]);
                        System.out.println("Welcome back, " + currentAccount.ownerName);
                    }
                }
                else if(strings[0].equalsIgnoreCase("Change")){
                    if(currentEmployee == null){
                        System.out.println("Not allowed");
                        continue;
                    }
                    if(strings[1].equalsIgnoreCase("Student")){
                        bank.changeStudentInterest(currentEmployee, Double.parseDouble(strings[2]) / 100);
                    }
                    else if(strings[1].equalsIgnoreCase("Savings")){
                        bank.changeSavingsInterest(currentEmployee, Double.parseDouble(strings[2]) / 100);
                    }
                    else if(strings[1].equalsIgnoreCase("FixedDeposit")){
                        bank.changeFixedDepInterest(currentEmployee, Double.parseDouble(strings[2]) / 100);
                    }
                    System.out.println("Interest rate changed");
                }
                else if(strings[0].equalsIgnoreCase("Lookup")){
                    if(currentEmployee == null){
                        System.out.println("Not allowed");
                        continue;
                    }
                    System.out.println(currentEmployee.lookup(strings[1]));
                }
                else if(strings[0].equalsIgnoreCase("See")){
                    if(currentEmployee == null){
                        System.out.println("Not allowed");
                        continue;
                    }
                    System.out.println(bank.getInternalFund(currentEmployee));
                }
                else if(strings[0].equalsIgnoreCase("INC")){
                    bank.inc();
                    System.out.println("1 year has passed");
                }
                else if(strings[0].equalsIgnoreCase("Approve")){
                    if(currentEmployee == null){
                        System.out.println("Not allowed");
                        continue;
                    }
                        currentEmployee.approveLoan();
                }
            }catch (Exception e){
                if(e instanceof PermissionException) {
                    System.out.println("You don’t have permission for this operation");
                }
                else {
                    System.out.println(e);
                    System.out.println("Some error occurred please try again");
                }
            }
        }
    }
}
