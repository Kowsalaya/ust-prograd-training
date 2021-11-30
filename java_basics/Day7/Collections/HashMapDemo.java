package Collections;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;

public class HashMapDemo {
    public static void main(String[] args) {
        HashSet <Integer> hs= new HashSet<>();
        hs.add(10);
        ArrayDeque<Integer> hs1 = new ArrayDeque<>(List.of(9, 4, 56, 78, 38, 30, 20, 10));
        hs.addAll(hs1);
        System.out.println(hs);
        System.out.println(hs.contains(56));
        System.out.println(hs.contains(95));
        System.out.println(hs.getClass());
        System.out.println(hs.hashCode());
        System.out.println(hs.isEmpty());
        hs.remove(30);
        System.out.println(hs);
        hs.remove(38);
        System.out.println(hs.retainAll(hs1));
        System.out.println(hs.retainAll(hs));
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);
    }
}
