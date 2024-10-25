// Generic class
class GenericClass<T> {

    // Method to print array elements
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create arrays
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] stringArray = {"Hello", "World"};

        // Create GenericClass objects
        GenericClass<Integer> intGeneric = new GenericClass<>();
        GenericClass<Double> doubleGeneric = new GenericClass<>();
        GenericClass<String> stringGeneric = new GenericClass<>();

        // Print arrays using generic class
        System.out.println("Print Integers:");
        intGeneric.printArray(intArray);

        System.out.println("\nPrint Doubles:");
        doubleGeneric.printArray(doubleArray);

        System.out.println("\nPrint Strings:");
        stringGeneric.printArray(stringArray);
    }
}