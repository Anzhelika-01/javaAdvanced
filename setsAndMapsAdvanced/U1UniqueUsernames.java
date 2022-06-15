package setsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class U1UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = Integer.parseInt(scanner.nextLine());
        Set<String> words = new LinkedHashSet<>();

        for (int i = 0; i < numberOfWords; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }
        words.forEach(System.out::println);
    }
}