package Linked_Lists;
// User defined data type
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
// user defined data structure
class DLL{

}
public class doublyLinkedLists {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        print(temp);
        System.out.println();
    }
    public static void main(String[] args) {
        DLL list = new DLL();
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
