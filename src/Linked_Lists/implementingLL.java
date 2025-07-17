package Linked_Lists;
import java.util.Scanner;
//class Node{
//    int val;
//    Node next;
//    Node(int val) {
//        this.val = val;
//    }
//}
class SLL{
    private Node head;
    private Node tail;
    private int size = 0;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null && tail==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null && tail==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
//            return;
        }
        if(idx==size){
            insertAtEnd(val);
//            return;
        }
        if(idx>size){
            System.out.println("Index greater than Size of LL");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=0;i<idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void deleteAtHead(int idx){


    }
    int get(int idx) throws Exception{
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
//            System.out.println("Not Possible!");
//            return -1;
            throw new Exception("Invalid Index");
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        if(idx==size-1) tail.val = val;
        if(idx<0 || idx>size) System.out.println("Invalid Index");
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Length of Linked List is : "+size);
    }
}
public class implementingLL {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.size();
        list.display();
//        System.out.println();
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display(); // 50 40 10 20 30
//        System.out.println();
        list.size();
        list.insert(2,100); // 50 40 100 10 20 30
        list.display();
        list.insert(4,80);
        list.display();
        list.insert(10,63);
        list.display();
        System.out.println(list.get(4));
        list.set(2, 45);
        list.display();
    }
}
