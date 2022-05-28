package stacksAndQueues;

import java.util.Scanner;

public class U6RecursiveFibonacci {
    public static long[] fibMemory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibMemory = new long[n + 1];
        System.out.println(fib(n));
    }
    public static long fib(int n){
        if (n < 2){
            return 1;
        }
        if (fibMemory[n] != 0){
            return fibMemory[n];
        }
            fibMemory[n] = (fib(n - 1) + fib(n - 2));
            return fibMemory[n];
    }
}