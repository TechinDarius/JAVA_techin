public class Book implements Packable {
    private String autor;
    private String nameOfTheBook;
    private double weightOfTheBook;

    public Book(String autor, String nameOfTheBook, double weightOfTheBook) {
        this.autor = autor;
        this.nameOfTheBook = nameOfTheBook;
        this.weightOfTheBook=weightOfTheBook;
    }

    @Override
    public double weight() {
        return this.weightOfTheBook;
    }

    @Override
    public String toString() {
        return autor + ": " + nameOfTheBook;
    }
}
