package com.ennyshmurin;

import java.util.ArrayList;
import java.util.List;


public class Bank implements IBank {
    protected List<IAccount> accountList;
    protected double Balance;

    @Override
    public void OpenAccount(IAccount account) {
        accountList.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        List<IAccount> account_close = new ArrayList<IAccount>();
        for (IAccount account : accountList) {
            if (account.GetAccountNumber() == accountNumber) ;
            {
                if (account.GetCurrentBalance() > 0)
                    accountList.remove(account);
                else {
                    System.out.println("Negative balance. Account cannot be closed due to debt");
                }
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return accountList;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt()
    {
        List<IAccount> account_InDebt = new ArrayList<IAccount>();
        for (IAccount account : accountList) {
            if (account.GetCurrentBalance() < 0) {
                account_InDebt.add(account);
            }
        }
        return account_InDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> account_WithBalance = new ArrayList<IAccount>();
        for (IAccount account : accountList) {
            if (account.GetCurrentBalance() > 0) {
                account_WithBalance.add(account);
            }
        }
        return account_WithBalance;
    }
        public Bank() {
        Balance = 0;
        accountList = new ArrayList<IAccount>();
    }


}
