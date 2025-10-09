package stacksRaghavSir;

import java.util.*;
public class previousGreaterElement {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(res[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        System.out.println(preGreaterEle(arr));

    }
}
