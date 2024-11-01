import java.util.Scanner;

public class SimpleRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Ascending order:");
        printAscending(1, n);

        System.out.println("\nDescending order:");
        printDescending(n, n); }

    public static void printAscending(int current, int n) {
        if (current <= n) {
            System.out.print(current + " ");
            printAscending(current + 1, n);
        } }

    public static void printDescending(int current, int n) {
        if (current >= 1) {
            System.out.print(current + " ");
            printDescending(current - 1, n);
        }
    }
}