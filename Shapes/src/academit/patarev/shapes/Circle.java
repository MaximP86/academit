package academit.patarev.shapes;

/**
 * Created by 1 on 08.05.2016.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return radius * 2;
    }
    public double getHeight() {
        return radius * 2;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
