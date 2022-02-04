import java.io.*;
import java.util.*;

public class mypqforclass {

    public static class myPriorityQueue<T> {
        ArrayList<T> data;
        Comparator cmptr;

        public myPriorityQueue() {
            data = new ArrayList<>();
            cmptr = null;
        }

        public myPriorityQueue(Comparator cmptr) {
            data = new ArrayList<>();
            this.cmptr = cmptr;
        }

        public void add(T val) {

            data.add(val);

            int ci = size() - 1;

            upheapify(ci);
        }

        public void upheapify(int ci) {
            if (ci == 0)
                return;

            int pi = (ci - 1) / 2;
            if (isSmaller(ci, pi)) {
                swap(ci, pi);
                upheapify(pi);
            }
        }

        public boolean isSmaller(int ci, int pi) {
            T c = data.get(ci);
            T p = data.get(pi);

            if (cmptr != null) {
                if (cmptr.compare(c, p) < 0) {
                    return true;
                } else
                    return false;
            } else {

                Comparable cc = (Comparable) c;
                Comparable pp = (Comparable) p;
                if (cc.compareTo(pp) < 0) {
                    return true;
                } else
                    return false;
            }

        }

        public void swap(int ci, int pi) {
            T c = data.get(ci);
            T p = data.get(pi);

            data.set(ci, p);
            data.set(pi, c);
        }

        public T peek() {
            // write your code here
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }

        public T remove() {
            swap(0, size() - 1);

            T an = data.remove(size() - 1);

            downheapify(0);

            return an;
        }

        public void downheapify(int pi) {

            int c1 = 2 * pi + 1;
            int c2 = 2 * pi + 2;
            int min = pi;

            if (c1 < data.size() && isSmaller(c1, pi)) {
                min = c1;
            }

            if (c2 < data.size() && isSmaller(c2, pi)) {
                min = c2;
            }
            if (pi != min) {
                swap(min, pi);
                downheapify(min);
            }
        }
    }

    public static class Student implements Comparable<Student> {

        String name;
        int wt;
        int ht;
        int m;

        Student(String name, int ht, int wt, int m) {
            this.name = name;
            this.wt = wt;
            this.ht = ht;
            this.m = m;
        }

        public String toString() {
            return this.name + " ->" + this.wt + " " + this.ht + " " + this.m;
        }

        public int compareTo(Student o) {
            // TODO Auto-generated method stub
            return this.name.compareTo(o.name);
        }
    }

    static class StudentHeightComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.ht - s2.ht;
        }
    }

    static class StudentWeightComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.wt - s2.wt;
        }
    }

    static class StudentMarksComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.m - s2.m;
        }
    }

    public static void main(String[] args) {
        Student[] Students = new Student[5];
        Students[0] = new Student("rk", 180, 93, 55);
        Students[1] = new Student("nk", 150, 33, 87);
        Students[2] = new Student("ak", 170, 99, 79);
        Students[3] = new Student("bk", 165, 75, 49);
        Students[4] = new Student("gk", 185, 88, 59);

        myPriorityQueue<Student> pq = new myPriorityQueue<>();

        myPriorityQueue<Student> pq1 = new myPriorityQueue<>(new StudentHeightComparator());
        myPriorityQueue<Student> pq2 = new myPriorityQueue<>(new StudentWeightComparator());
        myPriorityQueue<Student> pq3 = new myPriorityQueue<>(new StudentMarksComparator());

        for (Student s : Students) {
            pq.add(s);
            pq1.add(s);
            pq2.add(s);
            pq3.add(s);

        }

        System.out.println("comparable");
        while (pq.size() > 0) {
            Student ss = pq.remove();

            System.out.println(ss);
        }

        System.out.println("///Height///");
        while (pq1.size() > 0) {

            Student s1 = pq1.remove();

            System.out.println(s1);
        }

        System.out.println("///weight///");
        while (pq2.size() > 0) {

            Student s1 = pq2.remove();

            System.out.println(s1);
        }

        System.out.println("Marks");
        while (pq3.size() > 0) {

            Student s1 = pq3.remove();

            System.out.println(s1);
        }

    }
}