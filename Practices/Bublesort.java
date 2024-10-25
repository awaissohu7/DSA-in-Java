import java.util.Scanner;


public class Bublesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int marks[]=new int[5];
            
        System.out.println("Enter your marks for English");
        marks[0]=sc.nextInt();
        System.out.println("Enter your marks for mathematics");
        marks[1]=sc.nextInt();
        System.out.println("Enter your marks for DSA");
        marks[2]=sc.nextInt();
        System.out.println("Enter your marks for physics");
        marks[3]=sc.nextInt();
        System.out.println("Enter your marks for chemistry");
        marks[4]=sc.nextInt();


            for(int i=0;i<marks.length;i++)
            {
                for(int j=0;j<marks.length-1-i;j++)
            {
                
                if(marks[j]>marks[j+1])
                {
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
          
                
            }
          
            }
            
            
            for(int i=0;i<marks.length;i++)
            {
                System.out.println(marks[i]);
            }










    }
}
