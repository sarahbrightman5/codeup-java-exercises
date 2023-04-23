package shapes;

abstract public class Quadrilateral extends Shape{
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
