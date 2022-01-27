import java.io.*;
import java.util.*;

public class rotation {
    public static void main(String[] args) {
        String s1 = "ABCDl";
        String s2 = "CDABo";

        char ch = s1.charAt(0);

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ch) {
                s.push(i);
            }
        }

        int id = s.pop();
        int l = s1.length();

        for (int i = 0; i < l; i++) {
            if (s1.charAt(i) != s2.charAt((id + i) % l)) {
                System.out.println("Not Rotational");
                return;
            }
        }

        System.out.println("Rotational...");

    }
}