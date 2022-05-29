package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;

public class U5BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bracket = scanner.nextLine().split("");
        Deque<String> openBracket = new ArrayDeque<>();
        boolean isBalanced = true;

        if (bracket.length % 2 == 1) {
            isBalanced = false;
        }

        for (int i = 0; i < bracket.length; i++) {
            if (bracket[i].equals("(") || bracket[i].equals("{") ||
                    bracket[i].equals("[")) {
                openBracket.push(bracket[i]);
            } else {
                if (openBracket.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                if (((Objects.equals(openBracket.peek(), "(")
                        && !(bracket[i].equals(")"))) ||
                        (Objects.equals(openBracket.peek(), "[")
                                && !(bracket[i].equals("]"))) ||
                        (Objects.equals(openBracket.peek(), "{")
                                && !(bracket[i].equals("}"))))) {
                    isBalanced = false;
                    break;
                }
                openBracket.pop();
            }
        }
        System.out.println(isBalanced && openBracket.isEmpty() ? "YES" : "NO");
    }
}