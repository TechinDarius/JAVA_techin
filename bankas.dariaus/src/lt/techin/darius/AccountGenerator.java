package lt.techin.darius;

import java.util.*;


public class AccountGenerator {
    public static List<String> list = new ArrayList<>();

    public static String addAccountNumber() {
        String number;
        while (true) {
            number = generateAccountNumber();
            if (list.contains(number)) {
                list.add(number);
                break;
            }
        }return number;
    }

    public static String generateAccountNumber() {
        Random random = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }


}
