package lt.techin.darius;

import ibank.Account;

import java.math.BigDecimal;

public class MyAccount implements Account {
    private String accountNumber;
    private String accountOwner;
    private BigDecimal accountBalance;

    public MyAccount(String accountOwner, BigDecimal accountBalance) {
        this.accountNumber = AccountGenerator.addAccountNumber();
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public MyAccount(String accountOwner) {
        this.accountNumber=AccountGenerator.addAccountNumber();
        this.accountOwner = accountOwner;
        this.accountBalance=new BigDecimal(0);

    }

    @Override
    public String getNumber() {
        return this.accountNumber;
    }

    @Override
    public String getHolderName() {
        return this.accountOwner;
    }

    @Override
    public BigDecimal getBalance() {
        return this.accountBalance;
    }

    @Override
    public boolean deposit(BigDecimal amount) {
        accountBalance.add(amount);
        return false;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        if (accountBalance.compareTo(amount) > 0) {
            return true;
        }
        return false;
    }
}
