package lt.vtmc.praktiniai.users;

import javax.swing.plaf.UIResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) count++;
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        int ageSum = 0;
        int count = 0;
        for (User user : users) {
            ageSum += user.getAge();
            count++;
        }
        return (1.0) * ageSum / count;
    }

    public static Integer getMinAge(List<User> users) {
        int ageMin = Integer.MAX_VALUE;
        for (User user : users) {
            if (user.getAge() < ageMin) {
                ageMin = user.getAge();
            }
        }
        return ageMin;
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {
        Collections.sort(users, new AgeComparator());
        return users;
    }

    public static User findOldest(List<User> users) {
        int minAge = Integer.MAX_VALUE;
        for (User user : users) {
            if (user.getAge() < minAge) {
                return user;
            }
        }
        return null;
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }

}
