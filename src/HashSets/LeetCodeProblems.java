package HashSets;

import java.util.HashSet;

public class LeetCodeProblems {
    public static void main(String[] args) {
        int[] nums = {10,1,12,21,13,31};
        System.out.println(countDistinctIntegers(nums));
    }
    public static int reverse(int n){
        int r = 0;
        while(n!=0){
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}
