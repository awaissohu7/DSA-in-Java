class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkliststack {
    private Node top;
    
    public Linkliststack() {
        this.top = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println("Inserted " + x);
    }

   
    public boolean isEmpty() {
        return top == null;
    }

  
    public int peek() {  
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }


    public void pop() { 
        if (isEmpty()) {
            System.out.println("Underflow: Stack is empty.");
            return;
        }
        System.out.println("Popped " + top.data);
        top = top.next; 
    }
}

class StackImpl {
    public static void main(String[] args) {
        Linkliststack stack = new Linkliststack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}