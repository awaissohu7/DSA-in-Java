public class linkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } }

    void printListIterative() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; }
        System.out.println(); }

    void printListRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printListRecursive(node.next); }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);

        System.out.println("Iterative approach:");
        long startTimeIterative = System.nanoTime();
        list.printListIterative();
        long endTimeIterative = System.nanoTime();
        long timeTakenIterative = endTimeIterative - startTimeIterative;

        System.out.println("Recursive approach:");
        long startTimeRecursive = System.nanoTime();
        list.printListRecursive(list.head);
        long endTimeRecursive = System.nanoTime();
        long timeTakenRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("\nTime taken by iterative approach: " + timeTakenIterative + " ns");
        System.out.println("Time taken by recursive approach: " + timeTakenRecursive + " ns");

        if (timeTakenIterative < timeTakenRecursive) {
            System.out.println("Iterative approach is faster.");
        } else if (timeTakenIterative > timeTakenRecursive) {
            System.out.println("Recursive approach is faster.");
        } else {
            System.out.println("Both approaches take the same time.");
        } } }