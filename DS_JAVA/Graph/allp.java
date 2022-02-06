import java.io.*;
import java.util.*;

public class allp {
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

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        // write all your codes here
        boolean[] b = new boolean[vtces];
        appPath(graph, src, dest, "", b);
    }

    public static void appPath(ArrayList<Edge>[] g, int s, int d, String str, boolean[] b) {
        if (s == d) {
            System.out.println(str + d);
            return;
        }

        b[s] = true;
        for (int i = 0; i < g[s].size(); i++) {
            Edge e = g[s].get(i);
            int npr = e.nbr;

            if (b[npr] == false) {
                appPath(g, npr, d, str + e.src, b);

            }
        }
        b[s] = false;
    }

}