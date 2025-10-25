package QueuesByRaghavSir;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(1);q.add(2);q.add(3);q.add(4);
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
