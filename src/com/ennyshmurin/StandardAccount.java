package com.ennyshmurin;

public class StandardAccount implements IAccount {

    protected int accountNumber;
    protected double creditLimit;
    protected double Balance;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.Balance = Balance;
    }

    @Override
    public void Deposit(double amount) {
        if (amount != 0) {
            Balance = Balance + amount;
        }
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > creditLimit) {
            Balance = Balance - creditLimit;
            return Balance;
        }
            Balance = Balance - amount;
            return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}