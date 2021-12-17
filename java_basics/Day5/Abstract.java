abstract  class Fruits {
    abstract void name();
    abstract void colour();
}
class Apple extends Fruits {
    void name() {
        System.out.println("Apple");
    }
    void colour() {
        System.out.println("Red");
    }
}
class Orange extends Fruits {
    void name() {
        System.out.println("Orange");
    }
    void colour() {
        System.out.println("Orange");
    }
}
class Kiwi extends Fruits {
    void name() {
        System.out.println("Kiwi");
    }
    void colour() {
        System.out.println("Green");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Apple apple=new Apple();
        Orange orange=new Orange();
        Kiwi kiwi=new Kiwi();
        apple.name();
        apple.colour();
        orange.name();
        orange.colour();
        kiwi.name();
        kiwi.colour();

    }
}