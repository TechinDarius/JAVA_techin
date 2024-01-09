package dariaus;

public class Account {
    private String id, name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (balance >= amount) {
            this.balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }


//    public int transferTo(Account another, int amount) {
//        if (this.balance >= amount) {
//            this.balance -= amount;
//            another.balance += amount;
//        } else {
//            System.out.println("Amount exceeded balance");
//        }
//        return this.balance;
//    }
    // veikia bet pabandysiu kitu budu

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.credit(amount);
            this.debit(amount);
        } else {
            System.out.println("\nAmount exceeded balance\n");

        }
        return this.balance;
    }

    public String toString() {
        return "Account [id= " + getID() + ", name= " + getName() + ", balance= " + balance + "]";
    }
}
