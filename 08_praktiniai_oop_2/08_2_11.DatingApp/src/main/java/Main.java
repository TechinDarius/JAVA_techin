
public class Main {

    public static void main(String[] args) {
        // test your program here!
//        SimpleDate date1 = new SimpleDate(20, 12, 2023);
//        System.out.println(date1);
//        date1.advance();
//        System.out.println(date1);
//        date1.advance(20);
//        System.out.println(date1);

        System.out.println();
        SimpleDate date = new SimpleDate(13,2,2015);
        System.out.println("Friday of the examined week is "+ date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week =1;
        while (week <=7){
            System.out.println("Friday after "+ week + " week is "+newDate);
            newDate = newDate.afterNumberOfDays(7);
            week=week+1;
        }
        System.out.println("The date after 790 days from the examined Friday is ... "+date.afterNumberOfDays(790));

    }
}
