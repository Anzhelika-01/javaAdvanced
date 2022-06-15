package setsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class U2SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lengthOfFirstSet = line[0];
        int lengthOfSecondSet = line[1];
        Set<Integer> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < lengthOfFirstSet; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            firstSet.add(n);
        }

        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < lengthOfSecondSet; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            secondSet.add(n);
        }

        Set<Integer> repeatedNumbers = new LinkedHashSet<>();
        for (Integer i : firstSet) {
            if (secondSet.contains(i)) {
                repeatedNumbers.add(i);
            }
        }
        for (Integer i : repeatedNumbers){
            System.out.print(i + " ");
        }
    }
}