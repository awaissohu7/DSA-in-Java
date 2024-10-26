public class EvenOdd {

public static void main(String[] args) {

    int[] a = {3, 2, 5, 1, 6, 7, 3, 8, 4, 9};
    int size = 0;
    int temp;

    System.out.println(" Before Arranging ");
    System.out.println(Arrays.toString(a));

    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 1) {
            temp = a[size];
            a[size] = a[i];
            a[i] = temp;
            size++;
        }
    }

    System.out.println(" After Arranging ");
    System.out.println(Arrays.toString(a));


}



}




