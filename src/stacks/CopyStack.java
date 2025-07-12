package stacks;
import java.util.Stack;
public class CopyStack {
	public static void main(String[] args) {
		Stack<Integer> st_original = new Stack<>();
		st_original.push(10);
		st_original.push(20);
		st_original.push(30);
		st_original.push(40);
		
		Stack<Integer> st_temp = new Stack<>();
		while(!st_original.isEmpty()) {
			st_temp.push(st_original.pop());
		}
		Stack<Integer> st_final = new Stack<>();
		while(!st_temp.isEmpty()) {
			st_final.push(st_temp.pop());
		}
		System.out.println("This is Copy of the Stack : "+st_final);
	}
}
