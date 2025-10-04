package MergeAndQuickSorting;

public class quickSorting {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
//        i = pivotIdx and j = correctIndex
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo], pIdx = lo;
        int smallerCount = 0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIndex = pIdx + smallerCount;
        // hame pivot element se chote kitne elements mile woh dekho then
        // hamara lo + smallerCount karenge tab jakar hmara 7 jo hai
        // woh sahi position pe aayega
        // now swap correctINdex and pivotIndex
        swap(arr, pIdx, correctIndex);
        // Partition
        int i = lo, j = hi;
        while(i<correctIndex && j>correctIndex){
            if(arr[i]<=pivot) i++;
            else if(arr[i]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr, i, j);
            }
        }
        return correctIndex;
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        // pivot arr[lo] ko sahi jagah rakhna hai
        // left part of the pivot mai pivot se chote elements hone chhiye and
        // right part mai pivot se bde elements hone chahiye
        int idx = partition(arr, lo, hi);
        quickSort(arr, lo, idx -1);
        quickSort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
//        int[] arr = {1,5,2,1,3,8,10,9,3,2};
        int n = arr.length;
        print(arr);
        quickSort(arr, 0, n-1);
        print(arr);
    }
}
