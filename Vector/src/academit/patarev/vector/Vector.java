package academit.patarev.vector;

import java.util.Arrays;

/**
 * Created by 1 on 31.05.2016.
 */
public class Vector {
    private double[] array;

    public Vector(int n) {
        array = new double[n];
        if (n <= 0) {
            throw new IllegalArgumentException("Неверная размерность вектора");
        }
    }

    public Vector(double[] b) {
        array = new double[b.length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = b[i];
        }
    }

    public Vector(int n, double[] b) {
        array = new double[n];
        for (int i = 0; i <= n; ++i) {
            array[i] = b[i];
        }
    }

    public int getSize() {
        return array.length;
    }

    public String toString() {
        return Arrays.toString(array);
    }

    public Vector getAddition(double[] x) {
        if (x.length > this.array.length) {
            this.array = new double[x.length];
            for (int i = 0; i <= x.length - 1; ++i) {
                this.array[i] = x[i] + this.array[i];
            }
            return this;

        }
        return this;
    }

    public Vector getMultiplication(double n) {
        for (int i = 0; i <= this.array.length - 1; ++i) {
            this.array[i] = this.array[i] * n;
        }
        return this;
    }
}
