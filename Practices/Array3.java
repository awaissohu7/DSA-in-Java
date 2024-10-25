import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int a[][]=new int[3][4];


for(int i=0;i<a.length;i++)
{
    for(int j=0;j<a.length;j++)
    {
        a[i][j]=sc.nextInt();
    }
}

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(a[i][j]+ "\n");
            }
          
       
        }










    }
}
