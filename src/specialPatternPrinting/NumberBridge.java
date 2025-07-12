package specialPatternPrinting;
import java.util.Scanner;
public class NumberBridge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Rows: ");
		int n = sc.nextInt();
		for(int j=1;j<=2*n-1;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(k + " ");
			}
			for(int l=1;l<=2*i-1;l++) {
				System.out.print(" " + " ");
			}
			for(int m=n+i;m<=2*n-1;m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}