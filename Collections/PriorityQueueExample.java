package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {


    public static void main(String[] args) {
        Queue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade - o2.grade;
            }
        });
        pq.offer(new Student("Garima", 'B'));
        pq.offer(new Student("Kartik", 'C'));
        pq.offer(new Student("Kajal", 'D'));
        pq.offer(new Student());
        Utility.printCollection(pq);
        System.out.println("Polling out of the queue " + pq.size());

        while(pq.size() > 0){
            System.out.println(pq.poll());
        }
    }
}
