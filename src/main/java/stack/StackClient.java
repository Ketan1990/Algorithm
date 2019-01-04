package stack;

import java.util.Stack;

public class StackClient {
    public static void main(String[] args) {
        StackImplJava a = new StackImplJava();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);
        System.out.println(a.pop());

        StackImplJava<String> ops = new StackImplJava<String>();
        StackImplJava<Double> vals = new StackImplJava<Double>();

        int n = 50;

        System.out.println(6 % 2);

        Stack<Integer> stack = new Stack<Integer>();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        for (int digit : stack) {
            System.out.println(digit);
        }

    }
}










