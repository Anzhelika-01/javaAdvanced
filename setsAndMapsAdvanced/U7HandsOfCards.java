package setsAndMapsAdvanced;

import java.util.*;

public class U7HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(": ");
        Map<String, Integer> personalInfo = new LinkedHashMap<>();
        Map<String, Set<String>> personalCards = new LinkedHashMap<>();
        String name;

        while (!input[0].equals("JOKER")) {
            name = input[0];
            String[] card = input[1].split(", ");
            Set<String> cards = new HashSet<>(List.of(card));

            if (personalCards.containsKey(name)) {
                personalCards.get(name).addAll(cards);
            }

            personalCards.putIfAbsent(name, cards);
            input = scanner.nextLine().split(": ");
        }

        for (var player : personalCards.entrySet()) {
            String playerName = player.getKey();
            int power = 0;
            for (String s : player.getValue()) {
                int currentPower = 0;

                currentPower = powerOfTheCard(s, currentPower);
                power += currentPower;
            }
            personalInfo.put(playerName, power);
        }

        for (String key : personalInfo.keySet()) {
            System.out.println(key + ": " + personalInfo.get(key));
        }
    }

    private static int powerOfTheCard(String s, int currentPower) {
        if (s.charAt(0) == '1' && s.charAt(1) == '0') {
            currentPower += 10;
        } else if (Character.isDigit(s.charAt(0))) {
            currentPower += Integer.parseInt(String.valueOf(s.charAt(0)));
        } else if (s.charAt(0) == 'J') {
            currentPower += 11;
        } else if (s.charAt(0) == 'Q') {
            currentPower += 12;
        } else if (s.charAt(0) == 'K') {
            currentPower += 13;
        } else if (s.charAt(0) == 'A') {
            currentPower += 14;
        }
        return typeOfTheCard(s, currentPower);
    }

    private static int typeOfTheCard(String s, int currentPower) {
        if (s.charAt(1) != '0') {
            switch (s.charAt(1)) {
                case 'S':
                    currentPower *= 4;
                    break;
                case 'H':
                    currentPower *= 3;
                    break;
                case 'D':
                    currentPower *= 2;
                    break;
            }
        } else {
            switch (s.charAt(2)) {
                case 'S':
                    currentPower *= 4;
                    break;
                case 'H':
                    currentPower *= 3;
                    break;
                case 'D':
                    currentPower *= 2;
                    break;
            }
        }
        return currentPower;
    }
}