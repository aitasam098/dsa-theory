import java.util.*;

public class UndoRedo {
    static Stack<String> stack1 = new Stack<>();
    static Stack<String> stack2 = new Stack<>();

    public void add(String ch) {
        stack1.push(ch);
    }

    public void delete() {
        stack2.push(stack1.pop());
    }

    public String undo() {
        if (stack1.isEmpty()) {
            return "No action to undo";
        }
        String lastAction = stack2.pop();
        stack1.push(lastAction);
        return lastAction;
    }

    public String redo() {
        if (stack2.isEmpty()) {
            return "No action to redo";
        }
        String lastRemoveAction = stack1.pop();
        stack2.push(lastRemoveAction);
        return lastRemoveAction;
    }

    public void print() {
        if (stack1.isEmpty()) {
            System.out.println("stack empty");
            
        }
        for (String s : stack1) { // Iterate through stack1 without popping
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        UndoRedo q = new UndoRedo();
        System.out.println("Add a");
        q.add("a");
        System.out.println("add j");
        q.add("j");
        System.out.println("add r");
        q.add("r");

        q.print();
        System.out.println("del r");
        q.delete();
        q.print();
        System.out.println("undo r");

        q.undo();

        q.print();
        q.redo();
        System.out.println("redu");
        q.print();

    }
}
