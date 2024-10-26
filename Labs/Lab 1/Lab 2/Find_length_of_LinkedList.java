


    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }}
        public class Find_length_of_LinkedList {
        Node head, tail;
    
        void addback(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }    }
    
        void addfront(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }    }
    
        void Printlist() {
                Node temp = head;
            while (temp != null) {
                System.out.print(" " + temp.data + " ");
                temp = temp.next;
            }        System.out.println();}
    
        void findlength() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }        System.out.println("Length Of List: " + count);}}
    class Man {
        public static void main(String[] args) {
            Find_length_of_LinkedList list = new Find_length_of_LinkedList();
            list.addback(10);
            list.addfront(5);
            list.addback(18);
            list.addfront(7);
            list.addback(6);
            list.addfront(4);
            list.addback(2);
            list.addfront(9);
    
            list.Printlist();
            list.findlength();}}


