/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication2;

public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        this.balance = balance + amount;
    }
    
    public void withdraw (double amount){
        this.balance = balance - amount;
    }

    public double getBalance() {
        return this.balance;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    
}