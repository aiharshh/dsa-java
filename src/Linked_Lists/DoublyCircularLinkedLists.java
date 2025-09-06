package Linked_Lists;

class DCNode{
    int val;
    DCNode next;
    DCNode prev;
    DCNode(int val){
        this.val = val;
    }
}
class DCLL{
    public DCNode head;
    public DCNode tail;
    int size = 0;

    void display(){
        DCNode temp = head;
        while(true){
            System.out.print(temp.val+ " ");
            if(temp.next==head) break;
            temp = temp.next;
        }
    }
    void insertAtHead(int val){
        DCNode temp = new DCNode(val);
        if(head==null && tail==null){
            head = tail = temp;
        }
        else{
            head.prev = temp;
            tail.next = temp;
            head = temp;
        }
    }
    void insertAtTail(int val){
        DCNode temp = new DCNode(val);
        if(head==null && tail==null){
            head = tail = temp;
        }
        else{
            head.prev = temp;
            tail.next = temp;
            head = temp;
        }
    }

}

public class DoublyCircularLinkedLists {
    public static void main(String[] args) {
        DCLL list = new DCLL();
        list.insertAtHead(30);
        list.display();
        list.insertAtHead(20);
        list.display();
        list.insertAtHead(10);
        list.display();
    }
}
