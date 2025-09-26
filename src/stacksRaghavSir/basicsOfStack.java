package stacksRaghavSir;

import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        System.out.println(st);
        st.pop();
        st.peek();
        while(st.size()!=0){
            st.pop();
        }
        System.out.println(st);

    }
}
