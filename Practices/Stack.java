public class Stack {
    int arr[]=new int[5];
    int tos=-1;
 
 
    void push( int data)
   {

  
    
    if(tos>=4){

       System.out.println("Sorry stack is full ");

    }
      
    else{
       arr[++tos]=data;
       System.out.println(data);
      
    }
   }



   int pop()
   {
    if(tos==-1)
    {
        System.out.println("Stack is already empty");
    }
    else{
        return arr[tos--];
    }
   }
   

   

   
    public static void main(String[] args) {
    Stack s=new Stack();
  
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);

















    }

}
