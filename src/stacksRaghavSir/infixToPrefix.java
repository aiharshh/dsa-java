package stacksRaghavSir;

import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
//            Ascii Value of '0' -> 48 and '9' -> is 57
            if(ascii>=48 && ascii<=57){
                String s = " + ch";
                val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')') {
                while(op.peek()!='('){
                    // Work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // '(' hata diya
            }
            else{
                if(ch=='+' || ch=='-'){
                    // Work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        // + and - aayega he nahi :D
                        if(op.peek()=='*') val.push(v1*v2);
                        else if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            else if(op.peek()=='+') val.push(v1+v2);
            else if(op.peek()=='*') val.push(v1*v2);
            else if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.print(val.peek());
    }
}
