package strings;
import java.util.Arrays;
public class SortingInStrings {
	public static void main(String[] args) {
		String s = "raghav";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
//		can do both the things Above wala or below wala!!
		StringBuilder sb = new StringBuilder("garg"); 
		char[] arr = sb.toString().toCharArray();
		System.out.println(arr);
		for(char ele : ch) {
			System.out.print(ele);
		}
		System.out.println();
		
	}
}
