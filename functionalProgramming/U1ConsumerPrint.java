package functionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class U1ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] collect = scanner.nextLine().split("\\s+");

        for (String s : collect) {
            Consumer<String> print = System.out::println;
            print.accept(s);
        }
    }
}