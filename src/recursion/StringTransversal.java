package recursion;
public class StringTransversal {
	public static void print(int i, String s) {
		if(i==s.length()) return;
		System.out.print(s.charAt(i));
		print(i+1,s);
	}
	public static void main(String[] args) {
		String s = "Raghav";
//		System.out.println(s);
		print(0,s);
	}
}
