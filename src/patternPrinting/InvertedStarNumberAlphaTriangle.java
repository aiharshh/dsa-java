package patternPrinting;

import java.util.Scanner;

public class InvertedStarNumberAlphaTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int r = sc.nextInt();
		
//		For Star Triangle
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
//		For Number Triangle
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		FOR ALPHABET TRIANGLE
		
		int a = 64;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i+1;j++) {
				System.out.print((char)(j+a)+" ");
			}
			System.out.println();
		}
	}
}
