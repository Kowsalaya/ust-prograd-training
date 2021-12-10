package Collections;

import java.util.*;
class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.add("Java");
        l.add(1);
        l.add(null);
        l.add("Prograd");
        System.out.println(l);
        l.set(0,"software");
        System.out.println(l);
        l.set(0,"Collection");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("UST");
        System.out.println(l);
    }
}