package zContest190Educational;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String s = br.readLine().trim();
            int n = s.length();
            int noo = 0, not = 0, noth = 0;
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch=='1') noo++;
                else if(ch=='2') not++;
                else if(ch=='3') noth++;
            }
            if(not==n){
                sb.append(0).append("\n");
                continue;
            }
            int oneAndThree = noo + noth;
            int passed1and3 = 0;
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch=='1' || ch=='3') passed1and3++;
                else if(ch=='2') {
                    int remaining1and3 = (noo+noth) - passed1and3;
                    int keptWith2 = 1 + remaining1and3;
                    oneAndThree = Math.max(oneAndThree, keptWith2);
                }
            }
            int minDeletions = n - oneAndThree;
            sb.append(minDeletions).append("\n");
        }
        System.out.println(sb);
    }
}