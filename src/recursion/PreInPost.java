package recursion;
public class PreInPost {
	public static void pip(int n) {
		// When a recursive function is called two times and there are
		// tasks being performed in between then it is called as pre in post
		if(n==0) return;
		System.out.print(n); // pre
		pip(n-1);
		System.out.print(n); // in
		pip(n-1);
		System.out.print(n); // post
	}
	public static void main(String[] args) {
		pip(3);
		System.out.println();
		pip(2);
		System.out.println();
		pip(4);
	}
}

// Print ZigZag
// 1 = 111
// 2 = 211121112
// 3 = 321112111232111211123
// 4 = 432111211123211121112343211121112321112111234
