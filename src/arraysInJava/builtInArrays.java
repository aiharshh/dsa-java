package arraysInJava;
import java.util.Arrays;
public class builtInArrays {

	public static void main(String[] args) {
		int[] arr = {100, 25 , 49, 45, 57, 69};
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		This is how we can print without updation, initialisation and length of array
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
