package stacksRaghavSir;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            int x = st.push(sc.nextInt());
        }
        System.out.println(st);
        // Reverse Order ->
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
//            int x = st.peek();
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> ct = new Stack<>();
        while(rt.size()>0){
//            int x = rt.peek();
            ct.push(rt.pop());
        }
        System.out.println(ct);
    }
}
