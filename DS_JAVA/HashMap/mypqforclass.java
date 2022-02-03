import java.io.*;
import java.util.*;

public class mypqforclass {

    public static class student implements Comparable<student> {
        String name;
        int wt;
        int ht;

        student(String name, int ht, int wt) {
            this.name = name;
            this.wt = wt;
            this.ht = ht;
        }

        public String toString() {
            return this.name + " ->" + this.wt + " " + this.ht;
        }

        @Override
        public int compareTo(student o) {
            // TODO Auto-generated method stub
            return this.ht - o.ht;
        }
    }

    public static void main(String[] args) {
        student[] students = new student[2];
        students[0] = new student("Rk", 180, 93);
        students[1] = new student("nk", 150, 33);
        students[2] = new student("ak", 170, 99);
        students[3] = new student("bk", 165, 75);
        students[4] = new student("gk", 185, 88);

        PriorityQueue<student> pq = new PriorityQueue<>();

        for (student s : students) {
            pq.add(s);
        }

        while (pq.size() > 0) {
            student ss = pq.remove();
            System.out.println(ss);
        }

    }
}