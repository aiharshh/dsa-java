package arraysInJava;
import java.util.*;
public class CopyOfArray {
	public static void main(String[] args) {
		int[] arr = {100, 25, 33, 45, 18};
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		int[] nums = arr; // This is Called as Shallow Copy	
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(nums[i] + " ");
//		}
//		This above for loop creates the copy of array which is not complete
		nums[0] = 70;
		System.out.println(arr[0]);
		int[] brr = Arrays.copyOf(arr,arr.length);
		for(int ele : brr) {
			System.out.print(ele + " ");
		}
	}
}
