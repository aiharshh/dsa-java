package recursion;
import java.util.Scanner;
public class SumReturnType {
	public static int sum (int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return n + sum(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int s = sum(n);
		System.out.println("The sum is : "+s);
	}
}
