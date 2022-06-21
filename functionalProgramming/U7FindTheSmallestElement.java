package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class U7FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if (!numbers.isEmpty()) {
            Function<List<Integer>, Integer> findTheSmallest =
                    element -> element.lastIndexOf(element.stream().mapToInt(e -> e)
                            .min().getAsInt());
            System.out.println(findTheSmallest.apply(numbers));
        }
    }
}