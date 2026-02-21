package zcodeForces;
import java.util.Scanner;

public class stringRotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int b = 1;
            for(int i=1;i<n;i++){
                if(s.charAt(i)!=s.charAt(i-1)) b++;
            }
            boolean flag = true;
            for(int i=1;i<n;i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    flag = false;
                    break;
                }
            }
            if(flag==true) System.out.println(1);
            else if(s.charAt(0)==s.charAt(n-1)) System.out.println(b+1);
            else System.out.println(b);
        }
    }
}
