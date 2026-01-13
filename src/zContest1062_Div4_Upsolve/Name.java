package zContest1062_Div4_Upsolve;
import java.util.*;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean flag = true;  // assume equal
            for (int i=0;i<n;i++) {
                if (a[i]!=b[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag==true) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
