import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static int[] topoligicalSort(int V, ArrayList<Edge>[] graph) {
        int []vis = new int[V];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, s, graph);
            }
        }

        int []ans = new int[V];
        int i = 0;
        while (!s.isEmpty()) {
            ans[i++] = s.pop();
        }
        return ans;
    }

    private static void dfs(int node, int[] vis, Stack<Integer> s, ArrayList<Edge> []graph) {
        vis[node] = 1;
        
        for (int i = 0; i < graph[node].size(); i++) {
            if (vis[i] == 0) {
                dfs(node, vis, s, graph);
            }
        }

        s.push(node);
    }

    public static void createGraph(ArrayList<Edge> []graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0- vertex
        graph[0].add(new Edge(0, 0));
        
        graph[1].add(new Edge(1, 1));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> []graph = new ArrayList[V];

        createGraph(graph);
        System.out.println(Arrays.toString(topoligicalSort(V, graph)));
    }
}
