public class Printpair {

    public static void printpair(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            int curr=num[i];
            for(int j=i+1;j<num.length;j++)
            {
                System.out.println("("+curr+","+num[j]+")");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int num[]={10,20,30,40,50};
        printpair(num);
    }
}
