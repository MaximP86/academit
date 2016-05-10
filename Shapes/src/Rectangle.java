/**
 * Created by 1 on 10.05.2016.
 */
public class Rectangle extends Shape {
    private double horizontalSideLength;
    private double verticalSideLength;

    public Rectangle(double horizontalSideLength, double verticalSideLength) {
        this.horizontalSideLength = horizontalSideLength;
        this.verticalSideLength = verticalSideLength;
    }

    public double getWidth() {

        return horizontalSideLength;
    }

    public double getHeight() {

        return verticalSideLength;
    }

    public double getArea() {

        return horizontalSideLength * verticalSideLength;
    }
}
