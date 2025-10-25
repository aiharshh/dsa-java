package QueuesByRaghavSir;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class basicsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        // We can even do poll() instead of remove()
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        // element() is same as peek()
        System.out.println(q.element());

    }
}
