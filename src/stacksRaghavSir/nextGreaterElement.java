package stacksRaghavSir;

import java.util.Stack;

public class nextGreaterElement {
    public static int[] nextGreatest(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1) st.push(arr[i]);
            if(arr[i]<st.peek()) {
                res[i] = st.peek();
                st.push(arr[i]);
            }
            else{
                while(arr[i]>st.peek()){
                    st.pop();
                }
                res[i] = -1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = nextGreatest(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
