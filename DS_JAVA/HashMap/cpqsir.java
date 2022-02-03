
/*import java.io.*;
import java.util.*;

public class Main {

    public static class PriorityQueue {
        ArrayList<Integer> data; // Student

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {//Student s
            data.add(val);
            upheapify(data.size() - 1);
        }

        void upheapify(int i) {
            if (i == 0) {
                return;
            }

            int pi = (i - 1) / 2;
            if (data.get(pi) > data.get(i)) {
                swap(pi, i);
                upheapify(pi);
            }
        }

        public int remove() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }

            swap(0, data.size() - 1);
            int val = data.remove(data.size() - 1);

            downheapify(0);

            return val;
        }

        void downheapify(int i) {
            int mini = i;

            int lci = 2 * i + 1;
            if (lci < data.size() && data.get(lci) < data.get(mini)) {
                mini = lci;
            }

            int rci = 2 * i + 2;
            if (rci < data.size() && data.get(rci) < data.get(mini)) {
                mini = rci;
            }

            if (mini != i) {
                swap(i, mini);
                downheapify(mini);
            }
        }

        public int peek() {
            // write your code here
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }

        void swap(int i, int j) {
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
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
}*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class Main {

    public static class MyPriorityQueue<T> {
        ArrayList<T> data;
        Comparator cmptr;

        public MyPriorityQueue() {
            data = new ArrayList<>();
            cmptr = null;
        }

        public MyPriorityQueue(Comparator cmptr) {
            data = new ArrayList<>();
            this.cmptr = cmptr;
        }

        public void add(T val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        void upheapify(int i) {
            if (i == 0) {
                return;
            }

            int pi = i / 2 - 1;
            if (isSmaller(i, pi) == true) {
                swap(pi, i);
                upheapify(pi);
            }
        }

        public T remove() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }

            swap(0, data.size() - 1);
            T val = data.remove(data.size() - 1);

            downheapify(0);

            return val;
        }

        void downheapify(int i) {
            int mini = i;

            int lci = 2 * i + 1;
            if (lci < data.size() && isSmaller(lci, mini) == true) {
                mini = lci;
            }

            int rci = 2 * i + 2;
            if (rci < data.size() && isSmaller(rci, mini) == true) {
                mini = rci;
            }

            if (mini != i) {
                swap(i, mini);
                downheapify(mini);
            }
        }

        public T peek() {
            // write your code here
            if (data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }

        void swap(int i, int j) {
            T ith = data.get(i);
            T jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);
        }

        boolean isSmaller(int i, int j) {
            T ith = data.get(i);
            T jth = data.get(j);

            if (cmptr != null) {
                if (cmptr.compare(ith, jth) < 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                Comparable cith = (Comparable) ith;
                Comparable cjth = (Comparable) jth;
                if (cith.compareTo(cjth) < 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

    static class Student implements Comparable<Student> {
        String name;
        int ht;
        int wt;
        int marks;

        Student(String name, int ht, int wt, int marks) {
            this.name = name;
            this.ht = ht;
            this.wt = wt;
            this.marks = marks;
        }

        public String toString() {
            return this.name + "-> " + this.ht + "," + this.wt + ", " + this.marks;
        }

        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
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
            return s1.marks - s2.marks;
        }
    }

    public static void main(String[] args) throws Exception {
        Student[] students = new Student[5];
        students[0] = new Student("Amit", 180, 75, 90);
        students[1] = new Student("Sumit", 150, 85, 33);
        students[2] = new Student("Neha", 185, 72, 99);
        students[3] = new Student("Kunal", 165, 65, 75);
        students[4] = new Student("Aryan", 177, 55, 88);

        MyPriorityQueue<Student> pq = new MyPriorityQueue<>();
        MyPriorityQueue<Student> pqHt = new MyPriorityQueue<>(new StudentHeightComparator());
        MyPriorityQueue<Student> pqWt = new MyPriorityQueue<>(new StudentWeightComparator());
        MyPriorityQueue<Student> pqMarks = new MyPriorityQueue<>(new StudentMarksComparator());
        for (Student student : students) {
            pq.add(student);
            pqHt.add(student);
            pqWt.add(student);
            pqMarks.add(student);
        }

        System.out.println("On the basis of name");
        while (pq.size() > 0) {
            Student student = pq.peek();
            pq.remove();
            System.out.println(student);
        }

        System.out.println("On the basis of height");
        while (pqHt.size() > 0) {
            Student student = pqHt.peek();
            pqHt.remove();
            System.out.println(student);
        }

        System.out.println("On the basis of weight");
        while (pqWt.size() > 0) {
            Student student = pqWt.peek();
            pqWt.remove();
            System.out.println(student);
        }

        System.out.println("On the basis of marks");
        while (pqMarks.size() > 0) {
            Student student = pqMarks.peek();
            pqMarks.remove();
            System.out.println(student);
        }
    }
}