package Loops;
import java.util.Scanner;
public class geometricProgression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int a = 1;
		for(int i=1;i<=n;i++){
			System.out.println(a);
			a *= 2;
		}
	}

}
