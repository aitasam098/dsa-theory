class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class singleLL {
    Node head, tail;

    public void preppend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void removedublicate() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Duplicate ko hatao
            } else {
                current = current.next;
            }
        }
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

    public void getlength() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Length of list is: " + count);
    }

    public void delnode(int data) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.data==data) {
            head=head.next;
            
        }
        
        Node current1 = head;
         Node current2=head;
        while (current1 != null) {
            
            while (current2!=null) {
                if (current1.data==current2.data) {
                    current2.next=current2.next;
                }
                current2=current2.next;
            }
            current1=current1.next;
        }
        System.out.println("not found");
    }

    public void Printmiddle() {
        Node slow = head;
        Node fast = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node value is: " + slow.data);
    }

    public static singleLL reverse(singleLL list) {
        singleLL Reversedlist = new singleLL();
        Node current = list.head;
        while (current != null) {
            Reversedlist.preppend(current.data);
            current = current.next;
        }
        return Reversedlist;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static singleLL merge(singleLL list1, singleLL list2) {
        singleLL mergelist = new singleLL();
        Node current1 = list1.head;
        while (current1 != null) {
            mergelist.append(current1.data);
            current1 = current1.next;
        }
        Node current2 = list2.head;
        while (current2 != null) {
            mergelist.append(current2.data);
            current2 = current2.next;
        }
        return mergelist;
    }

    public static void main(String[] args) {
        singleLL list1 = new singleLL();
        singleLL list2 = new singleLL();

        list1.preppend(4234);
        list1.preppend(4234);
        list1.preppend(4234);
        list1.preppend(4234);
        list1.preppend(3234);
        list1.preppend(4234);
        list1.preppend(1564);
        System.out.println("******************** List 1 ********************");
        list1.printList();

        list2.preppend(8455);
        list2.preppend(7789);
        list2.preppend(6564);
        list2.preppend(5809);
        System.out.println("******************** List 2 ********************");
        list2.printList();

        singleLL Reversedlist = singleLL.reverse(list1);
        System.out.println("******************** Reverse List 1 ********************");
        Reversedlist.printList();

        singleLL reversedlist = singleLL.reverse(list2);
        System.out.println("******************** Reverse List 2 ********************");
        reversedlist.printList();

        singleLL mergelist = singleLL.merge(list1, list2);
        System.out.println("******************** Merge List ********************");
        mergelist.printList();

        System.out.println("******************** Length of List 1 ********************");
        list1.getlength();

        System.out.println("******************** Middle of List 1 ********************");
        list1.Printmiddle();

        System.out.println("******************** Remove Duplicates of List 1 ********************");
        list1.removedublicate();
        list1.printList();

        System.out.println("******************** Deleting Node  ********************");
        list1.delnode(1564);
        list1.printList();
    }
}