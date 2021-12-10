package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        ArrayList<Integer> pq1 = new ArrayList<>(List.of(9, 4, 56, 78, 38, 30, 20, 10));
        pq.addAll(pq1);
        System.out.println(pq);
        System.out.println(pq.contains(56));
        System.out.println(pq.contains(95));
        System.out.println(pq.element());
        System.out.println(pq.getClass());
        System.out.println(pq.hashCode());
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq);
        pq.remove(38);
        System.out.println(pq);
        System.out.println(pq.retainAll(pq1));
        System.out.println(pq.retainAll(pq));
        System.out.println(pq.size());
        pq.clear();
        System.out.println(pq);
    }
}
