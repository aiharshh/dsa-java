package recursion;
public class ArrayTraversal {
	public static void print(int i,int[] arr) {
		if(i==arr.length) return;
		System.out.print(arr[i]+" ");
		print(i+1,arr);
	}
	// This is for printing continuous numbers
//	public static void print2(int i,int n) {
//		if(i>n) return;
//		System.out.print(i+" ");
//		print(i+1,n);
//	}
	public static void main(String[] args) {
		int[] arr = {4,5,5,2,2,2,1};
		print(0,arr);
//		print2(1, 10);
	}
}