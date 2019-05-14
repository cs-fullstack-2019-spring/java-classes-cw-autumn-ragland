package com.company.classwork;

public class Account {
    private String name;
    private double balance;
    //Constructor
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    //Getter
    public String getBalance() {
        return (this.name + " balance: $" +this.balance);
    }
    //Methods
    public double withdraw(int amount){
        this.balance = this.balance - amount;
        return this.balance;
    }
    public double deposit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
}
