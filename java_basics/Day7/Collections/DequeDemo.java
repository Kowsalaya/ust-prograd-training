package Collections;

import java.util.ArrayDeque;
import java.util.List;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.addFirst(16);
        dq.addLast(25);
        ArrayDeque<Integer> dq1 = new ArrayDeque<>(List.of(9, 4, 56, 78, 38, 30, 20, 10));
        dq.addAll(dq1);
        System.out.println(dq);
        System.out.println(dq.contains(56));
        System.out.println(dq.contains(95));
        System.out.println(dq.element());
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.getClass());
        System.out.println(dq.hashCode());
        System.out.println(dq.isEmpty());
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.pop());
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.remove(38);
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.retainAll(dq1));
        System.out.println(dq.retainAll(dq));
        System.out.println(dq.size());
        dq.clear();
        System.out.println(dq);
    }
}
