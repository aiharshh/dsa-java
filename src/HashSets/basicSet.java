package HashSets;

import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println(set + "\n Size of Set is  " + set.size());
        set.remove(100);
        System.out.println(set);

        Object[] arr = set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
