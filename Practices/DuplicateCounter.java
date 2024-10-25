public class L1T3 {
    public static void main(String[] args) {
        
    int arr[]={21, 9, 17, 43, 9, 15, 21, 6, 38, 6};

    System.out.print("Origional array is :");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+"   ");
        }


        for(int i=0;i<arr.length;i++);

        {
          for(int j=0;j<arr.length;j++)
          {
              if()

          }
           
        }
        }
        










    }




























    
    import java.util.HashMap;
    import java.util.Map;
    
    public class DuplicateCounter {
        public static void main(String[] args) {
            // Fixed array values
            int[] arr = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
    
            System.out.println("Array values are:");
            for (int num : arr) {
                System.out.print(num + ", ");
            }
            System.out.println();
    
            int duplicateCount = countDuplicates(arr);
            System.out.println("The count of duplicate values is: " + duplicateCount);
        }
    
        public static int countDuplicates(int[] arr) {
            Map<Integer, Integer> freq = new HashMap<>();
            int count = 0;
    
            for (int num : arr) {
                if (freq.containsKey(num)) {
                    freq.put(num, freq.get(num) + 1);
                } else {
                    freq.put(num, 1);
                }
            }
    
            for (int value : freq.values()) {
                if (value > 1) {
                    count++;
                }
            }
    
            return count;
        }
    }