package arraysInJava;
import java.util.Scanner;
public class SecondMaxElementInArrays {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Numbers of Elements : ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			System.out.print("Enter Element "+(i+1)+" : ");
//			arr[i] = sc.nextInt();
//		}	
//		int max = 0, smax = 0;
//		for(int i=0;i<n;i++) {
////			if(arr[i] > max) max = arr[i];
//			max = Math.max(max, arr[i]);
//		}
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=max) {
//				smax = Math.max(smax, arr[i]);
//			}
//		}
//		System.out.println("The Maximum Element is : "+max);
//		System.out.println("The Second Maximum Element is : "+smax);
//	}
	public static void main(String[] args) {
		int[] arr = {10, 20 ,30, 40};
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
	}
	public static void change(int[] x) {
		x[0] = 90;
	}
}
