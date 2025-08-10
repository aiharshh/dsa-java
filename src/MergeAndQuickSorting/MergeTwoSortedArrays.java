package MergeAndQuickSorting;

public class MergeTwoSortedArrays {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(true){

        }
    }
    public static void main(String[] args) {
        int[] a = {10,30,50,60,80};
        int[] b = {20,40,70,75};
        int m = a.length , n = b.length;
        int[] c = new int[m+n];
        merge(a,b,c);

    }
}
