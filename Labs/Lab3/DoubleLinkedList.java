public class DoubleLinkedList {
    Node head;
    public void insertAtBeginning(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
            head.next = null;
            head.prev = null;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
            newnode.prev = null;}}
     
    public void insertAtBeginning(Node node) {
        if (head == null) {
            head = node;
            head.next = null;
            head.prev = null;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            head.prev = null;}}
     
    public void insertAtEnd(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
            head.next = null;
            head.prev = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
            newnode.next = null;}}

    public void insertAtEnd(Node node) {
        if (head == null) {
            head = node;
            head.next = null;
            head.prev = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            node.next = null;}}
    
    public void insertAfterName(String name, Node node) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
            head.next = node;
            head.prev = null;
            node.prev = newnode;
            node.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;}
            temp.next = newnode;
            newnode.next = node;
            node.prev = newnode;
            newnode.prev = temp;
            node.next = null;}}
    
    public void insertBeforeName(String name, Node node) {
        Node newnode = new Node(name);
        if (head == null) {
            head = node;
            head.next = newnode;
            head.prev = null;
            newnode.prev = node;
            newnode.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;}
            temp.next = node;
            node.next = newnode;
            node.prev = temp;
            newnode.prev = node;
            newnode.next = null;}}
     
    public void makeCircular() {
        if (head == null) {
            throw new RuntimeException("There is no list");}
    
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;}
        temp.next = head; 
        head.prev = temp;}
    
    public void printAll() {
        if (head == null) {
            System.out.println("List is empty");
            return;}

        Node temp = head;
        do {
            System.out.print(temp.name + " ");
            temp = temp.next;
        } while (temp != head && temp != null);
        System.out.println();}
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtBeginning("Adil");
        dll.insertAtBeginning("Asad");
        dll.insertAtBeginning("Imran");
        dll.insertAtBeginning("Taha");
        dll.printAll();}} 
