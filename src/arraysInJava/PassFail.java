package arraysInJava;

public class PassFail {

	public static void main(String[] args) {
		int[] arr = {81,45,67,100,24,34,56,12};
		int n = arr.length;
		for(int i=1 ; i<n ; i++) {
			if(arr[i]<35) System.out.print(i + " ");
		}
	}
}
