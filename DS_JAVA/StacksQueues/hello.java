import java.io.*;
import java.util.*;

public class hello {

    public static class student {
        String name;
        int rollno;

        student(String name, int rollno) {
            this.name = name;
            this.rollno = rollno;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getname() {
            return this.name;
        }

    }

    public static void main(String[] args) {
        student s1 = new student("Rahul", 58);

    }
}
