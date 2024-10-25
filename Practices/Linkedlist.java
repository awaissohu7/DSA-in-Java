

public class Linkedlist {

    class Node{
        int data;
        Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    
    }
    
Node head;
void addfirst(int data)
{
    Node newnode= new Node(data);
    if(head==null)
    {
        head=newnode;
    }
    else {
        newnode.next=head;
        head=newnode;

    }
}




    
public static void main(String[] args) {
    
Linkedlist list= new Linkedlist();
list.addfirst(5);
list.addfirst(10);
list.addfirst(15);
list.addfirst(20);
list.addfirst(25);


list.print();



}



for()

void print(){
    
    Node c = head;
while (c != null) {
    System.out.print(c.data);
    System.out.println();
    c = c.next;
}

}
}