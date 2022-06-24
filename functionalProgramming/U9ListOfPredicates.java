package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class U9ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream
                        (scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> predicate = n -> {
                for (Integer number : numbers) {
                    if (n % number != 0){
                        return false;
                    }
                }
                return true;
        };
        for (int i = 1; i <= range; i++) {
            if (predicate.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}