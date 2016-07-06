package academit.patarev.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 1 on 02.07.2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class multiply = Class.forName("academit.patarev.reflection.Multiply");
        Constructor ctor1 = multiply.getConstructor(int.class, int.class);
        Object first = ctor1.newInstance(8,9);

        Class triangleSquare = Class.forName("academit.patarev.reflection.TriangleSquare");
        Constructor ctor2 = triangleSquare.getConstructor(double.class, double.class);
        Object second = ctor2.newInstance(5.5, 9.3);

        Field f1 = multiply.getDeclaredField("x");
        Field f2 = multiply.getDeclaredField("y");
        Method m = multiply.getMethod("result");

        f1.setAccessible(true);
        f2.setAccessible(true);

        f1.setInt(first, 5);
        f2.setInt(first, 7);

        System.out.println(f1.getInt(first));
        System.out.println(f2.getInt(first));
    }
}
