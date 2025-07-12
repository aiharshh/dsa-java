package stacks;
import java.util.Scanner;

public class StacksImplementationUsingArrays {
    public static class Stack{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;
        void push(int x) {
            if(isFull()) {
                System.out.println("OverFlow");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty ");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int peek(){
            if(idx==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack();
        boolean exit = false;
//        System.out.println("Enter Size of Array : ");
//        int n = sc.nextInt();

        while(!exit){
            System.out.println("Choose an Operation : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice 1-5 : ");
            int choice = scan.nextInt();

            switch(choice) {
                case 1: {
                    System.out.print("Enter element to Push");
                    int element = scan.nextInt();
                    st.push(element);
                }
                break;
                case 2: {
                    System.out.println("Enter element to Pop");
                    int popped = st.pop();
                    if (popped != -1) {
                        System.out.println("Popped Element : " + popped);
                    }
                }
                break;
                case 3: {
                    int topElement = st.peek();
                    if (topElement != -1) {
                        System.out.println("Top Element : " + topElement);
                    }
                }
                break;
                case 4: {
                    System.out.print("Current Stack : ");
                    st.display();
                    break;
                }
                case 5: {
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                }
                default:{

                    System.out.println("Invalid Choice");
                }

            }
        }
        scan.close();
    }
}
