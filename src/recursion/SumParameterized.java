package recursion;
import java.util.Scanner;
public class SumParameterized {
	public static void sum(int n, int s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		sum(n-1,s+n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		sum(n,0);
	}
}