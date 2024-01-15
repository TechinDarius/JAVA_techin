import lt.techin.darius.PhilatelistImplemented;
import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<PostStamp> poststapsmList=new ArrayList<>();

        Philatelist ph = new PhilatelistImplemented();
        PostStamp p1 = new PostStamp("pavadinimas", 1, 2);
        PostStamp p2 = new PostStamp("pavadinimas2", 1, 3);
        PostStamp p3 = new PostStamp("name3", 2, 1);
        ph.addToCollection(p1);
        ph.addToCollection(p2);
        ph.addToCollection(p3);

        System.out.println("po viena\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("visas listas\n");

        ph.printAllPostStampNames();

        System.out.println("didesne kaina nei");
        ph.printPostStampsWithPriceGreaterThan(2);
        System.out.println(ph.getAveragePostStampPrice());

    }
}