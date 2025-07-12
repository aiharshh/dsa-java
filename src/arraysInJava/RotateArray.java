package arraysInJava;
import java.util.Scanner;
public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter no of Elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Elements: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Rotate Array by ?: ");
		int k = sc.nextInt();
		System.out.println();
		for(int i=0,j=n-k-1;i<=j;i++,j--) {
			swap(arr,i,j);
			i++;
			j--;
		}
		for(int i=n-k,j=n-1;i<=j;i++,j--) {
			swap(arr,i,j);
		}
		for(int i=0,j=n-1;i<=j;i++,j--) {
			swap(arr,i,j);
		}
		System.out.println();
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]  = temp;
	}
}
