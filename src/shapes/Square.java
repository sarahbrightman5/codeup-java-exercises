package shapes;

public class Square extends Quadrilateral implements Measurable{
    public Square(double length, double width) {
        super(length, width);
    }
    public double getPerimeter() {
        return 4* length;
    }
    public double getArea() {
        return Math.pow(length,length);
    }

//    public Square(double side) {
//        super (side,side);
//    }
//    public double getArea(){
//        return Math.pow(length,2);
//    }
//    public double getPerimeter(){
//        return Math.pow(length,2);
//    }
}
