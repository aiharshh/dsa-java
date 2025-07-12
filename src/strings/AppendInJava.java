package strings;
public class AppendInJava {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Abc");
		System.out.println(sb);
		sb.append(35);
		System.out.println(sb);
		sb.append('*');
		System.out.println(sb);
		sb.append("xyz");
		System.out.println(sb);
		char[] ch = {'r','a','g'};
		sb.append(ch);
		System.out.println(sb);
		int[] arr = {1,2,3,4};
		sb.append(arr);
		System.out.println(sb);
	}
}
