/*class Node <A>{
    A data;
    Node<A> next;
    Node(A data)
    {
        this.data=data;
        this.next=null;
    }
}


public class GenericList <A>{
    Node<A> head;

void addfirst(A data)
{
    Node <A> n=new Node(data);
    n.next=head;
    head=n;
}

void print()
{
    Node <A>temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}

public static void main(String[] args) {
    GenericList<Integer>    listI=new GenericList();
    GenericList<String>     listS=new GenericList();
    GenericList<Double>     listD=new GenericList();
    GenericList<Character>  listC=new GenericList();


    listI.addfirst(1);
    listI.addfirst(2);
    listI.addfirst(3);
    listI.addfirst(4);
    listI.addfirst(5);
    listI.Print();


}
}





























*/



class N<A> {
    A data;
    N<A> next;

    N(A data) {
        this.data = data;
        this.next = null;
    }
}

public class GenericList<A> {
    N<A> head;

    void addFirst(A data) {
        N<A> n = new N<>(data);
        n.next = head;
        head = n;
    }

    void print() {
        N<A> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        GenericList<Integer> listI = new GenericList<>();
        GenericList<String> listS = new GenericList<>();
        GenericList<Double> listD = new GenericList<>();
        GenericList<Character> listC = new GenericList<>();

        listI.addFirst(1);
        listI.addFirst(2);
        listI.print();
        listS.addFirst("Sohu");
        listS.print();
        
    }
}