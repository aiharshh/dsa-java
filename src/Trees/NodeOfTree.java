package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
//         c.left = null;
        System.out.println(a.val); // 1
        System.out.println(a.left.val); // 4
        System.out.println(a.left.right.val); // 6
        System.out.println(e.val); // 6
    }
}
