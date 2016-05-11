package academit.patarev.shapes;

/**
 * Created by 1 on 10.05.2016.
 */
public class Triangle extends Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    public static double getLength(double firstX, double secondX, double firstY, double secondY) {
        return Math.sqrt(Math.pow((firstX - secondX), 2) + Math.pow((firstY - secondY), 2));
    }

    public double getArea() {
        double sideALength = getLength(x1, x2, y1, y2);
        double sideBLength = getLength(x2, x3, y2, y3);
        double sideCLength = getLength(x3, x1, y3, y1);
        double halfPerimeter = (sideALength + sideBLength + sideCLength) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideALength) * (halfPerimeter - sideBLength) * (halfPerimeter - sideCLength));
    }
}
