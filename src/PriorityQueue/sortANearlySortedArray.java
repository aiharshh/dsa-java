package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class sortANearlySortedArray {
    public static int[] sortArray(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            pq.offer(nums[i]);

            if (pq.size() > k + 1) {
                ans.add(pq.poll());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 2, 8, 10 ,9};
        int k = 3;
        int[] arr = sortArray(nums, k);
        System.out.println(Arrays.toString(arr));
    }
}
