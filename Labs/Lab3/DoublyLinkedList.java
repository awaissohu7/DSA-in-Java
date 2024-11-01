public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;}

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;}}

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;}}

    public void removeFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;}}

    public void removeFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;}
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;}}

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;}
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;}
        System.out.println("null");}

    private static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;}}

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Inserting elements at the beginning:");
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.printList();

        System.out.println("\nInserting elements at the end:");
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.printList();

        System.out.println("\nRemoving element from the beginning:");
        list.removeFromBeginning();
        list.printList();

        System.out.println("\nRemoving element from the end:");
        list.removeFromEnd();
        list.printList();

        System.out.println("\nRemoving more elements from the beginning and end:");
        list.removeFromBeginning();
        list.removeFromEnd();
        list.printList();

        System.out.println("\nRemoving the last element:");
        list.removeFromEnd();
        list.printList();
    }
}