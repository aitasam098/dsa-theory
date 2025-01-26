class SingleLinkedList {
    Node head, tail;

    public void prepend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void append(int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
