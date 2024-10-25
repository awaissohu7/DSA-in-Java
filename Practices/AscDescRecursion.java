import java.util.Scanner;

public class AscDescRecursion {
    
   
    static void printAsc(int n) {
        if (n > 0) {
            printAsc(n - 1);
            System.out.print(n + " ");
        }
    }

   
    static void printDesc(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printDesc(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        
        System.out.println("Ascending order:");
        printAsc(n);
        
        System.out.println("\nDescending order:");
        printDesc(n);
    }
}
