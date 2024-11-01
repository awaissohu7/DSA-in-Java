public class CycleDetector {
    public boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;}}

        return false;}
    public static void main(String[] args) {
        
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        CycleDetector detector = new CycleDetector();
        System.out.println("Has cycle: " + detector.hasCycle(node1));

        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node5.next = node6;
        node6.next = node7;

        System.out.println("Has cycle: " + detector.hasCycle(node5)); }}

    