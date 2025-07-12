package stacks;

import java.util.Stack;

public class DisplayStack {
	public static void main(String[] args) {
		Stack <Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(10);
		st.push(20);
		System.out.println(st);
//		while(!st.isEmpty()) {
//			System.out.println(st.pop());
//		}
//		System.out.println(st);
	}
}
