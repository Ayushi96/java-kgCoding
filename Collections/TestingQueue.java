package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        // left is the interfact and right is the implementation
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.offer(2);
        Utility.printCollection(q);
        System.out.println(q.peek());
        System.out.println(q.element());

    }
}
