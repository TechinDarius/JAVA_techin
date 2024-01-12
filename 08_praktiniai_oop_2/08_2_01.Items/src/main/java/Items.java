
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Name: ");
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
//            Item item = new Item(text);
//            items.add(item);
            //optimizuota
            items.add(new Item(text));
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
