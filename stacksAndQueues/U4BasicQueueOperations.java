package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class U4BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        int numberToEnqueue = Integer.parseInt(line[0]);
        int numberToDequeue = Integer.parseInt(line[1]);
        int presentingElement = Integer.parseInt(line[2]);
        Deque<Integer> numbers = new ArrayDeque<>();

        line = scanner.nextLine().split("\\s+");
        for (int i = 0; i < numberToEnqueue; i++){
            numbers.add(Integer.parseInt(line[i]));
        }
        for (int i = 0; i < numberToDequeue; i++){
            numbers.poll();
        }
        if (numbers.contains(presentingElement)){
            System.out.println("true");
        }
        else if (numbers.isEmpty()){
            System.out.println(0);
        }
        else {
            numbers.stream().min(Integer::compareTo)
                    .ifPresent(System.out::println);
        }
    }
}