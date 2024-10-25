import java.util.Scanner;

public class L1T2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
      
      
        System.out.println("Enter the size of First array");
        int size=sc.nextInt();
        
        int a[]=new int[size];


        System.out.println("Enter the elements of First array");
      
        for(int i=0;i<size;i++)
        {
            
            a[i]=sc.nextInt();

        }
    
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+ "   ");
        }

        

      

        System.out.println("\n Enter the size of Second array");
        int size2=sc.nextInt();
        
        int a2[]=new int[size2];

        System.out.println("Enter the elements of Second array");
      
        for(int i=0;i<size2;i++)
        {
            a2[i]=sc.nextInt();
        }

 
        for(int i=0;i<size2;i++)
        {
            System.out.print(a2[i]+"  ");
        }

      
        int size3=size+size2;
        int a3[]=new int[size3];


        int count =0;
        for(int i=0;i<a3.length;i++)
        {
            if(i<size)
            {
                a3[i]=a[i];
            }
            else
            {
                a3[i]=a2[count];
                count++;
            }   
        }


for (int i=0;i<a3.length;i++)
{
    System.out.print(a3[i]+"  ");
}


    }

}
