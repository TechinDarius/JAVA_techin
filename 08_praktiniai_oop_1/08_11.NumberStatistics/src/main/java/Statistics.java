
public class Statistics {
    private int count;
    private int sum = 0, evenSum = 0, oddSum = 0;

    public Statistics() {

    }

    public void addNumber(int number) {
        this.count++;
        this.sum = this.sum + number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (1.0) * sum / getCount();
    }

    public void evenSum(int number) {
        this.evenSum += number;
    }

    public int getEvenSum() {
        return evenSum;
    }

    public void oddSum(int number) {
        this.oddSum += number;
    }

    public int getOddSum() {
        return oddSum;
    }
}
