public class NLAImagecrop {
    public void extractBoundaries(int arr[][]) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("The array is empty.");
            return;}
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Boundaries:");
        System.out.print("First row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");}
        System.out.println();
        System.out.print("First column: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();
        System.out.print("Last row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[rows - 1][j] + " ");
        }
        System.out.println();
        System.out.print("Last column: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(arr[i][cols - 1] + " ");}
        System.out.println();}
    public void cropCenterPart(int arr[][]) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("The array is empty.");
            return;}
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows <= 2 || cols <= 2) {
            System.out.println("The array is too small to crop the center part.");
            return;}
        System.out.println("Center part:");
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");}
            System.out.println();        }}

    public static void main(String[] args) {
        NLAImagecrop  nlArray = new NLAImagecrop ();
        int[][] image = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20},{21, 22, 23, 24, 25}};
        nlArray.extractBoundaries(image);
        nlArray.cropCenterPart(image);}}
