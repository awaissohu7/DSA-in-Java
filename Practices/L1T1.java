import java.util.Scanner;
public class L1T1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        
        int a[]=new int[size];

        System.out.println("Enter the elements of array");
      
        for(int i=0;i<size;i++)
        {
            
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+ "   ");
        }


    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }
    }

System.out.println("The reserve array is ");
    for(int i=0;i<a.length;i++)
    
    {
        System.out.println(a[i]);
    }

    
    }
}
