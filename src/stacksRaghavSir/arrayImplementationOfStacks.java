package stacksRaghavSir;


public class arrayImplementationOfStacks {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }
        int capacity(){
            return arr.length;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size()); // 3
        st.pop(); // pop 1
        st.display(); // 4 5
        System.out.println(st.size()); // 2
    }
}
