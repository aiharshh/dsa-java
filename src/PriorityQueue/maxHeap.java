package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class maxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        pq.add(10);
        pq.add(1);
        pq.remove();
        pq.add(0);
        pq.add(4);
        System.out.println(pq);
    }
}
