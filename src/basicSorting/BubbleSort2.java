package basicSorting;
public class BubbleSort2 {
	public static void print(int[] arr) { 
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {5,1,3,4,2};
		print(arr);
		int n = arr.length;
		// BUBBLE SORT ALGORITHM (BS se thoda accha hai)
//		for(int x=0;x<n-1;x++) { // n-1 passes
//			for(int i=0;i<n-1-x;i++) {
//				if(arr[i]>arr[i+1]) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;		
//				}
//			}
//		}
		// BUBBULE SORT OPTIMIZED 
		for(int x=0;x<n-1;x++) { // n-1 passes
			boolean flag = true;
			for(int i=0;i<n-1-x;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = false;
				}
			}
			if(flag==true) break;
		}
		print(arr);
	}

}
