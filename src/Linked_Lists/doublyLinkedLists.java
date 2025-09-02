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

    void deleteAtHead(){
        if(head==null){
            System.out.println("Can't delete when Linked Lists is Empty");
            return;
        }
        if(head==tail){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail(){
        if(tail==null){
            System.out.println("Can't delete when Linked List is Empty");
            return;
        }
        if(head==tail){
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void delete(int idx){
        if(idx>=size || idx<0){
            System.out.println("Index doesn't exist in Linked Lists");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        dNode a = head;
        for(int i=0;i<idx-1;i++){
            a = a.next;
        }
        dNode b = a.next.next;
        a.next = b;
        b.prev = a;
        size--;
    }

    void get(int idx){
        dNode t = head;
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            System.out.println("The value at head "+ head.val);
            return;
        }
        if(idx==size-1){
            System.out.println("The value at tail "+ tail.val);
            return;
        }
        for(int i=0;i<idx;i++){
            t = t.next;
        }
        System.out.println("The value at Index "+idx+" is "+t.val);
    }
    void set(int idx, int val){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){ head.val = val; return; }
        if(idx==size-1){ tail.val = val; return; }
        dNode temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        temp.val = val;
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
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
        list.deleteAtTail();
        list.display();
        list.delete(2);
        list.display();
        System.out.println(list.size);
        list.get(2);
        list.get(0);
        list.get(4);
        list.set(2, 100);
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
