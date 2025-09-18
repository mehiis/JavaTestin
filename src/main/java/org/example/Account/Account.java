package org.example.Account;

public class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            double temp = balance - amount;

            if(temp < 0) {
                balance = 0;
            } else {
                balance = temp;
            }
        }
    }

    public double getBalance() {
        return balance;
    }
}
