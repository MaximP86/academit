/**
 * Created by 1 on 08.05.2016.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getWidth() {

        return radius;
    }

    public double getHeight() {

        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
