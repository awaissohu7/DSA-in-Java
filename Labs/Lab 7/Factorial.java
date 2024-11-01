import java.util.Scanner;
public class Factorial {
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter any number for Factorial");
        int n=s1.nextInt();

        long startTimeIterative = System.currentTimeMillis();
        long resultIterative = factorialIterative(n);
        long endTimeIterative = System.currentTimeMillis();
        System.out.println("Iterative approach: Factorial of " + n + " is " + resultIterative);
        System.out.println("Time taken (iterative): " + (endTimeIterative - startTimeIterative) + " MilliSeconds");

        long startTimeRecursive = System.currentTimeMillis();
        long resultRecursive = factorialRecursive(n);
        long endTimeRecursive = System.currentTimeMillis();
        System.out.println("Recursive approach: Factorial of " + n + " is " + resultRecursive);
        System.out.println("Time taken (recursive): " + (endTimeRecursive - startTimeRecursive) + " MilliSeconds");
    }
}