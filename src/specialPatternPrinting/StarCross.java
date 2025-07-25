package specialPatternPrinting;

import java.util.Scanner;

public class StarCross {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int mid = n/2 + 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==j || (i+j==(n+1)))) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
/*
 * OUTPUT :
 * 
 * Enter a Number: 5 * *
 * 
 * * *
 */
