import java.util.Scanner;
public class binaryconversion {

    public static String DecimalToBinary(int num) {
        
        if (num == 0 || num == 1) {
            return String.valueOf(num);
         } else {
            return DecimalToBinary(num / 2) + (num % 2);
        } }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a number");
        int decimalNumber=s1.nextInt();
        String binaryEquivalent = DecimalToBinary(decimalNumber);
        System.out.println("The binary equivalent of " + decimalNumber + " is " + binaryEquivalent);
    }
}