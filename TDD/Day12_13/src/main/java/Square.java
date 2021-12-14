class Square extends Rectangle {
    Square(double side) {
        super(side,side);
    }
}



/*
***Without implementing Inheritance concept***
class Square {
   public double side;
   Square(double side) {
       if (side <= 0) {
           throw new IllegalArgumentException("Value of side cannot be less than one");
       } else {
           this.side = side;
       }
   }
   public double area() {
       return side*side;
   }
   public double perimeter() {
       return 4*side;
   }
}
*/