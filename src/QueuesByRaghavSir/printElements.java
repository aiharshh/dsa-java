package QueuesByRaghavSir;

import java.util.*;

public class printElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
        System.out.println(q);
        // Iterates through q without removing anything
//        for (int val : q) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
        Queue<Integer> helper = new LinkedList<>();
        while(q.size()!=0){
            helper.add(q.remove());
        }
        System.out.println("Helper printing");
        System.out.println(helper);
    }
}
