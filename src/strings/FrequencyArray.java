package strings;
import java.util.Scanner;
public class FrequencyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.next();
		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			int idx = (int)ch - 97;
			freq[idx]++;
		}
		int maxFreq = -1;
		for(int i=0;i<freq.length;i++) {
			maxFreq = Math.max(maxFreq, freq[i]);
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i] == maxFreq) {
				char ch = (char)(i+97);
				System.out.println(ch+" ");
			}
		}
	}
// Jo SABSE JYADA BAAR AA RHAA HAI WOH PRINT HOGA
}
