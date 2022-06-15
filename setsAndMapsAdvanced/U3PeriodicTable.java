package setsAndMapsAdvanced;
import java.util.*;

public class U3PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(elements));
        }
        System.out.print(String.join(" ", chemicalElements));
    }
}