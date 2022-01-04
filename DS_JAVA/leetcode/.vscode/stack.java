import java.util.*;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        int i = stack.pop();
        System.out.println(i);
    }
}