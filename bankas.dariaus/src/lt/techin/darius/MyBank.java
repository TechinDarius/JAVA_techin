package lt.techin.darius;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.*;

public class MyBank implements Bank {
    ArrayList<Account> accounts = new ArrayList<>();


    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return accounts.stream().map(Account::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accounts;
    }

    @Override
    public Account openDebitAccount(String accountHolderName) {
        Account acc= new MyAccount(accountHolderName);
        accounts.add(acc);
        return acc;
    }

    @Override
    public Account openCreditAccount(String accountHolderName, BigDecimal creditLimit) {
        Account acc = new MyAccount(accountHolderName,creditLimit);
        accounts.add(acc);
        return acc;
    }

    @Override
    public Account getAccountByHolderName(String accountHolderName) {
        return accounts.stream().filter(a->a.getHolderName().equals(accountHolderName)).findFirst().get();
    }

    @Override
    public Account getAccountByNumber(String accountNumber) {
        return accounts.stream().filter(a->a.getNumber().equals(accountNumber)).findFirst().get();
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account);

    }
}
