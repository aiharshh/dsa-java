package Graphs;
import java.util.*;

class DFS {
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
         ls.add(node);
         for(int i : adj.get(node)){ // i is neighbour
            if(!vis[i]) {
                dfs(i, vis, adj, ls);
            }
         }
    }
    public ArrayList<Integer> dfsOfGraph(int n, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new  boolean[n];
        vis[0] = true;
        ArrayList<Integer> ls = new  ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected graph
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        DFS obj = new DFS();

        ArrayList<Integer> ans = obj.dfsOfGraph(n, adj);

        System.out.println(ans);
    }
}
