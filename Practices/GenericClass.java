public class GenericClass<T> {

    
    public static void print(T[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
