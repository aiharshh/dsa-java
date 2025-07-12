package basicSorting;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr = {1,5,3,12};
		int n = arr.length;
		boolean flag = true;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				arr[i+1] = arr[i];
				flag = false;
				System.out.println("Array is Unsorted!");
				break;
			}
		}
		if(flag==true) System.out.println("Arrya is Sorted!");
		
	}
}
