import java.io.*;
import java.util.*;

public class DB1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (s.size() > 0 && s.peek() == '(') {
                    System.out.println("true");
                    return;
                } else {
                    while (s.size() > 0 && s.peek() != '(') {
                        s.pop();
                    }
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }

        System.out.println(false);

    }

}