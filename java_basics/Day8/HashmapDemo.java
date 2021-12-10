import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(01,"UST");
        hashMap.put(02,"Prograd");
        hashMap.put(03,"Google");
        hashMap.put(04,"Microsoft");
        hashMap.putIfAbsent(05,"Capgemini");
        hashMap.putIfAbsent(03,"L&T Tech");
        System.out.println(hashMap);
        System.out.println(hashMap.get(05));
        System.out.println(hashMap.remove(04));
        System.out.println(hashMap);
        System.out.println(hashMap.remove(05, "Capgemini"));
        System.out.println(hashMap);
        hashMap.put(04,"Microsoft");
        hashMap.putIfAbsent(05,"Capgemini");
        System.out.println(hashMap);
        Set set=hashMap.entrySet();
        for (Object o : set) {
            HashMap.Entry<Integer, String> entry = (HashMap.Entry) o;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
