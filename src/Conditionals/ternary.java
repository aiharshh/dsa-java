package Conditionals;
import java.util.Scanner;
public class ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		System.out.println((n%2==0)?"Even":"Odd");
	}
}
