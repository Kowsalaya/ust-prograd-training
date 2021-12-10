package Collections;

import java.util.*;
class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("One");
        deque.addFirst("Two");
        deque.addLast("Three");
        deque.push("Four");
        deque.offer("Five");
        deque.offerFirst("Six");
        deque.offerLast("Seven");
        System.out.print(deque + " ");
        System.out.println("\n\nDeque Peek:" + deque.peek());
        System.out.println("\nDeque,After peek:" + deque);
        System.out.println("\nDeque Pop:" + deque.pop());
        System.out.println("\nDeque,After pop:" + deque);
        System.out.println("\nDeque Contains Three: " +  deque.contains("Three"));

        deque.removeFirst();
        deque.removeLast();
        System.out.println("\nDeque, after removing "  + "first and last elements: " + deque);
    }
}