package stacksRaghavSir;

public class LLImplementationOfStacks {
    public static class Node{ // User defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{ // User defined data structure
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int peek(){
            if(head==null){
                System.out.print("Stack is Empty");
                return -1;
            }
            return head.val;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
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
        st.push(7); // 4 5 7
        st.push(0); // 4 5 7 0
    }
}
