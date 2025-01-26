public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        list.prepend(10);
        list.prepend(20);
        list.prepend(30);
        System.out.println("Original List:");
        list.printList();

        System.out.println("\nDeleting Node with value 10:");
        DeleteNode.deleteNode(list, 20);
        list.printList();

        System.out.println("\nDeleting Node with value 50 (not in list):");
        DeleteNode.deleteNode(list, 50);
        list.printList();
    }
}
