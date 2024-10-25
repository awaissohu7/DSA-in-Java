public class ArrayPAssbyReference {
    



static void update(int marks[])
{
    for(int i=0;i<marks.length;i++)
    {
        marks[i]=marks[i]+1;
    }
}

 

public static void main(String[] args) {
   int marks[]={10,15,20}; 

   System.out.println("ORIGIONAL");

 for(int i=0;i<marks.length;i++)
 {
    System.out.println(marks[i]);
 }

 update(marks);

 System.out.println("After Pass by reference ");
 for(int i=0;i<marks.length;i++)
 {
    System.out.println(marks[i]);
 }





}
}
