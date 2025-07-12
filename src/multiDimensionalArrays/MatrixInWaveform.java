package multiDimensionalArrays;
public class MatrixInWaveform {
	public static void print(int[][] arr) {
		int m = arr.length, n = arr[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int m = arr.length, n = arr[0].length;
		print(arr);
//		*SELF WRITTEN CODE*
//		for(int i=0;i<m;i++) {
//			if(i%2==0) {
//				for(int j=0;j<n;j++) {
//					arr[i][j] = arr[i][j];
//				}
//			}
//			System.out.println();
//			if(i%2!=0) {
//				int a = 0, b = m - 1;
//				while(a<=b) {
////					SWAPPING arr[i][a] and arr[i][b]
//					int temp = arr[i][a];
//					arr[i][a] = arr[i][b];
//					arr[i][b] = temp;
//					a++;
//					b--;
//				}
//				System.out.println();
//			print(arr);
//			}
//		}
//		SIR'S CODE
		System.out.println();
		for(int i=0;i<m;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			else {
				for(int j=n-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}