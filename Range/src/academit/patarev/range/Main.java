package academit.patarev.range;

import academit.patarev.range.*;

/**
 * Created by 1 on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Range r1 = new Range(3.0, 7.0);
        System.out.println("Длина диапазона: " + r1.getLength());
        System.out.println(r1.isInside(2.0));
    }
}
