package QueuesByRaghavSir;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);q.add(8);
        // 1 2 3 4 5 6 7 8
        int n = q.size();
        // Step 1
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        } // q -> 5 6 7 8
        // Step 2
        while(st.size()>0){
            q.add(st.pop());
        }// q -> 5 6 7 8 4 3 2 1
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        } // q -> 4 3 2 1
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        } // q ->
        while (n>0){
            st.push(q.remove());
            n--;
        } // st -> 8 5 3 7 2 6 1 5
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
        // 1 5 2  6 3 7 4 8
    }
}
