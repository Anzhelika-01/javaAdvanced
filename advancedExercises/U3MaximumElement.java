package advancedExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class U3MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Deque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s");
            if (line[0].equals("1")) {
                numbers.push(Integer.parseInt(line[1]));
            } else if (line[0].equals("2")) {
                numbers.pop();
            } else {
                numbers.stream().max(Integer::compareTo)
                        .ifPresent(System.out::println);
            }
        }
    }
}