package arraysInJava;
//This Program is Calse called as Dutch Flag Algorithm
public class SortingZeroesOnesTwos {
	public static void main(String[] args) {
		int[] arr = {0,1,2,2,1,2,1,2,0,0};
		int n = arr.length;
		int noOfZeroes = 0, noOfOnes = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) noOfZeroes++;
			if(arr[i]==1) noOfOnes++;
		}
		for(int i=0;i<n;i++) {
			if(i<noOfZeroes) arr[i]=0;
			else if(i<noOfZeroes+noOfOnes) arr[i]= 1;
			else arr[i] = 2;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
