package binarySearch;
public class basicBinarySearch {
	public static void main(String[] args) {
		int[] arr = {10,15,21,34,81,105,180,500,614};
		int n = arr.length;
		int index = -1;
		boolean flag = false;
		int lo = 0, hi = n-1;
		int target = 180;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]<target) {
				lo = mid + 1;
			}
			else if(arr[mid]>target){
				hi = mid - 1;
			}
			else if(arr[mid]==target) {
				flag = true;
				index = mid;
				break;
			}
		}
		if(flag == true) System.out.print("Element Found at Index "+index);
		else System.out.println("Element not found");
	}
}
