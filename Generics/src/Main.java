/**
 * Created by 1 on 23.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pair<Double, String> pair1 = new Pair<>(2.5, "ABCdef");
        Pair<Double, String> pair2 = new Pair<>(8.6, "ABCdef");
        Pair<Double, String> pair3 = new Pair<>(8.6, "ABCdef");

        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        System.out.println(pair3.toString());

        boolean result1 = Util.compare(pair1, pair2);
        boolean result2 = Util.compare(pair2, pair3);

        System.out.println(result1);
        System.out.println(result2);;
    }
}
