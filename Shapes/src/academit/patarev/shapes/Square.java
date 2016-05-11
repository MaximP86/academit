package academit.patarev.shapes;

/**
 * Created by 1 on 08.05.2016.
 */
public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getWidth() {
        return sideLength;
    }

    public double getHeight() {
        return sideLength;
    }

    public double getArea() {
        return Math.pow(sideLength, 2);
    }
}


