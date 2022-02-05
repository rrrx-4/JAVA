// import java.io.*;
// import java.util.*;

// public class graph {
//     static class Edge {
//         int src;
//         int nbr;
//         int wt;

//         Edge(int src, int nbr, int wt) {
//             this.src = src;
//             this.nbr = nbr;
//             this.wt = wt;
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int vtces = Integer.parseInt(br.readLine());
//         ArrayList<Edge>[] graph = new ArrayList[vtces];
//         for (int i = 0; i < vtces; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         int edges = Integer.parseInt(br.readLine());
//         for (int i = 0; i < edges; i++) {
//             String[] parts = br.readLine().split(" ");
//             int v1 = Integer.parseInt(parts[0]);
//             int v2 = Integer.parseInt(parts[1]);
//             int wt = Integer.parseInt(parts[2]);
//             graph[v1].add(new Edge(v1, v2, wt));
//             graph[v2].add(new Edge(v2, v1, wt));
//         }

//         int src = Integer.parseInt(br.readLine());
//         int dest = Integer.parseInt(br.readLine());

//         boolean[] visited = new boolean[vtces];

//         // write your code here
//         hasPath(graph, visited, src, dest, "");
//         // System.out.println(pathExists);
//     }

//     public static void hasPath(ArrayList<Edge>[] graph,
//             boolean[] visited, int src, int dest, String s) {
//         if (src == dest) {
//             // return true;
//             System.out.println(s+dest+"");
//             visited[src] = false;
//             return;
//         }

//         visited[src] = true;
//         for (int i = 0; i < graph[src].size(); i++) {
//             Edge edge = graph[src].get(i);
//             int nbr = edge.nbr;

//             if (visited[nbr] == false) {
//                 hasPath(graph, visited, nbr, dest, s + src+"");
//                 visited[nbr] = false;
//             }

//         }

//     }

// }

import java.io.*;
import java.util.*;

public class graph {
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

    static class Pair implements Comparable<Pair> {
        int wsf;
        String psf;

        Pair(int wsf, String psf) {
            this.wsf = wsf;
            this.psf = psf;
        }

        public int compareTo(Pair o) {
            return this.wsf - o.wsf;
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

        int criteria = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[vtces];

        multisolver(graph, src, dest, visited, criteria, k, src + "", 0);

        System.out.println("Smallest Path = " + spath + "@" + spathwt);
        System.out.println("Largest Path = " + lpath + "@" + lpathwt);
        System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
        System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
        System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
    }

    static String spath;
    static Integer spathwt = Integer.MAX_VALUE;
    static String lpath;
    static Integer lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static Integer cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static Integer fpathwt = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();

    public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k,
            String psf, int wsf) {

        if (src == dest) {
            if (spathwt > wsf) {
                spathwt = wsf;
                spath = psf;
            }
            return;
        }

        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge edge = graph[src].get(i);
            int nbr = edge.nbr;

            if (visited[nbr] == false) {

                multisolver(graph, nbr, dest, visited, criteria, k, psf + nbr, edge.wt + wsf);
                visited[nbr] = false;

            }

        }

    }
}
