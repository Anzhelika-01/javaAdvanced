package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class U4AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream
                        (scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    UnaryOperator<List<Integer>> addNums =
                            element -> element.stream().map(el -> el + 1)
                                    .collect(Collectors.toList());
                    numbers = addNums.apply(numbers);
                    break;
                case "print":
                    Consumer<Integer> printNums = element
                            -> System.out.printf("%d ", element);
                    numbers.forEach(printNums);
                    System.out.println();
                    break;
                case "multiply":
                    UnaryOperator<List<Integer>> multiplyNums = element ->
                            element.stream().map(el -> el * 2)
                                    .collect(Collectors.toList());
                    numbers = multiplyNums.apply(numbers);
                    break;
                case "subtract":
                    UnaryOperator<List<Integer>> subtractNums = element ->
                            element.stream().map(el -> el - 1)
                                    .collect(Collectors.toList());
                    numbers = subtractNums.apply(numbers);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}