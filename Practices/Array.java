public class Array {
    
void bublesort(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-1;j ++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
    }
}


void selectionsort(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        int min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
        int temp;
        temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }

}


void insertionsort(int arr[])
{
    for(int i=1;i<arr.length;i++)
    {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}

public static void main(String[] args) {
    int arr[]={3,7,2,0};

    Array a=new Array();
    a.insertionsort(arr);
   
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }



}
}