import java.util.Stack;
import java.util.Scanner;

public class UndoRedo {
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();
    Scanner s1 = new Scanner(System.in);

    public void insert() {
        System.out.println("Enter the text to insert:");
        String text = s1.nextLine();
        undoStack.push(text);
//        redoStack.clear();
    }
    
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
        } else {
            String text = undoStack.pop();
            redoStack.push(text);
            System.out.println("Undo successful!");
        } }
        
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo!");
        } else {
            String text = redoStack.pop();
            undoStack.push(text);
            System.out.println("Redo successful!");
        } }

        public void displayStack() {
            Stack<String> tempStack = new Stack<>();
            
            for(String element : undoStack) {
                tempStack.push(element);
            }
            
            while(!tempStack.isEmpty()) {
                System.out.print(tempStack.pop() + " ");
            }
            System.out.println();
        }
        
        
    

    public static void main(String[] args) {
        UndoRedo ur = new UndoRedo();
        while (true) {
            System.out.println("Please enter your choice: (1 for insert, 2 for undo, 3 for redo, 4 for display stack)");
            int choice = ur.s1.nextInt();
            ur.s1.nextLine();
            switch (choice) {
                case 1:
                    ur.insert();
                    break;
                case 2:
                    ur.undo();
                    break;
                case 3:
                    ur.redo();
                    break;
                case 4:
                    ur.displayStack();
                    break;
                default:
                    System.out.println("Invalid choice!");
            } } } }