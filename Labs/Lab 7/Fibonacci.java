import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        iterativeFibonacci(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Iterative approach took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        recursiveFibonacci(n);
        endTime = System.currentTimeMillis();
        System.out.println("Recursive approach took " + (endTime - startTime) + " milliseconds");
    }

    public static void iterativeFibonacci(int n) {
        int t1 = 0, t2 = 1;
        System.out.print("Iterative Fibonacci Series: ");
        for (int i = 1; i <= n+1; ++i) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum; }
        System.out.println(); }

    public static void recursiveFibonacci(int n) {
        System.out.print("Recursive Fibonacci: ");
        for (int i = 0; i <= n; ++i) {
            System.out.print(fib(i) + " + ");
        }
        System.out.println();
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        } } }