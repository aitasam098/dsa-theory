import java.util.Stack;

public class Reverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }

        public  int remove() {
            if (isEmpty()) {
                System.out.println("list empty");
                return-1;
            }

            int removedData = head.data;
            head = head.next;
            if (head == null) { // Queue is now empty
                tail = null;
            }
            return removedData;
        }
        public static void Reversequeue(Queue a){
             Stack<Integer> stack = new Stack<>();

             while (!a.isEmpty()) {
                stack.push(a.remove());
             }
             while (!stack.isEmpty()) {
                a.add(stack.pop());
             }
        }

        public static void print() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public static void main(String[] args) {
            Queue a = new Queue();
            a.add(29);
            a.add(28);
            a.add(27);
            a.add(26);
            a.add(24);
            a.add(23);
            a.print();
            a.remove();
            System.out.println("remove");
            a.print();
            a.Reversequeue(a);
            System.out.println("Reverse");
            a.print();
        }
    }
}
