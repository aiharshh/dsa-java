package recursion;
import java.util.Scanner;
public class Nto1{
	public static void nto1(int n) {
		if(n==0) return; // base case
		System.out.println(n); // work
		nto1(n-1); // call
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		nto1(n);
	}
}
