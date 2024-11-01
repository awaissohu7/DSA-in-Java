// Implement Queue using two stacks
// Implement Queue using two stacks
class Queue {
    private Stack s1, s2;

    // Constructor
    Queue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    // Enqueue an item to the queue
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue an item from the queue
    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };
        Queue q = new Queue();
        // insert above keys
        for (int key : keys) {
            q.enqueue(key);
        }
        System.out.println(q.dequeue()); // print 1
        System.out.println(q.dequeue()); // print 2
    }
}