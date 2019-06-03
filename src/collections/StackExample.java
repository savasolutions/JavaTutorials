package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(89);
        s.push(45);
        s.push(23);
        s.push(100);
        System.out.println("To print stack elements");
        for (int i:s)
        {
            System.out.println(i);
        }
        System.out.println("Element popped out is:");
        if(!s.isEmpty())
        {
            Integer i=s.pop();
            System.out.println(i);

        }
    }
}
