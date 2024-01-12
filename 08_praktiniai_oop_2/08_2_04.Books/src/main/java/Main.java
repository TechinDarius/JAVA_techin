import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()){break;}
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scan.nextLine());
            books.add(new Book(title,pages,year));
        }
        System.out.println("What information will be printed? ");
        String print= scan.nextLine();
        for (Book book:books){
            if (print.equals("everything")){
                System.out.println(book);
            }else {
                System.out.println(book.getBookName());
            }
        }

    }
}
