package academit.patarev.vector;

import java.util.Arrays;

/**
 * Created by 1 on 31.05.2016.
 */
public class Vector {
    private double[] array;

    public Vector(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Неверная размерность вектора");
        }
        array = new double[n];
    }

    public Vector(double[] b) {
        array = new double[b.length];
        System.arraycopy(b, 0, this.array, 0, b.length);
    }

    public Vector(int n, double[] b) {
        array = new double[n];
        if (n >= b.length) {
            System.arraycopy(b, 0, this.array, 0, n);
        } else {
            System.arraycopy(b, 0, this.array, 0, b.length);
        }
    }

    public int getSize() {
        return array.length;
    }

    public String toString() {
        return Arrays.toString(array);
    }

    public Vector add(double[] x) {
        if (x.length > this.array.length) {
            double[] k = this.array;
            this.array = new double[x.length];
            System.arraycopy(this.array, 0, k, 0, x.length);


            for (int i = 0; i <= k.length - 1; ++i) {
                this.array[i] = x[i] + k[i];
            }
            return this;

        }
        return this;
    }

    public Vector Multiply(double n) {
        for (int i = 0; i <= this.array.length - 1; ++i) {
            this.array[i] = this.array[i] * n;
        }
        return this;
    }
}
