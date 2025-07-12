package stacks;
import java.util.Stack;
import java.util.Scanner;
public class PushAtAnyIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Elements in Stack : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			st.push(x);
		}
		System.out.println(st);
		System.out.print("Enter Index to Insert in Stack : ");
		int idx = sc.nextInt();
		Stack<Integer> temp = new Stack<>();
		while(st.size()>=idx) {
			temp.push(st.pop());
		}
		System.out.println("Enter element to Push in Stack at Index "+idx+" :");
		int element = sc.nextInt();
		st.push(element);
		while(!temp.isEmpty()) {
			st.push(temp.pop());
		}
		System.out.println(st);
	}
}
