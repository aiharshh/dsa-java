package zContest1098_Div2;
import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int noz = 0;
            int noo = 0;
            int not = 0;
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                if(temp==0) noz++;
                else if(temp==1) noo++;
                else not++;
            }
            int ans = noz;

            int pair12 = Math.min(noo, not);
            ans += pair12;

            noo -= pair12;
            not -= pair12;

            ans+=noo/3;
            ans+=not/3;

            System.out.println(ans);
        }
    }
}
