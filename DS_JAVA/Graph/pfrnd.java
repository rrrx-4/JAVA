import java.io.*;
import java.util.*;

public class pfrnd {

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

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {

            String str = br.readLine();

            int v1 = Integer.parseInt(str.split(" ")[0]);
            int v2 = Integer.parseInt(str.split(" ")[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));

        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (b[i] == false) {
                ArrayList<Integer> comp = new ArrayList<>();
                isConn(graph, i, b, comp);
                comps.add(comp);
            }
        }
        int ans = 0;
        for (int i = 0; i < comps.size(); i++) {
            for (int j = i + 1; j < comps.size(); j++) {
                int m = comps.get(i).size() * comps.get(j).size();
                ans += m;
            }
        }

        System.out.println(ans);

        // write your code here
    }

    public static void isConn(ArrayList<Edge>[] g, int s, boolean[] b, ArrayList<Integer> comp) {
        b[s] = true;
        comp.add(s);

        for (int i = 0; i < g[s].size(); i++) {
            Edge e = g[s].get(i);
            int v2 = e.nbr;

            if (b[v2] == false) {
                isConn(g, v2, b, comp);
            }
        }
    }

}
