// ReverseList.java
class ReverseList {
    public static SingleLinkedList reverse(SingleLinkedList list) {
        SingleLinkedList reversedList = new SingleLinkedList();
        Node current = list.head;
        while (current != null) {
            reversedList.prepend(current.data);
            current = current.next;
        }
        return reversedList;
    }
}
