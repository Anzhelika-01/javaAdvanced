package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class U6PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfTheName = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());

        Predicate<String> predicate = name -> name.length() <= lengthOfTheName;

        names.stream().filter(predicate).forEach(System.out::println);
    }
}