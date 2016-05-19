package academit.patarev.range;

import academit.patarev.range.*;

/**
 * Created by 1 on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Range r1 = new Range(3, 7);
        System.out.println("Длина диапазона: " + r1.getRangeLength());
        r1.isInside(4);
    }
}
