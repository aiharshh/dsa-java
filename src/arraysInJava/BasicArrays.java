package arraysInJava;
import java.util.Scanner;
public class BasicArrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[7];
		System.out.print("Enter Numbers : ");
		for(int i=0;i<7;i++) {
			arr[i] = sc.nextInt();
		}
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
		
		
//		System.out.println(arr[0] + " ");
//		System.out.println(arr[1] + " ");
//		System.out.println(arr[2] + " ");
//		System.out.println(arr[3] + " ");
//		System.out.println(arr[4] + " ");
//		System.out.println(arr[5] + " ");
//		System.out.println(arr[6] + " ");
		
		for(int i=0;i<7;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
