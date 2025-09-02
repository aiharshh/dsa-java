package Linked_Lists;

// User defined data type
class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode(int val) {
        this.val = val;
    }
}

// user defined data structure
class DLL {
    public dNode head;
    public dNode tail;
    int size = 0;

    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val) {
        dNode temp = new dNode(val);
        if (head == null && tail == null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            tail.next = null;
        }
        size++;
    }

    void insertAtHead(int val) {
        dNode temp = new dNode(val);
        if (head == null && tail == null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
            head.prev = null;
        }
        size++;
    }

    void insert(int idx, int val) {
        dNode temp = new dNode(val);
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }

        dNode x = head;
        for (int i = 0; i < idx - 1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;
        size++;
    }
}

public class doublyLinkedLists {
    public static void print(dNode head) {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverse(dNode tail) {
        dNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display(dNode node) {
        dNode temp = node;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        print(temp);
        System.out.println();
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(50);
        list.display();
        System.out.println(list.size);
        list.insert(2, 80);
        list.display();
        list.insert(2, 70);
        list.display();
        list.insert(0, 90);
        list.display();
        list.insert(8, 99);
        list.display();
//        dNode a = new dNode(10);
//        dNode b = new dNode(20);
//        dNode c = new dNode(30);
//        dNode d = new dNode(40);
//        a.next = b; a.prev = null;
//        b.next = c; b.prev = a;
//        c.next = d; c.prev = b;
//        d.next = null; d.prev = c;
//        print(a);
//        printReverse(d);
//        display(c);
    }
}
