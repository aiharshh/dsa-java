package stacks;
import java.util.Stack;
public class InsertAtBottom {
	public static void main(String[] args) {
		Stack<Integer> st_original = new Stack<>();
		int new_element = 50;
		Stack<Integer> st_temp = new Stack<>();
		
		while(st_original.size()>0) {
			st_temp.push(st_original.pop());
		}
		st_original.push(new_element);
		while(st_temp.size() > 0) {
			st_original.push(st_temp.pop());
			
		}
		System.out.println(st_original);
	}
}
