package arraysInJava;
import java.util.Scanner;
public class InitialiseArray {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter Number : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		int a = arr.length;
		System.out.println("The no. of elements are : " + a);
	}
}