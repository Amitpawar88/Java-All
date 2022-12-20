package Traversal;

import java.util.ArrayList;

public class DFS extends BFS {
    // static class Edge {
    //     int src;
    //     int dest;
    //     int wt;

    //     public Edge(int s, int d, int w) {
    //         src = s;
    //         dest = d;
    //         wt = w;
    //     }
    // }

    public static void dfs(ArrayList<Traversal.BFS.Edge>[] graph, int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Traversal.BFS.Edge e = graph[curr].get(i);
            
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] agrs) {
        /*    
                          (5)
                        0------1
                              / \
                          (1)/   \ (3)
                            /     \
                           2-------3
                           |  (1)
                        (2)|
                           |
                           4

        */

        int v = 5;
        ArrayList<Traversal.BFS.Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        dfs(graph, 0, new boolean[v]);
    }
}
