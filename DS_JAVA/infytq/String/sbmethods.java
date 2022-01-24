import java.io.*;
import java.util.*;

public class sbmethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.length());

        char c = sb.charAt(0);

        System.out.println(c);

        sb.setCharAt(0, 'b');

        System.out.println(sb);

        sb.append("fjiodj49458457*/-");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.delete(5, 10);
        System.out.println(sb);

        sb.replace(5, 11, "12345");
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);

    }
}
