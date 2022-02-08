import java.io.*;
import java.util.*;

public class sof {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    static class Pair {
        int vrt;
        int l;

        Pair(int vrt, int l) {
            this.vrt = vrt;
            this.l = l;
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
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        // write your code here
        ArrayDeque<Pair> q = new ArrayDeque<>();
        boolean[] b = new boolean[vtces];
        int c = 1;
        Pair p = new Pair(src, 1);
        q.add(p);

        while (q.size() > 0) {

            Pair t1 = q.remove();

            if (t1.l >= t) {
                return;
            }
            if (b[t1.vrt] == true) {
                c = c - 1;
                continue;

            }

            b[t1.vrt] = true;
            c++;

            for (int i = 0; i < graph[t1.vrt].size(); i++) {
                Edge e = graph[t1.vrt].get(i);
                int v = e.nbr;
                if (b[v] == false) {

                    q.add(new Pair(v, t1.l + 1));
                }
            }

        }
        System.out.println(c);
    }

}