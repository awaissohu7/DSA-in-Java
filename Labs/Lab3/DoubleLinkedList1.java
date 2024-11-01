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
            newnode.prev = null;
        }
    }

    public void insertAtBeginning(Node node) {
        if (head == null) {
            head = node;
            head.next = null;
            head.prev = null;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            head.prev = null;
        }
    }

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
            newnode.next = null;
        }
    }

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
            node.next = null;
        }
    }

    public void insertAfterName(String name, Node node) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(name)) {
                node.next = temp.next;
                node.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = node;
                }
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }

    public void insertBeforeName(String name, Node node) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(name)) {
                node.next = temp;
                node.prev = temp.prev;
                if (temp.prev != null) {
                    temp.prev.next = node;
                } else {
                    head = node;
                }
                temp.prev = node;
                return;
            }
            temp = temp.next;
        }
    }

    public void makeCircular() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;
    }

    public void printAll() {
        Node temp = head;
        while (true) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (temp == head) {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList1 dll = new DoubleLinkedList1();
        dll.insertAtEnd("Node1");
        dll.insertAtEnd("Node2");
        dll.insertAtEnd("Node3");
        dll.insertAtBeginning("Node0");
        dll.insertAfterName("Node2", new Node("Node2.5"));
        dll.insertBeforeName("Node2", new Node("Node1.5"));
        dll.makeCircular();
        dll.printAll();
    }
}

class Node {
    String data;
    Node next;
    Node prev;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}