package Collections;

import java.time.MonthDay;
import java.util.List;
import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<String> week = new Stack<>();
        week.add("Sunday");
        week.add(1,"Monday");
        week.add(2,"Tuesday");
        week.push("Wednesday");
        week.push("Thursday");
        week.push("Friday");
        week.push("Saturday");
        System.out.println(week);
        System.out.println(week.empty());
        System.out.println(week.isEmpty());
        System.out.println(week.firstElement());
        System.out.println(week.lastElement());
        System.out.println(week.get(4));
        System.out.println(week.hashCode());
        System.out.println(week.indexOf("Tuesday"));
        System.out.println(week.iterator());
        System.out.println(week.getClass());
        System.out.println(week.capacity());
        System.out.println(week.contains("Friday"));
        System.out.println(week.contains("December"));
        System.out.println(week.peek());
        System.out.println(week.pop());
        System.out.println(week);
        System.out.println(week.remove("Monday"));
        System.out.println(week);
        System.out.println(week.remove(3));
        System.out.println(week);
        System.out.println(week.size());
        System.out.println(week.search("Wednesday"));
        System.out.println(week.clone());
        week.clear();
        System.out.println(week);
    }
}
