package Linked_Lists;

class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class ListClassNode {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
//        System.out.println(a);
//        System.out.println(a.val);
//        System.out.println(b);
//        System.out.println(b.val);
////      System.out.println(a.next);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; // 10->20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50
// Printing LinkedLists
        Node temp = a;
        // Size of Linked List is 5, so loop will iterate till 5 time
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
