import java.util.Scanner;
public class Search {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num[]= {10,20,30,40,50,60};
        int target=50;
        


    }


    public static int linearSearch(int num[],int target)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
