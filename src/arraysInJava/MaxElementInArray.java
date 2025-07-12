package arraysInJava;
import java.util.Scanner;
public class MaxElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numbers of Elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter Element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}		
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The maximum Element is : "+max);
	}
}