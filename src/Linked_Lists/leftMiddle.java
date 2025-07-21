package Linked_Lists;

public class leftMiddle {
    public Node LeftMiddleNode(Node head){
        if(head==null || head.next ==null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node p = new Node(10);
        Node q = new Node(20);
        Node r = new Node(30);
        Node s = new Node(40);
        Node t = new Node(50);
        Node u = new Node(60);
        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;
        t.next = u;
        leftMiddle leftMiddleObject = new leftMiddle();
        Node result = leftMiddleObject.LeftMiddleNode(p);
        System.out.println("The left Middle is " + result.val);
    }
}
