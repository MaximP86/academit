package academit.patarev.reflection;

/**
 * Created by 1 on 02.07.2016.
 */

public class TriangleSquare {
    private double side;
    private double height;

    public TriangleSquare (double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSquare() {
        return (side * height) / 2;
    }
}
