public class Rectangle {
    private double length,breadth;
    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public double area() {
        if(breadth<1) {
            throw new IllegalArgumentException("Breadth value must be greater than zero");
        }
        if(length<1) {
            throw new IllegalArgumentException("Length value must be greater than zero");
        }
        return length*breadth;
    }
    public double perimeter() {
        if(breadth==0 && length==0) {
            throw new IllegalArgumentException("Length and Breadth value must be greater than zero");
        }
        return 2*(length+breadth);
    }
}
