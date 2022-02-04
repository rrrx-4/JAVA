import java.io.*;
import java.util.*;

public class mypq {

    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {

            data.add(val);

            int ci = size() - 1;

            upheapify(ci);
        }

        public void upheapify(int ci) {
            if (ci == 0)
                return;

            int pi = (ci - 1) / 2;
            if (data.get(ci) < data.get(pi)) {
                swap(ci, pi);
                upheapify(pi);
            }
        }

        public void swap(int ci, int pi) {
            int c = data.get(ci);
            int p = data.get(pi);

            data.set(ci, p);
            data.set(pi, c);
        }

        public int peek() {
            // write your code here
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }

        public int remove() {
            swap(0, size() - 1);

            int an = data.remove(size() - 1);

            downheapify(0);

            return an;
        }

        public void downheapify(int pi) {

            int c1 = 2 * pi + 1;
            int c2 = 2 * pi + 2;
            int min = pi;

            if (c1 < data.size() && data.get(min) > data.get(c1)) {
                min = c1;
            }

            if (c2 < data.size() && data.get(min) > data.get(c2)) {
                min = c2;
            }
            if (pi != min) {
                swap(min, pi);
                downheapify(min);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}