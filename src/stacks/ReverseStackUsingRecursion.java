package stacks;
import java.util.Stack;
import java.util.Scanner;
public class ReverseStackUsingRecursion {
	public static void displayReverseRecursion(Stack<Integer> st) {
		if(st.isEmpty()) return;
		int top = st.pop();
		System.out.print(top+" ");
		displayReverseRecursion(st);
		st.push(top);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		System.out.print("Enter No Of Elements : ");
		int n = sc.nextInt();
		System.out.print("Enter Elements : ");
		for(int i=1;i<=n;i++) {
			int x = sc.nextInt();
			st.push(x);
		}
		System.out.print("The Reverse of the Stack is : ");
		displayReverseRecursion(st);
		sc.close();
	}
}
