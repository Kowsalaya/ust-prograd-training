interface Addable {
    public int add(int a,int b);
}
interface Sub {
    public int sub(int a,int b);
}
interface Mul {
    public int mul(int a,int b);
}
public class Main {
    public static void main(String[] args) {
        Addable addable=(int a,int b)->{ return (a+b); }
        System.out.println(addable.add(10,5));
        Sub sub=(int a,int b)->{ return (a-b); }
        System.out.println(Sub.sub(10,5));
        Mul mul=(int a,int b)->{ return (a*b); }
        System.out.println(Mul.mul(10,5));
    }
}
