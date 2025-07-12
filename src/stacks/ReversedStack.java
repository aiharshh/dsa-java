package stacks;
import java.util.Stack;
public class ReversedStack {
	public static void main(String[] args) {
		Stack<Integer> st_original = new Stack<>();
		st_original.push(10);
		st_original.push(20);
		st_original.push(30);
		st_original.push(40);
		
		Stack<Integer> st_reversed = new Stack<>();
		System.out.println("The original Stack is : "+st_original);
		while(!st_original.isEmpty()) {
//			int element = st_original.pop();
//			st_reversed.push(element);
			st_reversed.push(st_original.pop());
		}
		System.out.println("The reversed Stack is : "+st_reversed);
	}
}
