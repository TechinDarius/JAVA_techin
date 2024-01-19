import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> items = new ArrayList<>();

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item) {
        if (weight() + item.weight() < maxCapacity) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        return items.stream().mapToDouble(Packable::weight).sum();
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
