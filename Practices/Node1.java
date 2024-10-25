public class Node1 {
    
    int data;
    Node next;

public Node(int data)
{
    this.data=data;
    this.next=null;
}

}

class Linklist{

    public Node head;
    public Node tail;


void addfirst(int data)
{
    Node n= new Node(data);

    if(head==null){
        head=tail=n;
        return;
    }
n.next=head;
head=n;
}

public static void main(String[] args) {
    
    addfirst();
}


}