import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by 1 on 02.07.2016.
 */
public class Rectangle {
    private double width;
    private double height;
    private transient double area;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public double getArea() {
        return area;
    }

    private void readObject (ObjectInputStream in)
        throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        area = width * height;
    }
}
