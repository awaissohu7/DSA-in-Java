import java.util.Scanner;
public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int start, int end) {
       
        if (start >= end) { return true; }

        if (str.charAt(start) != str.charAt(end)) { return false; }

        return isPalindrome(str, start + 1, end - 1); }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s1.nextLine();
        System.out.println(isPalindrome(str));
    }
}