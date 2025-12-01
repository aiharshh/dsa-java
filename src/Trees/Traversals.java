package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversals {
    static int n;
    private static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left); // q.add(front.right);
            if(front.right!=null) q.add(front.right); // q.add(front.left);
        }
        // output - 1 2 3 4 5 6
//        if we swap left with right and vice versa
        // we get the output as 1 3 2 7 6 5 4
    }
    public static void nthLevel(Node root, int level){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        nthLevel(root.left, level+1);
        nthLevel(root.right, level+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println("Preorder traversal : ");
        preorder(a);
        System.out.println();
        System.out.println("Inorder traversal : ");
        inorder(a);
        System.out.println();
        System.out.println("Postorder traversal : ");
        postorder(a);
        System.out.println();
        System.out.println("Level Order Traversal : ");
        levelOrder(a);
        System.out.println();
        System.out.print("Enter n : ");
        n = sc.nextInt();
        nthLevel(a,0);
    }
}
