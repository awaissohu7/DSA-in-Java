





public class Doubly {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
    
    
    
    
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }


void addfirst(int data)
{
    Node n = new Node(data);
    if(head==null)
    {
        head=n;
    }
    else
    {
        n.next=head;
        head=n;
        head.prev=n;
        
    }
}
void AddLast(int data){
    Node n=new Node(data);
    if(head==null){
        head=n;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;}
        temp.next=n;
        n.prev=temp;
  
    }
}
void AddMid(int pos,int data){
    Node n=new Node(data);
    if(head==null){  
        head=n;   
    }
    else{
        Node temp=head;
        int i=0;
        while(i<pos-1){
            temp=temp.next;
           i++;
        
        }
        n.next=temp.next;
        temp.next=n;
        n.prev=temp;   
       
    }
    
}
int  removefirst(){
    
    if(head==null){
        System.out.println("Empty");
    }
    else{
        head=head.next;
        head.prev=null;

    }
    return 0;
}

void removelast(){
    if(head==null){
        System.out.println("Empty");
    }
    else{
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
}
 public void print()    {
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
 }   



public static void main(String[] args) {
    Doubly d=new Doubly();
    d.addfirst(1);
    d.addfirst(2);
    d.addfirst(3);
    d.AddLast(5);
    d.AddLast(10);
    d.AddMid(2, 50);
    d.removefirst();
    d.removelast();
    d.removelast();
    d.print();
}





}
