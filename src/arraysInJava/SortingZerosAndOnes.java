package arraysInJava;
public class SortingZerosAndOnes {
	public static void main(String[] args) {
		int[] arr = {0,0,0,1,1,1};
		int n = arr.length;
//		int noOfZeros = 0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]==0) noOfZeros++;
//		}
//		for(int i=0;i<n;i++) {
//			if(i<noOfZeros) arr[i] = 0;
//			else arr[i] = 1;
//		}
//		for(int ele : arr) {
//			System.out.print(ele+" ");
//		}
//		
		// METHOD - 2
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]==0) i++;
			else if(arr[j]==1) j--;
			//if(i>j) break;
			else if(arr[i]==1 && arr[j]==0) {
				arr[i] = 0;
				arr[j] = 1;
				i++;
				j--;
			}
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}