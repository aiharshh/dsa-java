package arraysInJava;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] arr = {2,5,7,9,12,15,14,23,90};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
