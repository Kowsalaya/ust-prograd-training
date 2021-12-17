import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<>(List.of("Apple","Orange","Mango","Kiwi","Banana","Avacado"));
        System.out.println(fruits);
        fruits.stream().skip(2);
        fruits.stream().forEach(System.out::println);
        fruits.stream().sorted().forEach(System.out::println);
        fruits.stream().filter(f->f.startsWith("A")).forEach(System.out::println);
        fruits.stream().findFirst().ifPresent(System.out::println);
        System.out.println(fruits.stream().count());
        System.out.println(fruits.stream().findAny());
        fruits.stream().sequential().forEach(System.out::println);
    }
}
