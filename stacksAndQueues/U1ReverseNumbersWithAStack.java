package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class U1ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> num = new ArrayDeque<>();

        for (String number : numbers) {
            num.push(Integer.parseInt(number));
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.print(num.pop() + " ");
        }
    }
}