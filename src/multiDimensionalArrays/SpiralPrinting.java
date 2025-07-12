package multiDimensionalArrays;

public class SpiralPrinting {
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
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int m = arr.length, n = arr[0].length;
		int minr = 0, maxr = m-1;
		int minc = 0, maxc = n-1;
		while(minr<=maxr && minc<=maxc) {
			// Left to Right
			for(int j=minc;j<=maxc;j++) {
				System.out.print(arr[minr][j]+" ");
			}minr++;
			System.out.println();
			// Top to Bottom
			if(minr>maxr || minc>maxc) break;
			for(int j=minr;j<=maxr;j++) {
				System.out.print(arr[j][maxc]);
			}maxc--;
			System.out.println();
			// Right to Left
			if(minr>maxr || minc>maxc) break;
			for(int j=maxc;j>=minc;j--) {
				System.out.print(arr[maxr][j]+" ");
			}maxr--;
			System.out.println();
			// Bottom to Up
			if(minr>maxr || minc>maxc) break;
			for(int j=maxr;j>=minr;j--) {
				System.out.print(arr[j][minc]+" ");
			}minc++;
			System.out.println();
		}
		System.out.println();
	}

}
