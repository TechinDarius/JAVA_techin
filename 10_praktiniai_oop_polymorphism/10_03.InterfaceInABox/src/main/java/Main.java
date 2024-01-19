
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1 = new Book("Dostoyevsjki", "Crime", 2.6);
        Book book2 = new Book("Martin", "Code", 6.3);
        Book book3 = new Book("Beck", "Test", 0.7);

        CD cd1 = new CD("Pink", "Dark", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear", 1973);
        CD cd3 = new CD("Park", "Closer", 1973);

//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);

        Box box =new Box(10);

        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);




    }

}
