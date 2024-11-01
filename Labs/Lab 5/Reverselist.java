public class Reverselist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printReverse(Node node) {
        if (node == null)
            return;

        printReverse(node.next);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Reverselist list = new Reverselist();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List: ");
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("\nReversed List: ");
        list.printReverse(list.head);
    }
}