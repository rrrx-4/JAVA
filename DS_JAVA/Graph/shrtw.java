import java.io.*;
import java.util.*;

public class shrtw {
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

    public static class Pair implements Comparable<Pair> {
        int vrt;
        String psf;
        int wsf;

        Pair(int vrt, String psf, int wsf) {
            this.vrt = vrt;
            this.psf = psf;
            this.wsf = wsf;
        }

        public int compareTo(Pair p1) {
            return this.wsf - p1.wsf;
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
        // write your code here

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        Pair p = new Pair(src, src + "", 0);
        boolean[] b = new boolean[vtces];

        pq.add(p);

        while (pq.size() > 0) {
            Pair t = pq.remove();

            if (b[t.vrt] == true) {
                continue;
            }

            b[t.vrt] = true;

            System.out.println(t.vrt + " via " + t.psf + " @ " + t.wsf);

            for (int i = 0; i < graph[t.vrt].size(); i++) {
                Edge e = graph[t.vrt].get(i);

                int v2 = e.nbr;

                if (b[v2] == false) {
                    pq.add(new Pair(v2, t.psf + v2, t.wsf + e.wt));
                }
            }
        }

    }
}