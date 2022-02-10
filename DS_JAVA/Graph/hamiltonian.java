import java.io.*;
import java.util.*;

public class hamiltonian {
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

        // write all your codes here
        boolean[] b = new boolean[vtces];
        hamiltonian(graph, src, b, src + "");
    }

    public static void hamiltonian(ArrayList<Edge>[] g, int s, boolean[] b, String psf) {

        // if(psf.length()==g.length && (psf.charAt(g.length-1)==g[s].get(0).nbr ==
        // psf.charAt(0))){
        // System.out.println(psf+"*");
        // }

        if (psf.length() == g.length) {
            System.out.println(psf + ".");
        }

        b[s] = true;

        for (int i = 0; i < g[s].size(); i++) {
            Edge e = g[s].get(i);
            int t = e.nbr;

            if (psf.length() == g.length && b[t] == true) {

                System.out.println(psf + "*");
                return;
            }

            if (b[t] == false) {
                hamiltonian(g, t, b, psf + t);
            }
        }

        b[s] = false;
    }

}