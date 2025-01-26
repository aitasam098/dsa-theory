class DeleteNode {

    public static void deleteNode(SingleLinkedList list, int data) {
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }

        if (list.head.data == data) {
            list.head = list.head.next;
            System.out.println("Node with value " + data + " deleted.");
            return;
        }

        Node current = list.head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.println("Node with value " + data + " deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println("Node with value " + data + " not found.");
    }
}