public class CD implements Packable {
    private String artist;
    private String nameOfCD;
    private int year;
    private double weightOfCD = 0.1;


    public CD(String artist, String nameOfCD, int year) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.year = year;
        double weightOfCD;
    }

    @Override
    public double weight() {
        return this.weightOfCD;
    }

    @Override
    public String toString() {
        return artist + ": " + nameOfCD + " (" + year + ")";
    }
}
