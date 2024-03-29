
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(addition.euros() + euros, addition.cents() + cents);
    }

    public boolean lessThan(Money compared) {
        if (compared.euros() > euros) {
            return true;
        }
        if (compared.euros() == euros) {
            return compared.cents() > cents();
        }
        return false;
    }

    public Money minus(Money decreaser) {
//        if (decreaser.euros() - euros > 0) {
//            return new Money(0, 0);
//        }
        if (cents-decreaser.cents() < 0) {
            return new Money(this.euros - decreaser.euros() - 1, (100 - decreaser.cents()+cents));
        }
        Money newMoney = new Money(euros - decreaser.euros(), cents - decreaser.cents());
        return newMoney.euros() < 0 || newMoney.cents() < 0 ? new Money(0, 0) : newMoney;
    }

}
