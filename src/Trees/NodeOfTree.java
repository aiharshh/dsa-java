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
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(0);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
//         c.left = null;

        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g; e.right = h;

        System.out.println(a.val); // 1
        System.out.println(a.left.val); // 4
        System.out.println(a.left.right.val); // 6
        System.out.println(e.val); // 6
//        a.left.right.val = 60;
        System.out.println(a.left.right.val);

        display(a);
        System.out.println();
        System.out.println(sums(a));
        System.out.println(product(a));
        System.out.println(productNz(a));
        System.out.println(maximum(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(levels(a));
        int height = levels(a) - 1;
        System.out.println(height);
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left); // left subtree
        display(root.right); // right subtree

    }
    private static int sums(Node root){
        if(root==null) return 0;
        return root.val + sums(root.left) + sums(root.right);
    }
    private static int product(Node root){
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right); // 14,76,000
    }
    private static int productNz(Node root){
        if(root==null) return 1;
        int left = productNz(root.left);
        int right = productNz(root.right);

        if(root.val==0) return left * right;
        return root.val * left * right; // 14,76,000
    }

    // Maximum Value in the Tree
    private static int maximum(Node root){
        if(root==null) return 0;
        return Math.max(root.val, Math.max(maximum(root.left), maximum(root.right)));
    }
    private static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    private  static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    private static int levels(Node root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    

}
