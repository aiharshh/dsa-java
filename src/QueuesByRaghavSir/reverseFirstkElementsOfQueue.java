package QueuesByRaghavSir;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstkElementsOfQueue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        // k is given
        int k = 3;
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5); // 1 2 3 4 5 -> // 3 2 1 4 5
        int n = q.size();
        k = k % n;
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        for(int i=0;i<k;i++){
            q.add(st.pop());
        }
        for(int i=k;i<n;i++){
            q.add(q.poll());
        }
        System.out.print(q);
    }
}
