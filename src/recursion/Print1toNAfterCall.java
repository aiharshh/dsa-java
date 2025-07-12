package recursion;
import java.util.Scanner;
public class Print1toNAfterCall {
	public static void nto1(int n) {
		if(n==0) return; // base case
		nto1(n-1); // call
		System.out.println(n); // work
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		nto1(n);
	}
}