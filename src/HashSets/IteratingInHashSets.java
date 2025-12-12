package HashSets;

import java.util.HashSet;

public class IteratingInHashSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int ele : arr) System.out.print(ele+" ");
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for(int ele : set) System.out.print(ele + " ");
    }
}
