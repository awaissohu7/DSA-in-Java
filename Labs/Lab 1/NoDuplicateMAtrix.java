import java.util.Arrays;

class NoDuplicateMAtrix {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{1,3,5,7,9},{2,4,6,8,10}};
        int[] b = new int[20];
        int index = 0;
        System.out.println(" Before Copying Arrays: ");
        System.out.println(Arrays.deepToString(arr));
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                int value = arr[i][j];
                boolean Dup = false;
            for (int k = 0; k < index; k++) {
                    if (b[k] == value) {
                        Dup = true;
                        break;
            }}
                if (!Dup && index < b.length) {
                    b[index++] = value;}}}

        System.out.print("After Copying Arrays: ");
        for (int i = 0; i < index; i++) {
            System.out.print(b[i] + " ");
        }}}

