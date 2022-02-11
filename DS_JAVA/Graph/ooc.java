import java.io.*;
import java.util.*;

public class ooc {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
        }

        Stack<Integer> s = new Stack<>();

        // ArrayList<Intege> a = new ArrayList<>();
        boolean[] b = new boolean[vtces];

        for (int i = 0; i < vtces; i++) {
            if (b[i] == false) {
                topol(graph, i, b, s);
            }
        }
        while (s.size() > 0)
            System.out.println(s.pop());
    }

    public static void topol(ArrayList<Edge>[] g, int src, boolean[] b, Stack s) {
        b[src] = true;
        for (int i = 0; i < g[src].size(); i++) {
            Edge e = g[src].get(i);

            int t = e.nbr;

            if (b[t] == false) {
                topol(g, t, b, s);
            }
        }

        s.push(src);
    }

}
