package recursion;
import java.util.Scanner;
public class PowerRecursionLogarithmic {
	public static int power(int a, int b) {
		if(b==0) return 1;		
		int ans = power(a,b/2);
		if(b%2==0) return ans * ans;
		else return ans*ans*a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Power: ");
		int b = sc.nextInt();		
		int pow = power(a,b);
		System.out.println(a+" raised to "+b+" is : "+pow);
	}
}
