public class SortingAlgorithm {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            for (int i = 0; i < mid; i++) {
                left[i] = array[i]; }

            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i]; }

             mergeSort(left);
             mergeSort(right);

             merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
         int i = 0, j = 0, k = 0;
         while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } 
            else{
                array[k++] = right[j++];
            } }
        
            while (i < left.length) {
            array[k++] = left[i++];
         }
            while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1); }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3, 7, 6, 4};
        System.out.println("Original array: " + java.util.Arrays.toString(array));

        mergeSort(array);
        System.out.println("Merge sorted array: " + java.util.Arrays.toString(array));

        int[] array2 = {5, 2, 8, 1, 9, 3, 7, 6, 4};
        quickSort(array2);
        System.out.println("Quick sorted array: " + java.util.Arrays.toString(array2));
    }
}