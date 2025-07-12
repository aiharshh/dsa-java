package arraysInJava;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numbers of Elements : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter Element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter number to find in Array : ");
		int x = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<n;i++) {
			if(arr[i] == x)
			flag = true;	
		}
		if(flag == true) System.out.println("Element Found");
		else System.out.println("Not Found!");
		
	}
}
