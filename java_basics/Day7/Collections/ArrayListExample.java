package Collections;

import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);
    }
}