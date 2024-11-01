
class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Utility function to pop top element from the stack and check for Stack underflow
    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        top = top.next;
    }

    // Utility function to peek top element from the stack
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}