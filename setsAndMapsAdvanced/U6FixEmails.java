package setsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U6FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("uk$|us$|com$"
                , Pattern.CASE_INSENSITIVE);
        Map<String, String> info = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (!matcher.find()) {
                info.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (String key : info.keySet()){
            System.out.println(key + " -> " + info.get(key));
        }
    }
}