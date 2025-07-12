package basicSorting;
public class insertionSort {
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,1,4,2};
		int n = arr.length;
		for(int i=1;i<n;i++) {
			for(int j=i;j>=1;j--) {
		  		if(arr[j]<arr[j-1]) {
		  			swap(arr, j, j-1);
//					int temp = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = temp;
				}
		  		else break;
			}
		}
		print(arr);
	}
}
