package lt.techin.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.IntSummaryStatistics;

import static java.util.stream.Collectors.*;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        //1 throw new UnsupportedOperationException("Not implemented");
        return numbers.stream().map(n -> (int) Math.sqrt(n)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> users) {
        return users.stream().map(User::getAge).toList();
        //2 throw new UnsupportedOperationException("Not implemented");
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().toList();
        //3 throw new UnsupportedOperationException("Not implemented");
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
        //4 throw new UnsupportedOperationException("Not implemented");
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(s -> s.getAge() > 25).count();
        //5 throw new UnsupportedOperationException("Not implemented");
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
        //6 throw new UnsupportedOperationException("Not implemented");
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
        //7 throw new UnsupportedOperationException("Not implemented");
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
        //8 throw new UnsupportedOperationException("Not implemented");
    }

    public static List<String> getFirstNames(List<String> names) {

        return names.stream().map(s -> s.split(" ")[0]).toList();
        //9 throw new UnsupportedOperationException("Not implemented");
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().toList();
        //10 throw new UnsupportedOperationException("Not implemented");
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(User::getAge).average().orElse(0);
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).max().orElse(-1);

    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().orElse(-1);
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(u -> u.getAge() == age);
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(u -> u.getAge() == age);
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(n -> n.getName() == name).findAny();
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return Stream.iterate(2, n -> n + 1).filter(n -> isPrime(n)).limit(10).toList();
        // throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return Stream.iterate(1, n -> n + 1).limit(10).toList();
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getAge)).orElse(null);
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
        //throw new UnsupportedOperationException("Not implemented");
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {

        return users.stream().collect(groupingBy(User::isMale));
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(groupingBy(User::getAge));
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(groupingBy(User::isMale, groupingBy(User::getAge)));
        //  throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(partitioningBy(User::isMale, counting()));
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
        //throw new UnsupportedOperationException("Not implemented");
    }

}
