package specialPatternPrinting;
import java.util.Scanner;
public class StarTriangleFlipped {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Rows: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//Method 2

//if((i+j)>n) sysout("*"+" ");
//else sysout(" "+" ");