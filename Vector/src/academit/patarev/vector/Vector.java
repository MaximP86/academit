package academit.patarev.vector;

import java.util.Arrays;

/**
 * Created by 1 on 31.05.2016.
 */
public class Vector {
    private double[] a;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Неверная размерность вектора");
        }
        n = a.length;
        for (int i = 0; i <= n; ++i) {
            a[i] = 0;
        }
    }

    public Vector(Vector copy) {
        this.a = copy.a;
    }

    public Vector(int n, double[] b) {
        if (b.length < n) {
            for (int i = 0; i <= b.length; ++i) {
                a[i] = b[i];
            }
            for (int i = b.length + 1; i <= n; ++i) {
                a[i] = 0;
            }
        }
        for (int i = 0; i <= n; ++i) {
            a[i] = b[i];
        }
    }

    public int getSize() {
        return a.length;
    }

    public String toString() {
        return Arrays.toString(a);
    }

    public double[] getAddition(double[] x, double[] y) {
        if (x.length > y.length) {
            double[] c = new double[x.length];
            for (int i = 0; i <= x.length; ++i) {
                c[i] = x[i] + y[i];
            }
            return c;
        }
        double[] c = new double[y.length];
        for (int i = 0; i <= y.length; ++i) {
            c[i] = y[i] + x[i];
        }
        return c;
    }
}
