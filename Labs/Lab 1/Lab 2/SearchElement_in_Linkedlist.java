


    class node {
        int data;
        node next;
        node(int data) {
        this.data = data;
        this.next = null;
        }}
        public class SearchElement_in_Linkedlist {
        node head, tail;
        void addback(int data) {
        node newNode = new node(data);
        if (head == null) {
        head = newNode;
        tail = newNode;
        } else {
        tail.next = newNode;
        tail = newNode;
        }}
        void addfront(int data) {
        node newNode = new node(data);
        newNode.next = head.next;
        head.next = newNode;
        if (tail == head) {
        tail = newNode;
        } }
        void Printlist() {
        node temp = head.next;
        while (temp != null) {
        System.out.print(" " + temp.data + " ");
        temp = temp.next;
        }
        System.out.println();
        }
        void findelement(int input) {
        int count = 1;
        node temp = head;
         while (temp.data!=input) {
        temp = temp.next;
        count++;}
        if (temp != null) { System.out.println("Index: " + count);
        } else { System.out.println("Element not found."); }}            
        
       
        public static void main(String[] args) {

            SearchElement_in_Linkedlist list = new SearchElement_in_Linkedlist();
        list.addback(10);
        list.addfront(5);
        list.addback(18);
        list.addfront(7);
        list.addback(6);
        list.addfront(4);
        list.addback(2);
        list.addfront(9);
        
        list.Printlist();
        list.findelement(6);
        }
   
        
        }
