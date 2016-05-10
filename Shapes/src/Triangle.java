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
        double xMin;
        if ((x1 < x2) && (x1 < x3)) {
            xMin = x1;
        } else if ((x2 < x1) && (x2 < x3)) {
            xMin = x2;
        } else {
            xMin = x3;
        }
        double xMax;
        if ((x1 > x2) && (x1 > x3)) {
            xMax = x1;
        } else if ((x2 > x1) && (x2 > x3)) {
            xMax = x2;
        } else {
            xMax = x3;
        }
        return xMax - xMin;
    }

    public double getHeight() {
        double yMin;
        if ((y1 < y2) && (y1 < y3)) {
            yMin = y1;
        } else if ((y2 < y1) && (y2 < y3)) {
            yMin = y2;
        } else {
            yMin = y3;
        }
        double yMax;
        if ((y1 > y2) && (y1 > y3)) {
            yMax = y1;
        } else if ((y2 > y1) && (y2 > y3)) {
            yMax = y2;
        } else {
            yMax = y3;
        }
        return yMax - yMin;
    }

    public double getArea() {
        double sideALength = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double sideBLength = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double sideCLength = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double halfPerimeter = (sideALength + sideBLength + sideCLength) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - sideALength) * (halfPerimeter - sideBLength) * (halfPerimeter - sideCLength));
    }
}
