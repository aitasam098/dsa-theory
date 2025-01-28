public class Queue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queu {
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

        public static int minqueue() {
            if (isEmpty()) {
                System.out.println("is empty");
            }
            Node current = head;
            int min = head.data;
            while (current != null) {
                if (current.data < min) {
                    min = current.data;
                }
                current = current.next;

            }
            return min;
        }

    }

    public static void main(String args[]) {
        Queu q = new Queu();
        q.add(23);
        q.add(33);
        q.add(56);
        q.add(4);
        q.add(3);

        System.out.println("Minimum value in the queue: " + q.minqueue());

    }
}