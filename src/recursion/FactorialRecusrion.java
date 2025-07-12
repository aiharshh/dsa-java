package recursion;
import java.util.*;
public class FactorialRecusrion {
	public static int fact(int n) {
		if(n==1 || n==0) return 1;
		int ans = n*fact(n-1);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int factorial = fact(n);
		System.out.println("The Factorial is : "+factorial);
	}
}