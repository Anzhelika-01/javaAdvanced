package setsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class U4CountsSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = 0;
        Map<Character, Integer> occurrences = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            occurrences.putIfAbsent(currentChar, count);
            if (occurrences.containsKey(currentChar)) {
                occurrences.replace(currentChar,
                        occurrences.get(currentChar) + 1);
            }
        }

        for (Character key : occurrences.keySet()) {
            System.out.println(key + ": " + occurrences.get(key) + " time/s");
        }
    }
}