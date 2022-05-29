package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class U2BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");

        int numberToPush = Integer.parseInt(line[0]);
        int numberToPop = Integer.parseInt(line[1]);
        int presentingElement = Integer.parseInt(line[2]);

        line = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numberToPush; i++) {
            numbers.push(Integer.parseInt(line[i]));
        }
        for (int j = 0; j < numberToPop; j++) {
            numbers.pop();
        }
        if (numbers.contains(presentingElement)) {
            System.out.println("true");
        } else {
            if (numbers.isEmpty()) {
                System.out.println(0);
            } else {
                numbers.stream().min(Integer::compareTo)
                        .ifPresent(System.out::println);
            }
        }
    }
}