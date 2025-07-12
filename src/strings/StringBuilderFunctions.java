package strings;

public class StringBuilderFunctions {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Harsh");
		StringBuilder tb = new StringBuilder("Dhanu");
		System.out.println(sb.compareTo(tb));
		System.out.println(sb.reverse());
		System.out.println(tb.reverse());
	}
}
