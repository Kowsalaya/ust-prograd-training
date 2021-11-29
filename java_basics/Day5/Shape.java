interface Shapes {
    void area(int r);
}
interface Circle extends Shapes {
    void volume(int h);
}
class Cylinder implements Circle {
    void area(int r) {
        System.out.println(Math.PI*r*r);
    }
    void (int h) {
        System.out.println(area()*h);
    }
}
class Shape {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.area(2);
        c.volume(5);
    }
}

