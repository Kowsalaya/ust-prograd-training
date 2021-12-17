package Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
    public static void main(String[] args)
    {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("banana");
        linkedList.add("kiwi");
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("kiwi"));
        LinkedList<String> linkedList1 = new LinkedList<>(List.of("mango","pineapple","grapes"));
        linkedList.addAll(2,linkedList1);
        System.out.println(linkedList);
        linkedList.addFirst("green apple");
        System.out.println(linkedList);
        linkedList.addLast("Avocado");
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        //getFirst and element and peak are same
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.element());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.contains("orange"));
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.pollLast());
        System.out.println((linkedList));
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        linkedList.push("Fig");
        System.out.println(linkedList);
        System.out.println(linkedList.remove());
        System.out.println(linkedList);
        System.out.println(linkedList.remove("banana"));
        System.out.println(linkedList.remove("apple"));
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
        System.out.println(linkedList.removeAll(linkedList));
        System.out.println(linkedList);
        System.out.println(linkedList.retainAll(linkedList1));
        System.out.println(linkedList1);
        System.out.println(linkedList1.size());
        System.out.println(linkedList1.clone());
        linkedList1.clear();
        System.out.println(linkedList1);
    }
}
