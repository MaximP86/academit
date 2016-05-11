package academit.patarev.example;

import academit.patarev.shapes.*;

/**
 * Created by 1 on 10.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.2);
        System.out.println(s1.getWidth());
        System.out.println(s1.getHeight());
        System.out.println(s1.getArea());

        Shape s2 = new Square(4.3);
        System.out.println(s2.getWidth());
        System.out.println(s2.getHeight());
        System.out.println(s2.getArea());

        Shape s3 = new Rectangle(3.1, 6.1);
        System.out.println(s3.getWidth());
        System.out.println(s3.getHeight());
        System.out.println(s3.getArea());

        Shape s4 = new Triangle(4, 2, 5, 7, 9, 4);
        System.out.println(s4.getWidth());
        System.out.println(s4.getHeight());
        System.out.println(s4.getArea());
    }
}



