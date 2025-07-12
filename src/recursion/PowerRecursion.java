package recursion;
import java.util.Scanner;
public class PowerRecursion {
	public static int power(int a, int b) {
		if(a==0 && b==0) {
			System.out.println("Undefined");
			return -1;
		}
		if(b==0) return 1;
		return a * power(a,b-1);
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