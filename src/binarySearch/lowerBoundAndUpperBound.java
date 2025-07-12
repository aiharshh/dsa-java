package binarySearch;
public class lowerBoundAndUpperBound {
	public static void main(String[] args) {
		int[] arr = {10,20,30,30,40,50,60,70}; 
		// Sorted Array for Binary Search!
		int n = arr.length;
		int lo = 0, hi = n-1;
		int x = 3;
		int lb = n, ub = n;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
//			Lower Bound
			if(arr[mid]>=x) {
				lb = Math.min(lb,mid);
//				lb = mid;             Ye kar sakte hai but we avoid it!
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
//			Upper Bound
			if(arr[mid]>x) {
				ub = Math.max(ub,mid);
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		}
		System.out.print(lb+"\n"+ub);
	}
}
