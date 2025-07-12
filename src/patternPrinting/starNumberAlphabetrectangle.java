package patternPrinting;
import java.util.Scanner;
public class starNumberAlphabetrectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Number of Columns: ");
		int c = sc.nextInt();
//		For Star Rectangle
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
//		For Number Rectangle
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		FOR ALPHABET RECTANGLE
		
		int a = 64;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print((char)(j+a)+" ");
			}
			System.out.println();
		}
	}
}