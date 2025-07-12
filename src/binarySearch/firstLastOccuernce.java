package binarySearch;
public class firstLastOccuernce {
	public static void main(String[] args) {
		int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40};
		int n = arr.length, lo = 0, hi = n-1;
		int target = 20;
		int fp = 0,lp = 0;
		int lb = n, ub = 0;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(arr[mid]>=target) {
				lb = Math.min(mid, lp);
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		while(lo<=hi) {
			if(arr[mid]>target) {
				ub = Math.min(ub, mid);
				lo = mid + 1;
			}
			else hi  = mid - 1;
		}
		}
		System.out.println(lb+" "+ub);
	}
}
