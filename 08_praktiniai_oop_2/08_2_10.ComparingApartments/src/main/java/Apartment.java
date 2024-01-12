
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public int getArea() {
        return squares;
    }

    public int getRooms() {
        return rooms;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
            return compared.getArea()<this.getArea();
    }
    public int priceDifference(Apartment compared){
        int difference=0;
        difference=this.getPrincePerSquare()*this.getArea()-compared.getPrincePerSquare()*compared.getArea();
        return difference<0?difference*(-1):difference;
    }

    public boolean moreExpensiveThan(Apartment compared){
        return this.getPrincePerSquare()*this.getArea()-compared.getPrincePerSquare()*compared.getArea()>0;
    }



}
