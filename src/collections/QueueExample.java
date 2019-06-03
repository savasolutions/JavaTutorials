package collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue que=new PriorityQueue();
        Queue q=new ArrayDeque();
        que.add(67);
        que.add(34);
        que.add(98);
        que.add(25);
        que.add(56);
        System.out.println("Head of the queue");
        if(!que.isEmpty())
        {
            System.out.println(que.peek()); //retrieves, does not remove, null if isEmpty
        }
        System.out.println("Deleted elements of the queue");
        while(!que.isEmpty())
        {
            System.out.println(que.poll()); //retrieves and remove the head, null if empty
        }
    }
}
