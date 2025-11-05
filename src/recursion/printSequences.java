package recursion;

import java.util.ArrayList;

public class printSequences {
    public static void sequences(int n, int k, int i, ArrayList<Integer> ans){
        if(ans.size()==k){
            for (int num : ans) System.out.print(num + " ");
            System.out.println();
            return;
        }
        for(int j=i+1;j<=n;j++){
            ans.add(j);
            sequences(n, k, j, ans);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 6, k = 4;
        sequences(n, k, 0, new ArrayList<>());
    }
}
