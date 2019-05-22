package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = this.width = length;
    }

    public void setWidth(double width) {
        this.length = this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }
}
