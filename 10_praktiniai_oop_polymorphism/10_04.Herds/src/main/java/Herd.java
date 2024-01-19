import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Herd implements Movable {

    private List<Movable> herds= new ArrayList<>();
    private int dx;
    private int dy;

    public Herd(
    ) {

    }

    public Herd(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
public void addToHerd(Organism movable){
    herds.add(movable);

}
    @Override
    public void move(int dx, int dy) {
        herds.forEach(o->o.move(dx,dy));
    }

    @Override
    public String toString() {
//        String str="";
//        for (int i = 0; i < herds.size(); i++) {
//            str+=herds.get(i)+"\n";
//        }
        //return str;
        return herds.stream().map(Movable::toString).collect(Collectors.joining("\n"));
    }
}
