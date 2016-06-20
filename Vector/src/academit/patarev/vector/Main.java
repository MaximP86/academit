package academit.patarev.vector;

import academit.patarev.vector.*;

import java.util.Arrays;

/**
 * Created by 1 on 17.04.2016.
 */

public class Main {
    public static void main(String[] args) {
        double[] a = {2.9, 4.9, 5.9} ;
        double[] b = {3.9, 4.5, 5.7, 7.9} ;
        Vector v1 = new Vector(a);
        System.out.println(v1.getSize());
        System.out.println(v1.toString());
        System.out.println((v1.getAddition(b)).toString());
    }
}
