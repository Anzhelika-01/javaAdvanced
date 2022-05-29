package stacksAndQueues;

import java.util.Scanner;

public class U7SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "1":
                    text.append(command[1]);
                    break;
                case "2":
                    text.delete((text.length() -
                                    Integer.parseInt(command[1])),
                            text.length());
                    break;
                case "3":
                    System.out.println(text.charAt
                            (Integer.parseInt(command[1]) - 1));
                    break;
                default:

            }
        }
    }
}