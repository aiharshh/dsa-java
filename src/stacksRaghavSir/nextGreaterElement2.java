package stacksRaghavSir;

import java.util.Stack;

public class nextGreaterElement2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            // While stack not empty AND current element > element at top index
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int idx = st.pop();
                res[idx] = arr[i];
            }
            st.push(i);
        }

        // Remaining elements have no greater element
        while (!st.isEmpty()) {
            res[st.pop()] = -1;
        }

        // Print result
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
