package functionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class U10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream
                (scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        Predicate<String> predicate = null;

        while (!line.equals("Party!")){
            String[] commands = line.split("\\s+");
            String operation = commands[0];
            String condition = commands[1];

            switch (operation){
                case "Remove":
                    predicate = getStringPredicate(predicate, commands, condition);
                    names.removeIf(predicate);
                    break;
                case "Double":
                    List<String> peopleToAddAgain = new ArrayList<>();
                    predicate = getStringPredicate(predicate, commands, condition);
                    names.stream()
                            .filter(predicate)
                            .forEach(peopleToAddAgain::add);
                    names.addAll(peopleToAddAgain);
            }
            line = scanner.nextLine();
        }
        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }
        else {
            Collections.sort(names);
            String result = String
                    .join(", ", names) + " are going to the party!";
            System.out.println(result);
        }
    }

    private static Predicate<String> getStringPredicate(Predicate<String> predicate, String[] commands, String condition) {
        switch (condition){
            case "StartsWith":
                predicate = s -> s.startsWith(commands[2]);
                break;
            case "EndsWith":
                predicate = s -> s.endsWith(commands[2]);
                break;
            case "Length":
                predicate = s -> s.length() == Integer.parseInt(commands[2]);
                break;
        }
        return predicate;
    }
}