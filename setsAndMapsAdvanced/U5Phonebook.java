package setsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class U5Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("-");
        Map<String, String> personalInfo = new HashMap<>();

        while (!info[0].equals("search")) {
            String name = info[0];
            String number = info[1];
            info = scanner.nextLine().split("-");
            personalInfo.put(name, number);
        }
        String searchedName = scanner.nextLine();
        while (!searchedName.equals("stop")){
            if (personalInfo.containsKey(searchedName)){
                System.out.println(searchedName + " -> " + personalInfo.get(searchedName));
            }
            else {
                System.out.printf("Contact %s does not exist.\n", searchedName);
            }
            searchedName = scanner.nextLine();
        }
    }
}