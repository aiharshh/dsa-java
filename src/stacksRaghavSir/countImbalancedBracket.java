package stacksRaghavSir;

import java.util.Scanner;
import java.util.Stack;

public class countImbalancedBracket {
    public static int isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{ // ch == ')'
                if(st.isEmpty()) System.out.println("Brackets not balanced");
                if(st.peek()=='('){
                    st.pop();
                    count--;
                }
                else count++;
            }
        }
        count += st.size();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
