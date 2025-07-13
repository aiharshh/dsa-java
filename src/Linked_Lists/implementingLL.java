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
    public static void main(String[] args) {
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
        list.display();
//        System.out.println();
        list.size();
    }
}
