public class RecursionArray {
    public static void printForward(char[] arr, int index) {
        if (index < arr.length) {
             System.out.print(arr[index] + " ");
             printForward(arr, index + 1);
        } }

    public static void printReverse(char[] arr, int index) {
         if (index >= 0) {
              System.out.print(arr[index] + " ");
              printReverse(arr, index - 1);
        } }
    public static void main(String[] args) {
         char[] arr = {'a', 'b', 'c', 'd', 'e'};

          System.out.println("Printing in forward direction:");
          printForward(arr, 0);

          System.out.println("\nPrinting in reverse direction:");
          printReverse(arr, arr.length - 1);
    } }