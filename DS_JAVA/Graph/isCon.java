import java.io.*;
import java.util.*;

public class isCon {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
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
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        boolean[] b = new boolean[vtces];
        int c = 0;

        for (int i = 0; i < vtces; i++) {
            if (b[i] == false) {
                c++;
                if (c == 2) {
                    break;
                }
                ArrayList<Integer> comp = new ArrayList<>();
                isConnected(graph, i, b, comp);
            }
        }
        if (c == 2) {
            System.out.println("false");
            return;
        }
        System.out.println("true");
    }

    public static void isConnected(ArrayList<Edge>[] g, int s, boolean[] b, ArrayList<Integer> comp) {

        b[s] = true;
        comp.add(s);

        for (int i = 0; i < g[s].size(); i++) {
            Edge e = g[s].get(i);
            int v = e.nbr;
            if (b[v] == false) {
                isConnected(g, v, b, comp);
            }
        }
    }
}