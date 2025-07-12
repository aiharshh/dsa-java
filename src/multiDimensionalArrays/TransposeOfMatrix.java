package multiDimensionalArrays;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, {5,6} };
		int r = arr.length, c = arr[0].length;

		System.out.println();
//		COLUMN WISE PRINTING
//		for(int j=0;j<c;j++) {
//			for(int i=0;i<r;i++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		STORING IN A NEW MATRIX
		int[][] tarr = new int[c][r];
		for(int j=0;j<c;j++) {
			for(int i=0;i<r;i++) {
				tarr[j][i] = arr[i][j];
				System.out.print(tarr[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
