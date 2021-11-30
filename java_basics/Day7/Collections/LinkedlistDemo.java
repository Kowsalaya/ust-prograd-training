import java.util.LinkedList;
public class LinkedlistDemo {
    public static void main(String[] args)
    {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("banana");
        linkedList.add("kiwi");
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("apple"));
        linkedList.remove("apple");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.addLast("Pineapple");
        System.out.println(linkedList);
    }
}
