package arraysInJava;
public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		int n = arr.length;
		System.out.println();
		int i=0, j = n-1;
		while(i<=j) {
			swap(arr,i,j);
			i++;
			j--;
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]  =temp;
	}
}
