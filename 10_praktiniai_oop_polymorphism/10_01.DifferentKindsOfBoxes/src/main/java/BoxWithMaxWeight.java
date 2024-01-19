import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private final int capacity;

    private int getCapacity() {
        return capacity;
    }

    private ArrayList<Item> items=new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight()+getBoxWeight() <= getCapacity()) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    public int getBoxWeight(){
        return items.stream().mapToInt(Item::getWeight).sum();
    }
}
