class MergeLists {
    public static SingleLinkedList merge(SingleLinkedList list1, SingleLinkedList list2) {
        SingleLinkedList mergedList = new SingleLinkedList();
        Node current1 = list1.head;
        while (current1 != null) {
            mergedList.append(current1.data);
            current1 = current1.next;
        }
        Node current2 = list2.head;
        while (current2 != null) {
            mergedList.append(current2.data);
            current2 = current2.next;
        }
        return mergedList;
    }
}