interface Addable {
    public  int addition(int a,int b);
}
interface Sub {
    public  int subt(int a,int b);
}
interface Mul {
    public  int mulp(int a,int b);
}

public class Interface {
    public static void main(String[] args) {

        Addable add=(int a,int b)->{
            return (a+b);
        };
        int sum = add.addition(10,20);
        System.out.println(sum);
        Sub sub=(int a,int b)->{
            return (a-b);
        };
        int subb = sub.subt(10,20);
        System.out.println(subb);
        Mul mupl=(int a,int b)->{
            return (a*b);
        };
        int multi = mupl.mulp(10, 20);
        System.out.println(multi);
    }

}
