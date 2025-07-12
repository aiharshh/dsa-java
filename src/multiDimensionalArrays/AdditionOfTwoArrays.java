package multiDimensionalArrays;
import java.util.Scanner;
public class AdditionOfTwoArrays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter Number of Columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("For First Matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("Enter Element: ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("For Second Matrix");
		int[][] brr = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("Enter Element: ");
				brr[i][j] = sc.nextInt();
			}
		}
		int[][] res = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				res[i][j] = arr[i][j] + brr[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}