package multiDimensionalArrays;
import java.util.Scanner;
public class twoDimensionalArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int m = arr.length; // No. of ROWS
		System.out.println(m);
		int n = arr[0].length; // Length of 0th Row that is Column
		System.out.println(n);
//		INPUT OF 2D ARRAY
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter Element: ");
				arr[i][j] = sc.nextInt();
			}
		}
//		OUTPUT OF 2D ARRAY
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
