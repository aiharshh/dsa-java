package zContest1098_Div2;
import java.util.Scanner;

public class bReimuandRemilia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long k = sc.nextLong();
            if(n==2 || n==3) {
                System.out.println(1);
                continue;
            }
            long dd = Math.abs(x1 - x2);
            long cd = n - dd;
            long dist = Math.min(dd, cd);
            long ans = dist + k;
            System.out.println(ans);
        }
    }
}