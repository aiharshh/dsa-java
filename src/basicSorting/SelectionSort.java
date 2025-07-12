package basicSorting;
public class SelectionSort {
	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {10, -4, 20, 1, -6, 8};
		print(arr);
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		int mindx = -1;
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min = arr[j];
					mindx = j;
				}
			}
//			Swap arr[i] with arr[mindx]
			int temp = arr[i];
			arr[i] = arr[mindx];
			arr[mindx] = temp;
		}
		print(arr);
	}
}
